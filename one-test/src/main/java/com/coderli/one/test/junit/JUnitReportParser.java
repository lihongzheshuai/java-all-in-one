package com.coderli.one.test.junit;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class JUnitReportParser {

    public static void main(String[] args) {
        String reportFilePath = "D:\\MyCode\\java-all-in-one\\one-test\\build\\test-results\\test/TEST-com.coderli.one.test.jacoco.CalculatorTest.xml"; // 替换为实际文件路径
        parseJUnitReport(reportFilePath);
    }

    public static void parseJUnitReport(String reportFilePath) {
        try {
            File reportFile = new File(reportFilePath);
            if (!reportFile.exists()) {
                System.out.println("Report file does not exist: " + reportFilePath);
                return;
            }

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(reportFile);

            // 标准化XML结构
            doc.getDocumentElement().normalize();

            // 获取测试套件信息
            NodeList testSuites = doc.getElementsByTagName("testsuite");
            for (int i = 0; i < testSuites.getLength(); i++) {
                Element testSuite = (Element) testSuites.item(i);

                String suiteName = testSuite.getAttribute("name");
                String tests = testSuite.getAttribute("tests");
                String failures = testSuite.getAttribute("failures");
                String errors = testSuite.getAttribute("errors");
                String skipped = testSuite.getAttribute("skipped");
                String time = testSuite.getAttribute("time");

                System.out.printf("Test Suite: %s, Tests: %s, Failures: %s, Errors: %s, Skipped: %s, Time: %ss%n",
                        suiteName, tests, failures, errors, skipped, time);

                // 获取每个测试用例的信息
                NodeList testCases = testSuite.getElementsByTagName("testcase");
                for (int j = 0; j < testCases.getLength(); j++) {
                    Element testCase = (Element) testCases.item(j);

                    String testName = testCase.getAttribute("name");
                    String testTime = testCase.getAttribute("time");
                    String testClass = testCase.getAttribute("classname");

                    System.out.printf("  Test Case: %s, Class: %s, Time: %ss", testName, testClass, testTime);

                    // 检查测试是否失败
                    NodeList failureNodes = testCase.getElementsByTagName("failure");
                    if (failureNodes.getLength() > 0) {
                        Element failure = (Element) failureNodes.item(0);
                        String failureMessage = failure.getAttribute("message");
                        String failureType = failure.getAttribute("type");
                        System.out.printf("  -> Failure: %s, Type: %s%n", failureMessage, failureType);
                    } else {
                        System.out.println("  -> Passed");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

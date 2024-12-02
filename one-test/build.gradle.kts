plugins {
    id("jacoco")  // 配置 JaCoCo 插件版本
}

jacoco {
    toolVersion = "0.8.12"  // 可以指定 JaCoCo 工具版本，通常和插件版本相同
}

dependencies {
    // JUnit 5 的 API 和运行时依赖
    testImplementation(platform("org.junit:junit-bom:${rootProject.ext["junitVersion"]}"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)  // 确保在运行测试之后生成报告
    reports {
        xml.required.set(true)  // 启用 XML 格式报告
        html.required.set(true)  // 如果不需要 HTML 格式报告，可以禁用
    }
}

tasks.jacocoTestCoverageVerification {
    dependsOn(tasks.jacocoTestReport)
    violationRules {
        rule {
            limit {
                counter = "CLASS"
                value = "COVEREDRATIO"
                minimum = "0.80".toBigDecimal()  // 设置类级别的覆盖率阈值
            }
        }
        rule {
            limit {
                counter = "METHOD"
                value = "COVEREDRATIO"
                minimum = "0.80".toBigDecimal()  // 设置方法级别的覆盖率阈值
            }
        }
        rule {
            limit {
                counter = "LINE"
                value = "COVEREDRATIO"
                minimum = "0.80".toBigDecimal()  // 设置行级别的覆盖率阈值
            }
        }
    }
}
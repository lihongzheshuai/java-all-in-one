dependencies {
    // JUnit 5 的 API 和运行时依赖
    testImplementation(platform("org.junit:junit-bom:${rootProject.ext["junitVersion"]}"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

//testing {
//    suites {
//        val test by getting(JvmTestSuite::class) {
//            useJUnitJupiter() // 使用JUnit Jupiter作为测试框架
//
//            dependencies {
//                implementation("org.junit.jupiter:junit-jupiter-api:${rootProject.ext["junitVersion"]}")
//                runtimeOnly("org.junit.jupiter:junit-jupiter-engine:${rootProject.ext["junitVersion"]}")
//            }
//        }
//    }
//}
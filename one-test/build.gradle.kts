dependencies {
    // JUnit 5 的 API 和运行时依赖
    testImplementation(platform("org.junit:junit-bom:${rootProject.ext["junitVersion"]}"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}
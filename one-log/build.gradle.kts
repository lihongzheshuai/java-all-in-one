dependencies {
    implementation("org.slf4j:slf4j-api:${rootProject.ext["slf4jVersion"]}")
    implementation("org.apache.logging.log4j:log4j-api:${rootProject.ext["log4j2Version"]}")
    implementation("org.apache.logging.log4j:log4j-core:${rootProject.ext["log4j2Version"]}")
    implementation("org.apache.logging.log4j:log4j-slf4j2-impl:${rootProject.ext["log4j2Version"]}")
}

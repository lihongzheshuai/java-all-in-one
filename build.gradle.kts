plugins {
    id("java")
}

group = "com.coderli"
version = "0.1"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    maven("https://mirrors.cloud.tencent.com/nexus/repository/maven-public/")
    mavenCentral()
}

dependencies {
    implementation("org.slf4j:slf4j-api:2.0.16")
}
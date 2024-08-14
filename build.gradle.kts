plugins {
    id("java")
}

allprojects {
    group = "com.coderli"
    version = "0.1"
}

subprojects {

    apply(plugin = "java")

    dependencies {
        implementation("org.slf4j:slf4j-api:2.0.16")
        implementation("ch.qos.logback:logback-classic:1.5.6")
    }

    repositories {
        maven("https://maven.aliyun.com/repository/public")
        maven("https://mirrors.cloud.tencent.com/nexus/repository/maven-public/")
        mavenCentral()
    }

}
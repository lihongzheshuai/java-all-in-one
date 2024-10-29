plugins {
    id("java")
    id("idea")
}

allprojects {
    group = "com.coderli"
    version = "0.1"

    ext["log4j2Version"] = "2.23.1"
    ext["slf4jVersion"] = "2.0.16"
    ext["jacocoVersion"] = "0.8.12"
}

subprojects {

    apply(plugin = "java")
    apply(plugin = "idea")

    idea {
        module {
            isDownloadSources = true // 下载源码
            isDownloadJavadoc = true // 下载 Javadoc
        }
    }

    repositories {
        maven("https://maven.aliyun.com/repository/public")
        maven("https://mirrors.cloud.tencent.com/nexus/repository/maven-public/")
        mavenCentral()
    }

}
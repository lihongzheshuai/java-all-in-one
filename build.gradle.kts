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
    ext["junitVersion"] = "5.11.3"
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
        maven {
            url = uri("https://106.12.31.244:8000/repo/repository/maven-java-1112/")
            credentials {
                username = project.findProperty("mavenUser") as String? ?: "dlspjys"
                password = project.findProperty("mavenPassword") as String? ?: "AP6wkBbYmtDTUvux8gWj8JQ9QNX"
            }
        }

        maven("https://maven.aliyun.com/repository/public")
        maven("https://mirrors.cloud.tencent.com/nexus/repository/maven-public/")
        mavenCentral()
    }

    tasks.withType<JavaExec> {
        // 设置 Java 进程的编码为 UTF-8
        systemProperty("file.encoding", "UTF-8")
        systemProperty("sun.stdout.encoding", "UTF-8")
        systemProperty("sun.stderr.encoding", "UTF-8")
    }
}
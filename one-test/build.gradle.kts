plugins {
    id("jacoco")
}

jacoco {
    toolVersion = "${rootProject.ext["jacocoVersion"]}"
}


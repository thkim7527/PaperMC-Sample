plugins {
    kotlin("jvm") version "1.6.10"
}

group = "me.thkim7527"
version = "1.0"

repositories {
    mavenCentral()
    maven(url = "https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("io.papermc.paper:paper-api:1.18.1-R0.1-SNAPSHOT")
}

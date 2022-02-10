plugins {
    id 'org.jetbrains.kotlin.jvm' version '1.6.10'
    id 'com.github.johnrengelman.shadow' version '7.0.0'
}

group 'me.thkim7527'

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

repositories {
    mavenCentral()
    maven { url 'https://papermc.io/repo/repository/maven-public/' }
    maven { url 'https://maven.enginehub.org/repo/' }
}

dependencies {
    implementation 'org.jetbrains.kotlin:kotlin-stdlib:1.6.10'
    compileOnly 'io.papermc.paper:paper-api:1.18.1-R0.1-SNAPSHOT'
    compileOnly 'com.sk89q.worldedit:worldedit-bukkit:7.2.8'
}

shadowJar {
    destinationDir new File('C:/Users/thkim7527/Project/Minecraft/Server/PaperMC(1.18.1)/plugins')
    archiveFileName = rootProject.name + '.jar'
}
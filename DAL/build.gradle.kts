plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("junit:junit:4.12")
    testImplementation("org.mockito:mockito-core:3.12.4")

    implementation ("org.hibernate:hibernate-core:5.6.5.Final")
}

tasks.test {
    useJUnit()
}
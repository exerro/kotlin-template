import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    `maven-publish`
}

dependencies {
    implementation(kotlin("stdlib"))
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "me.exerro"
            artifactId = "kotlin-template"
            version = "1.0.0"

            from(components["java"])
        }
    }
}

allprojects {
    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
        kotlinOptions.freeCompilerArgs += "-Xcontext-receivers"
        kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.contracts.ExperimentalContracts"
        kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.time.ExperimentalTime"
        kotlinOptions.freeCompilerArgs += "-language-version"
        kotlinOptions.freeCompilerArgs += "1.7"
    }
}

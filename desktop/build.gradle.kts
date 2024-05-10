plugins {
    alias(libs.plugins.kmm)
    alias(libs.plugins.compose)
}

kotlin {
    jvm("desktop")

    sourceSets {
        val jvmMain = getByName("desktopMain") {
            dependencies {
                implementation(project(":shared"))
            }
        }
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"
    }
}
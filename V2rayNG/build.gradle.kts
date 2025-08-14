plugins {
    // Android Gradle Plugin 8.12 for all modules
    id("com.android.application") version "8.12.0" apply false
    // Kotlin Android Plugin
    id("org.jetbrains.kotlin.android") version "2.1.20" apply false
    // License plugin (optional)
    id("com.jaredsburrows.license") version "0.9.0" apply false
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

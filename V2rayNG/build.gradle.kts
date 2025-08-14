// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    // Do not apply here, just declare
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // License plugin classpath
        classpath(libs.gradle.license.plugin)
    }
}

// Configure plugin repositories for all projects
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

// Dependency resolution for all projects
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

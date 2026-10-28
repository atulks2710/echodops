plugins {
    id("com.android.application")
    id("kotlin-android")

    // Google Services Gradle plugin for Firebase
    id("com.google.gms.google-services")

    // The Flutter Gradle Plugin must be applied after the Android
    // and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.echodops"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    defaultConfig {
        applicationId = "com.example.echodops"
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {
    // Firebase Bill of Materials
    implementation(platform("com.google.firebase:firebase-bom:35.1.0"))

    // Add Firebase SDK dependencies here as needed.
}

flutter {
    source = "../.."
}

plugins {
    id("com.android.application")
}

android {
    namespace = "se.oskar.pokemonsamling"
    compileSdk = 35

    defaultConfig {
        applicationId = "se.oskar.pokemonsamling"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            // Signeras med debug-nyckeln så att APK:n går att installera direkt
            signingConfig = signingConfigs.getByName("debug")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

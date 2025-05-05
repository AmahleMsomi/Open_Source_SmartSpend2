plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "com.example.smartspend"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.smartspend"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }


    dependencies {
        // Core Android
        implementation("androidx.core:core-ktx:1.15.0")
        implementation("androidx.appcompat:appcompat:1.7.0")
        implementation("com.google.android.material:material:1.12.0")
        implementation("androidx.constraintlayout:constraintlayout:2.2.1")

        // Compose BOM (ensures versions are compatible with each other)
        implementation(platform("androidx.compose:compose-bom:2024.02.01"))

        // Compose Core
        implementation("androidx.activity:activity-compose:1.8.2")
        implementation("androidx.compose.ui:ui")
        implementation("androidx.compose.ui:ui-tooling-preview")
        implementation("androidx.compose.material3:material3")
        implementation("androidx.compose.foundation:foundation")
        implementation("androidx.room:room-common-jvm:2.7.1")
        implementation("androidx.room:room-compiler:2.7.1")

        // Optional: Tooling support (debug builds only)
        debugImplementation("androidx.compose.ui:ui-tooling")
        debugImplementation("androidx.compose.ui:ui-test-manifest")

        // Room Database
        implementation("androidx.room:room-runtime:2.6.1")
        kapt("androidx.room:room-compiler:2.6.1")
        implementation("androidx.room:room-ktx:2.6.1")

        // Lifecycle
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
        implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")

        // Coroutines
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

        // Image loading
        implementation("io.coil-kt:coil:2.5.0")
    }


}

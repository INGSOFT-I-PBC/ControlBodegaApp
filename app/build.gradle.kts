plugins {
    id ("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {

    compileSdk = Constants.Android.compileVersion

    defaultConfig {

        applicationId = "com.neoterux.controlbodega"
        minSdk = Constants.Android.minVersion
        targetSdk = Constants.Android.targetVersion
        versionCode = 1
        versionName = "0.3"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary =  true
        }
    }

    buildFeatures {
        dataBinding = true
    }

    buildTypes {
        named("debug") {
            isMinifyEnabled = false
        }
        named("release") {
            isMinifyEnabled = true
            proguardFiles ( getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        dataBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Constants.composeCompilerVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    namespace = "com.neoterux.controlbodega"
}

dependencies {
    with(app.android.Libraries) {
        implementation(androidCore)
        implementation(activityCompose)
        implementation(lifecycle)
        implementation(gson)
        implementation(composePreview)
        implementation(retrofit)
        implementation(appCompat)
        implementation(material)
        implementation(composePreview)
        implementation(appCompat)
        implementation(constraintLayout)
        implementation(drawerLayout)
        implementation(zxing.core)
        implementation(zxing.androidCore)
        implementation(zxing.javase)
        implementation(cameraX)
        implementation(cameraXtensions)
        implementation(cameraXLifecycle)
    }
    // Kapt dependencies
    with(app.android.Libraries.Annotations) {
        kapt(lifecycleCompiler)
    }


    testImplementation(app.android.Libraries.junit)
    androidTestImplementation(app.android.Libraries.androidJunit)
    androidTestImplementation(app.android.Libraries.espresso)
    androidTestImplementation(app.android.Libraries.uiTestJunit)
    debugImplementation(app.android.Libraries.Debug.composeTooling)
    debugImplementation(app.android.Libraries.Debug.composeTestManifest)
}
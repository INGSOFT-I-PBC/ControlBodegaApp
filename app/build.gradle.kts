plugins {
    id ("com.android.application")
    kotlin("android")
}

android {

    compileSdk = Constants.Android.compileVersion

    defaultConfig {

        applicationId = "com.neoterux.controlbodega"
        minSdk = Constants.Android.minVersion
        targetSdk = Constants.Android.targetVersion
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary =  true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Constants.composeCompilerVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(app.android.Libraries.androidCore)
    implementation(app.android.Libraries.activityCompose)
    implementation(app.android.Libraries.composeUI)
    implementation(app.android.Libraries.composeMaterial)
    implementation(app.android.Libraries.lifecycle)
    implementation(app.android.Libraries.gson)
    implementation(app.android.Libraries.composePreview)
    implementation(app.android.Libraries.retrofit)
    implementation(app.android.Libraries.appCompat)
    implementation(app.android.Libraries.material)
    implementation(app.android.Libraries.constraintLayout)
    implementation(app.android.Libraries.drawerLayout)

    testImplementation(app.android.Libraries.junit)
    androidTestImplementation(app.android.Libraries.androidJunit)
    androidTestImplementation(app.android.Libraries.espresso)
    androidTestImplementation(app.android.Libraries.uiTestJunit)
    debugImplementation(app.android.Libraries.Debug.composeTooling)
    debugImplementation(app.android.Libraries.Debug.composeTestManifest)

//    implementation 'androidx.core:core-ktx:1.7.0'
//    implementation "androidx.compose.ui:ui:$compose_version"
//    implementation "androidx.compose.material:material:$compose_version"
//    implementation "androidx.compose.ui:ui-tooling-preview:$compose_version"
//    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.3.1'
//    implementation 'androidx.activity:activity-compose:1.3.1'
//    testImplementation 'junit:junit:4.13.2'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
//    androidTestImplementation "androidx.compose.ui:ui-test-junit4:$compose_version"
//    debugImplementation "androidx.compose.ui:ui-tooling:$compose_version"
//    debugImplementation "androidx.compose.ui:ui-test-manifest:$compose_version"
}
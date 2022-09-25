package app.android

@Suppress("unused")
object Libraries {

    /************************************
     *             Core Deps            *
     ************************************/
    const val androidCore = "androidx.core:core-ktx:${Versions.androidCoreVersion}"
    const val lifecycle = "androidx.lifecycle:lifecycle-common:${Versions.lifecycleVersion}"
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityComposeVersion}"
    const val appCompat = "androidx.appcompat:appcompat:1.5.1"
    const val material = "com.google.android.material:material:1.6.1"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
    const val drawerLayout = "androidx.drawerlayout:drawerlayout:1.1.1"
    const val cameraX = "androidx.camera:camera-camera2:${Versions.cameraX}"
    const val cameraXtensions = "androidx.camera:camera-extensions:${Versions.cameraX}"
    const val cameraXLifecycle = "androidx.camera:camera-lifecycle:${Versions.cameraX}"
    const val databindingKtx = "androidx.databinding:databinding-ktx:${Constants.AGPVersion}"
    const val splashScreenAPI = "androidx.core:core-splashscreen:${Versions.androidXCoreVersion}"


    /***********************************
     *  Android compose deps           *
     ***********************************/
    const val composeUI = "androidx.compose.ui:ui:${Versions.composeVersion}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.composeVersion}"
    const val composePreview = "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"


    /***********************************
     *             Testing             *
     ***********************************/
    const val junit = "junit:junit:${Versions.junitVersion}"
    const val androidJunit = "androidx.test.ext:junit:1.1.3"
    const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
    const val uiTestJunit = "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"

    /***********************************
     *      Additional Libraries       *
     ***********************************/
    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"
    const val retrofit  = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    val zxing = Zxing
    object Zxing {
        const val androidCore = "com.google.zxing:android-core:${Versions.zxingAndroidCore}"
        const val core = "com.google.zxing:core:${Versions.zxing}"
        const val javase = "com.google.zxing:javase:${Versions.zxing}"
    }


    object Versions {
        const val androidCoreVersion = "1.9.0"
        const val composeVersion = "1.2.1"
        const val lifecycleVersion = "2.5.1"
        const val junitVersion = "4.13.2"
        const val gsonVersion = "2.9.1"
        const val retrofitVersion = "2.9.0"
        const val activityComposeVersion = "1.5.1"
        const val zxingAndroidCore = "3.3.0"
        const val zxing = "3.5.0"
        const val cameraX = "1.1.0"
        const val androidXCoreVersion = "1.0.0"
    }

    object Annotations {
        const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycleVersion}"
        const val databindingCompiler = "androidx.databinding:databinding-compiler:${Constants.AGPVersion}"

    }

    object Debug {
        const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
        const val composeTestManifest = "androidx.compose.ui:ui-test-manifest:${Versions.composeVersion}"
    }
}
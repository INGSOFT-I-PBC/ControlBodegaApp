package app.android

object Libraries {
    /************************************
     *             Core Deps            *
     ************************************/
    const val androidCore = "androidx.core:core-ktx:${Versions.androidCoreVersion}"
    const val lifecycle = "androidx.lifecycle:lifecycle-common:${Versions.lifecycleVersion}"
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityComposeVersion}"


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


    object Versions {
        const val androidCoreVersion = "1.9.0"
        const val composeVersion = "1.2.1"
        const val lifecycleVersion = "2.5.1"
        const val junitVersion = "4.13.2"
        const val gsonVersion = "2.9.1"
        const val retrofitVersion = "2.9.0"
        const val activityComposeVersion = "1.5.1"
    }

    object Annotations {

    }

    object Debug {
        const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
        const val composeTestManifest = "androidx.compose.ui:ui-test-manifest:${Versions.composeVersion}"
    }
}
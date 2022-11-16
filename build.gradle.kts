buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.application:com.android.application.gradle.plugin:${Constants.AGPVersion}")
        classpath ("com.android.library:com.android.library.gradle.plugin:${Constants.AGPVersion}")
        classpath ("org.jetbrains.kotlin.android:org.jetbrains.kotlin.android.gradle.plugin:${Constants.kotlinVersion}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.21")
    }
}

//plugins {
//    id ("com.android.application") version "${Constants.AGPVersion}"
//    id ("com.android.library") version "${Constants.AGPVersion}"
//    id ("org.jetbrains.kotlin.android") version Constants.kotlinAndroidVersion
//
////    id 'com.android.application' version '7.2.1' apply false
////    id 'com.android.library' version '7.2.1' apply false
////    id 'org.jetbrains.kotlin.android' version '1.5.31' apply false
//}

tasks.register("clean").configure{
    delete("build")
}

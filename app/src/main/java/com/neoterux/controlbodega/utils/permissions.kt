package com.neoterux.controlbodega.utils

import android.content.Context

fun Context.requestPermissions() {
    val packageInfo = this.packageManager.getPackageInfo(packageName, 0)
//    packageManager.getPackageInfo(packageName, PackageManager.GET_PERMISSIONS)
//    ContextCompat.checkSelfPermission(this)
}
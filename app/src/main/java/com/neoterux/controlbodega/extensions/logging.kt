package com.neoterux.controlbodega.extensions

import android.util.Log
import androidx.activity.ComponentActivity

inline fun <reified T: ComponentActivity> T.info(
    message: String?,
    err: Throwable? = null
) = Log.i(T::class.simpleName, message, err)

inline fun <reified T: ComponentActivity> T.error(
    message: String?,
    err: Throwable? = null
) = Log.e(T::class.simpleName, message, err)

inline fun <reified T: ComponentActivity> T.warning(
    message: String?,
    err: Throwable? = null
) = Log.w(T::class.simpleName, message, err)
package com.neoterux.controlbodega.extensions

import android.app.Activity
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

fun Activity.logi(message: String, throwable: Throwable? = null) = Log.i(this.javaClass.simpleName, message, throwable)

fun Activity.logi(vararg messages: String, throwable: Throwable? = null) = logi(messages.joinToString(" "), throwable)

fun Activity.logd(message: String, throwable: Throwable? = null) = Log.d(this.javaClass.simpleName, message, throwable)

fun Activity.logd(vararg messages: String, throwable: Throwable? = null) = logd(messages.joinToString(" "), throwable)

fun Activity.loge(message: String, throwable: Throwable? = null) = Log.e(this.javaClass.simpleName, message, throwable)

fun Activity.loge(vararg messages: String, throwable: Throwable? = null) = loge(messages.joinToString(" "), throwable)

fun Activity.logw(message: String, throwable: Throwable? = null) = Log.w(this.javaClass.simpleName, message, throwable)

fun Activity.logw(vararg messages: String, throwable: Throwable? = null) = logw(messages.joinToString(" "), throwable)
package com.kotlinnative.shared

import android.os.Build

actual fun getPlatformName(): String {
    return "Android ${Build.VERSION.RELEASE}"
}
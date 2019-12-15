package com.wooooooak.awesomeandroidextension.ext

import android.graphics.Bitmap
import android.graphics.Matrix

fun Bitmap.rotate(rotationCount: Int): Bitmap {
    val degree = when (rotationCount) {
        1 -> 90f
        2 -> 180f
        3 -> 270f
        else -> null
    }
    return degree?.let {
        val matrix = Matrix().apply { postRotate(degree) }
        Bitmap.createBitmap(this, 0, 0, this.width, this.height, matrix, true)
    } ?: this
}
package com.wooooooak.awesomeandroidextension.ext

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.io.File

fun File.toBitmap(): Bitmap = BitmapFactory.decodeFile(this.path)
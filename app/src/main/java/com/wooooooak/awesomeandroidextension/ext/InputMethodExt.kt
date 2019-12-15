package com.wooooooak.awesomeandroidextension.ext

import android.view.View
import android.view.inputmethod.InputMethodManager

fun InputMethodManager.showKeyboard(view: View) {
    this.showSoftInput(view, 0)
}

fun InputMethodManager.hideKeyboard(view: View) {
    this.hideSoftInputFromWindow(view.windowToken, 0)
}
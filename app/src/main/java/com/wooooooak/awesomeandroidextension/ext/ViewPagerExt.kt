package com.wooooooak.awesomeandroidextension.ext

import androidx.viewpager.widget.ViewPager

fun ViewPager.afterPageChanged(afterPageChanged: (position: Int) -> Unit) {
    this.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(state: Int) {
        }

        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {
        }

        override fun onPageSelected(position: Int) {
            afterPageChanged(position)
        }
    })
}
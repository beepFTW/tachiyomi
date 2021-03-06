package eu.kanade.tachiyomi.util

import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.support.annotation.StringRes

fun Resources.Theme.getResourceColor(@StringRes resource: Int) : Int {
    val typedArray = this.obtainStyledAttributes(intArrayOf(resource))
    val attrValue = typedArray.getColor(0, 0)
    typedArray.recycle()
    return attrValue
}

fun Resources.Theme.getResourceDrawable(@StringRes resource: Int) : Drawable {
    val typedArray = this.obtainStyledAttributes(intArrayOf(resource))
    val attrValue = typedArray.getDrawable(0)
    typedArray.recycle()
    return attrValue
}
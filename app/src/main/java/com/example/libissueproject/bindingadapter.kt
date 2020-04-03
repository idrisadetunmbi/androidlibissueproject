package com.example.libissueproject

import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingAdapter
import com.airbnb.paris.extensions.style
import com.airbnb.paris.styles.Style

@BindingAdapter("parisStyle")
fun setStyle(view: AppCompatTextView, style: Style?) {
    style?.let {
        // omitting default style for brevity
        view.style(it)
    }
}

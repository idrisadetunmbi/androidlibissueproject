package com.example.libissueproject

import android.content.Context
import androidx.appcompat.widget.AppCompatTextView
import com.airbnb.epoxy.ModelView
import com.airbnb.paris.annotations.Style
import com.airbnb.paris.annotations.Styleable

@Styleable
@ModelView
class CustomText(context: Context) : AppCompatTextView(context) {
    companion object {
        @Style
        val DEFAULT_STYLE = R.style.Text
    }
}

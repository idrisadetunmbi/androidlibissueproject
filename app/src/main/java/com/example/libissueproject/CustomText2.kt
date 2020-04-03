package com.example.libissueproject

import android.content.Context
import androidx.appcompat.widget.AppCompatTextView
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.airbnb.paris.extensions.style
import com.airbnb.paris.styles.Style

@ModelView(autoLayout = ModelView.Size.WRAP_WIDTH_WRAP_HEIGHT)
class CustomText2(context: Context) : AppCompatTextView(context) {

    @ModelProp(options = [ModelProp.Option.IgnoreRequireHashCode])
    @JvmOverloads
    fun setStyle(style: Style? = null) {
        this.style {
            // omitting default style for brevity
            style?.let { add(it) }
        }
    }
}

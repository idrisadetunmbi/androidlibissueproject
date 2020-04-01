package com.example.libissueproject

import android.widget.EditText
import androidx.annotation.DrawableRes
import com.airbnb.paris.annotations.Attr
import com.airbnb.paris.annotations.Styleable
import com.airbnb.paris.annotations.StyleableChild
import com.airbnb.paris.proxies.BaseProxy
import com.google.android.material.textfield.TextInputLayout

@Styleable("Paris_TextInputLayout")
class TextInputLayoutProxy(view: TextInputLayout) :
    BaseProxy<TextInputLayoutProxy, TextInputLayout>(view) {

    @StyleableChild(R2.styleable.Paris_TextInputLayout_childStyle)
    val editText: EditText? = view.editText

    @Attr(R2.styleable.Paris_TextInputLayout_android_hint)
    fun setHint(hint: CharSequence?) {
        view.hint = hint
    }

    @Attr(R2.styleable.Paris_TextInputLayout_startIconDrawable)
    fun setStartIconDrawable(@DrawableRes res: Int) {
        view.setStartIconDrawable(res)
    }

    @Attr(R2.styleable.Paris_TextInputLayout_suffixText)
    fun setSuffixText(text: CharSequence) {
        view.suffixText = text
    }

    @Attr(R2.styleable.Paris_TextInputLayout_prefixText)
    fun setPrefixText(text: CharSequence) {
        view.prefixText = text
    }
}

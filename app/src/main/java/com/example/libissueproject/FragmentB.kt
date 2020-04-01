package com.example.libissueproject

import android.view.ViewGroup
import com.airbnb.paris.extensions.*
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.textview.MaterialTextView

class FragmentB : BaseFragment() {
    override fun epoxyController(): BaseEpoxyController = BaseEpoxyController {
        if (view == null || isRemoving) return@BaseEpoxyController
        text {
            id("Title_FormDescription")
            onBind { model, view, position ->
                (view.dataBinding.root as MaterialTextView).style {
                    layoutMarginBottomDp(16)
                    layoutHeight(ViewGroup.LayoutParams.WRAP_CONTENT)
                    layoutWidth(ViewGroup.LayoutParams.MATCH_PARENT)
                    text("Fragment B Title")
                }
            }
        }
        input {
            id("Input_Description")
            onBind { model, view, position ->
                (view.dataBinding.root as TextInputLayout).style(R.style.FragmentB_Input_Description)
            }
        }
    }
}

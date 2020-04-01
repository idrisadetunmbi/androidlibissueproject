package com.example.libissueproject

import android.graphics.Color
import android.widget.Button
import androidx.navigation.findNavController
import com.airbnb.paris.extensions.*
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.textview.MaterialTextView


class FragmentA : BaseFragment() {
    override fun epoxyController(): BaseEpoxyController = BaseEpoxyController {
        if (view == null || isRemoving) return@BaseEpoxyController
        text {
            id("FragmentATitle")
            onBind { _, view, _ ->
                (view.dataBinding.root as MaterialTextView).style {
                    textSizeDp(20)
                    textColor(Color.BLACK)
                    layoutMarginBottomDp(16)
                    text("Fragment A Title")
                }
            }
        }
        input {
            id("FragmentAInput")
            onBind { _, view, _ ->
                (view.dataBinding.root as TextInputLayout).style(R.style.FragmentA_SearchInput)
            }
        }
        button {
            id("Button_GoToFragmentB")
            onBind { model, view, position ->
                with(view.dataBinding.root as Button) {
                    style {
                        text("Go to Fragment B")
                        paddingDp(16)
                        textColor(Color.WHITE)
                    }
                    setOnClickListener {
                        findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
                    }
                }
            }
        }
    }
}

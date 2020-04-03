package com.example.libissueproject

import android.view.ViewGroup
import com.airbnb.paris.extensions.*


class FragmentA : BaseFragment() {
    private val texts = listOf("Text1", "Text2", "Text3")

    override fun epoxyController(): BaseEpoxyController = BaseEpoxyController {
        if (view == null || isRemoving) return@BaseEpoxyController
        verticalGridCarousel {
            id("Carousel")
            models(texts.map { text ->
                CustomTextModel_().apply {
                    id(text)
                    styleBuilder {
                        it.text(text)
                        it.textSizeDp(30)
                        it.layoutWidth(ViewGroup.LayoutParams.MATCH_PARENT)
                        it.layoutHeight(ViewGroup.LayoutParams.WRAP_CONTENT)
                    }
                }
            })
        }

        verticalGridCarousel {
            id("Carousel2")
            models(texts.map { text ->
                CustomText2Model_().apply {
                    id("${text}_2")
                    style(textViewStyle {
                        text(text)
                        textSizeDp(30)
                        layoutWidth(ViewGroup.LayoutParams.MATCH_PARENT)
                        layoutHeight(ViewGroup.LayoutParams.WRAP_CONTENT)
                    })
                }
            })
        }

        customText3 {
            id("TitleText1")
            style(textViewStyle {
                text("// Model created with databinding works")
                textSizeDp(20)
                layoutWidth(ViewGroup.LayoutParams.MATCH_PARENT)
                layoutHeight(ViewGroup.LayoutParams.WRAP_CONTENT)
            })
        }
        verticalGridCarousel {
            id("Carousel3")
            models(texts.map { text ->
                CustomText3BindingModel_().apply {
                    id("${text}_3")
                    style(textViewStyle {
                        text(text)
                        textSizeDp(30)
                        layoutWidth(ViewGroup.LayoutParams.MATCH_PARENT)
                        layoutHeight(ViewGroup.LayoutParams.WRAP_CONTENT)
                    })
                }
            })
        }
    }
}

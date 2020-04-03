package com.example.libissueproject

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.airbnb.epoxy.Carousel
import com.airbnb.epoxy.ModelView

@ModelView(autoLayout = ModelView.Size.WRAP_WIDTH_WRAP_HEIGHT)
class VerticalGridCarousel(context: Context) : Carousel(context) {
    override fun createLayoutManager(): LayoutManager {
        return GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
    }
}

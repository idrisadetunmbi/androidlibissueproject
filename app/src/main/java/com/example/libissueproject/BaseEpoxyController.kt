package com.example.libissueproject

import com.airbnb.epoxy.AsyncEpoxyController
import com.airbnb.epoxy.EpoxyController

open class BaseEpoxyController(val buildModelsCallback: EpoxyController.() -> Unit = {}) :
    AsyncEpoxyController() {

    override fun buildModels() {
        buildModelsCallback()
    }
}

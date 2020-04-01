package com.example.libissueproject

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import com.airbnb.epoxy.EpoxyRecyclerView
import com.airbnb.mvrx.BaseMvRxFragment

abstract class BaseFragment(@LayoutRes layout: Int = R.layout.fragment_base) :
    BaseMvRxFragment(layout) {

    protected lateinit var recyclerView: EpoxyRecyclerView
    protected val epoxyController: BaseEpoxyController by lazy { epoxyController() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        epoxyController.onRestoreInstanceState(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.findViewById<EpoxyRecyclerView>(R.id.recyclerview).apply {
            setController(epoxyController)
        }
    }

    override fun invalidate() {
        recyclerView.requestModelBuild()
    }

    abstract fun epoxyController(): BaseEpoxyController

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        epoxyController.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        epoxyController.cancelPendingModelBuild()
        super.onDestroyView()
    }
}

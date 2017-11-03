package com.nosmurf.monumentsapp.activity

import android.util.Log
import com.nosmurf.monumentsapp.R
import com.nosmurf.monumentsapp.presenter.MainPresenter
import com.nosmurf.monumentsapp.presenter.Presenter


class MainActivity : RootActivity<MainPresenter.View>(), MainPresenter.View {
    override val layoutResourceId: Int = R.layout.activity_main

    override val presenter: Presenter<MainPresenter.View>
        get() = MainPresenter() //TODO: Use Kodein to inject the presenter.

    override fun initializeInjector() {
        //TODO: Kodein
    }

    override fun initializeUI() {

    }

    override fun initializePresenter() {
        presenter.start(this)
    }

    override fun showError(messageId: Int) {

    }

    override fun showError(message: String) {

    }

    override fun showTestText(text: String) {
        Log.i("Text", text)
    }

}

package com.example.libissueproject

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (BuildConfig.DEBUG) {
            // The check can run asynchronously to minimize impact
            AsyncTask.THREAD_POOL_EXECUTOR.execute {
                // Will throw in case of failure
                Paris.assertStylesContainSameAttributes(this)
            }
        }
    }
}

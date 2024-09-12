package org.ghalib.kramatalk

import android.os.Bundle
import androidx.activity.ComponentActivity

open class BaseActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}
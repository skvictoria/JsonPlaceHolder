package base

import android.content.Context
import dagger.android.DaggerActivity
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity : DaggerAppCompatActivity(){
    val context: Context get() = this
}
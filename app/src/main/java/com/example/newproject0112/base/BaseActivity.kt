package com.example.newproject0112.base

import android.content.Context
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity : DaggerAppCompatActivity(){
    val context: Context get() = this
}
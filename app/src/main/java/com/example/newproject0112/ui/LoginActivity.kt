package com.example.newproject0112.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.newproject0112.R
import com.example.newproject0112.base.BaseActivity
import com.example.newproject0112.databinding.ActivityMainBinding
import javax.inject.Inject

class LoginActivity : BaseActivity(){
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<PhotoListViewModel> {viewModelFactory}

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        binding.lifecycleOwner = this
        viewModel.loadPhotos()
    }
}
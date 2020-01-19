package ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import base.BaseActivity
import com.example.newproject0112.R
import com.example.newproject0112.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity: BaseActivity(){
    @Inject
    lateinit var viewModelFactory : ViewModelProvider.Factory
    private lateinit var binding: ActivityMainBinding
//    private val viewModel: PhotoListViewModel by viewModels()
    //private val viewModelsel by viewModels<PhotoListViewModel>{viewModelFactory}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this

      //  viewModel.loadPhotos()
      //  binding.vm = viewModel
    }
}
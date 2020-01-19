package com.example.newproject0112.ui

import com.example.newproject0112.base.BaseViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import com.example.newproject0112.model.Photo
import com.example.newproject0112.model.PhotoService
import javax.inject.Inject

class PhotoListViewModel @Inject constructor(private val photoservice: PhotoService) : BaseViewModel(){

    private val compositeDisposable = CompositeDisposable()
    lateinit var photolist: List<Photo>

    fun loadPhotos()= photoservice.getPhoto()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {photolist = it},{}
            )


    /*private fun onRetrievePhotoListSuccess(photoList:List<Photo>){
        photoAdapter.updatePhotoList(photoList)
    }

    override fun onCleared(){
        super.onCleared()
        subscription.dispose()
    }*/
}
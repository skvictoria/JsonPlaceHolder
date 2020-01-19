package ui

import base.BaseViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import model.Photo
import model.PhotoService
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
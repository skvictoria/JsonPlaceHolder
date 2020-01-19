package model

import io.reactivex.Single
import retrofit2.http.GET

interface PhotoService{
    @GET("/photos")
    fun getPhoto(): Single<List<Photo>>
}
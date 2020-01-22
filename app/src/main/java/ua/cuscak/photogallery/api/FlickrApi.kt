package ua.cuscak.photogallery.api

import retrofit2.Call
import retrofit2.http.GET


interface FlickrApi {

    @GET("services/rest/?method=flickr.interestingness.getList" +
                "&api_key=d2f5310a88fbacf3dc3910b0546fd9b7" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>
}


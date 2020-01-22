package ua.cuscak.photogallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ua.cuscak.photogallery.api.FlickrFetchr

class PhotoGalleryViewModel : ViewModel() {

    val galleryItemLiveData: LiveData<List<GalleryItem>>

    init {
        galleryItemLiveData = FlickrFetchr().fetchPhotos()
    }
}


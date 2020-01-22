package ua.cuscak.photogallery.api

import com.google.gson.annotations.SerializedName
import ua.cuscak.photogallery.GalleryItem


class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>
}


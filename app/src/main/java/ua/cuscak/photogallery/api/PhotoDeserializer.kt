package ua.cuscak.photogallery.api

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import ua.cuscak.photogallery.GalleryItem
import java.lang.reflect.Type


class PhotoDeserializer : JsonDeserializer<PhotoResponse> {


    override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext?): PhotoResponse {
        // Pull photos object out of JsonElement
        val photosObj = json.asJsonObject.getAsJsonObject("photos")
        // and convert to PhotoResponse object
        val x = PhotoResponse()
        x.galleryItems = photosObj.getAsJsonArray("photo") as List<GalleryItem>

        return x

    }
}


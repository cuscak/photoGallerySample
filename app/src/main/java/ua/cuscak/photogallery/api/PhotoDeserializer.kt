package ua.cuscak.photogallery.api

import com.google.gson.Gson
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.reflect.TypeToken
import ua.cuscak.photogallery.GalleryItem
import java.lang.reflect.Type


class PhotoDeserializer : JsonDeserializer<PhotoResponse> {


    override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext?): PhotoResponse {
        // Pull photos object out of JsonElement
        val photosObj = json.asJsonObject.getAsJsonObject("photos").getAsJsonArray("photo")
        // and convert to PhotoResponse object

        return PhotoResponse().apply {
            galleryItems = Gson().fromJson(photosObj, object : TypeToken<List<GalleryItem>>() {}.type)
        }
    }
}


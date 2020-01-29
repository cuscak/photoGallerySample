package ua.cuscak.photogallery.api

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type


class PhotoDeserializer : JsonDeserializer<PhotoResponse> {

    override fun deserialize(json: JsonElement, typeOfT: Type?, context: JsonDeserializationContext?): PhotoResponse {
        // Pull photos object out of JsonElement
        // and convert to PhotoResponse object
        return json.asJsonObject.getAsJsonObject("photo") as PhotoResponse
    }
}

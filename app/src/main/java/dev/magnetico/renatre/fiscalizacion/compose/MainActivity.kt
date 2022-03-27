package dev.magnetico.renatre.fiscalizacion.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import dev.magnetico.renatre.fiscalizacion.compose.misc.Constants.Companion.LOCALHOST_URL
import dev.magnetico.renatre.fiscalizacion.compose.network.responses.ItemResponse
import dev.magnetico.renatre.fiscalizacion.compose.network.services.ItemsService
import dev.magnetico.renatre.fiscalizacion.compose.ui.theme.ComposeTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getItemsCoroutine()
    }

    private fun getItems():Retrofit{
        return Retrofit.Builder()
            .baseUrl("http://$LOCALHOST_URL/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun getItemsCoroutine(){
        CoroutineScope(Dispatchers.IO).launch {
            val call:Response<ItemResponse> = getItems().create(ItemsService::class.java).getItemsFromApi("get")
            println(call.body())
        }
    }

}

package dev.composeapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import dev.composeapp.domain.model.Item
import dev.composeapp.misc.Constants.Companion.LOCALHOST_URL
import dev.composeapp.network.model.ItemDTO
import dev.composeapp.network.model.ItemDTOMapper
import dev.composeapp.network.services.ItemsService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            app()
        }


        getItemsCoroutine()
    }

    @Preview
    @Composable
    private fun app() {

        Column(modifier = Modifier.fillMaxSize()) {

            Text(text = "hola")
            Text(text = "chau")

        }

    }

    @Preview
    @Composable
    fun LazyColumnDemo() {
        val list = listOf(
            "A", "B", "C", "D"
        ) + ((0..100).map { it.toString() })
        LazyColumn(modifier = Modifier.fillMaxHeight()) {
            items(items = list, itemContent = { item ->
                Log.d("COMPOSE", "This get rendered $item")
                when (item) {
                    "A" -> {
                        Text(text = item, style = TextStyle(fontSize = 80.sp))
                    }
                    "B" -> {
                        Button(onClick = {}) {
                            Text(text = item, style = TextStyle(fontSize = 80.sp))
                        }
                    }
                    "C" -> {
                        //Do Nothing
                    }
                    "D" -> {
                        Text(text = item)
                    }
                    else -> {
                        Text(text = item, style = TextStyle(fontSize = 80.sp))
                    }
                }
            })
        }
    }

    private fun getService(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://$LOCALHOST_URL/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun getItemsCoroutine(){
        CoroutineScope(Dispatchers.IO).launch {
            val call:ItemDTO = getService()
                .create(ItemsService::class.java)
                .getItemsFromApi("get")

            println(call)

            val mapper = ItemDTOMapper()
            val item : Item = mapper.mapToDomainModel(call)

            println(item)
        }
    }

}

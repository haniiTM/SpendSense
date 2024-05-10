package info.javaway.spend_sense

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

interface Greetable {
    fun greet()
}

class Greeting : Greetable {
    override fun greet() {
        println("greet you 🥳")
    }
}

@Composable
fun GreetingView() {
    Box(modifier = Modifier) {
        Text(modifier = Modifier, text = "Hello there 🛸")
    }
}
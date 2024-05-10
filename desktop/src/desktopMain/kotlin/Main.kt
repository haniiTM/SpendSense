import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import info.javaway.spend_sense.Greeting
import info.javaway.spend_sense.GreetingView

fun main() {
    val greeting = Greeting()
    greeting.greet()

    application {
        val windowState = rememberWindowState().apply { size = DpSize(200.dp, 200.dp) }

        Window(
            onCloseRequest = { exitApplication() },
            state = windowState,
            title = "SpendSense"
        ) {
            GreetingView()
        }
    }
}
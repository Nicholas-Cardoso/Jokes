package joke.api

import joke.api.services.HttpJoke
import java.util.*

fun main() {
    val joker = HttpJoke()

    val timer = Timer()
    val task = object : TimerTask() {
        override fun run() {
            joker.clearConsole()
            joker.configureJoke()
        }
    }
    timer.scheduleAtFixedRate(task, 0, 10000)
}
package joke.api.services

import net.thauvin.erik.jokeapi.JokeApi
import net.thauvin.erik.jokeapi.JokeConfig
import net.thauvin.erik.jokeapi.models.Category
import net.thauvin.erik.jokeapi.models.Language
import net.thauvin.erik.jokeapi.models.Type

class HttpJoke {
    fun configureJoke() {
        val config = JokeConfig.Builder()
            .type(Type.ALL)
            .safe(true)
            .lang(Language.EN)
            .categories(categories = setOf(Category.PROGRAMMING))
            .build()

        var joke = JokeApi.joke(config).joke.forEach {
            println(it)
        }
    }

    fun clearConsole() {
        for (i in 1..50) {
            println()
        }
    }
}
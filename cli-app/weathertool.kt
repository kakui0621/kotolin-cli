import java.net.URL
import java.io.IOException

fun getWeather(city: String, apiKey: String): String? {
    return try {
        val apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=$city&appid=$apiKey"
        URL(apiUrl).readText()
    } catch (e: IOException) {
        println("Error fetching weather data: ${e.message}")
        null
    }
}

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Usage: <program_name> <city_name> <api_key>")
        return
    }
    val weatherData = getWeather(args[0], args[1])
    if (weatherData != null) {
        println(weatherData)
    }
}

import java.net.URL
import java.net.MalformedURLException
import java.io.IOException

fun crawlWebpage(url: String): String? {
    return try {
        URL(url).readText()
    } catch (e: MalformedURLException) {
        println("Error: The URL is malformed - ${e.message}")
        null
    } catch (e: IOException) {
        println("Error: Failed to retrieve content from the URL - ${e.message}")
        null
    }
}

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Usage: <program_name> <url_to_crawl>")
        return
    }

    val url = args[0]
    val content = crawlWebpage(url)
    if (content != null) {
        println(content)
    }
}

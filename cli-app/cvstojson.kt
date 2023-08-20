import java.io.File
import org.json.JSONArray
import org.json.JSONObject

fun csvToJson(csvFilePath: String, jsonFilePath: String) {
    val csvContent = File(csvFilePath).readLines()
    val headers = csvContent[0].split(",")

    val jsonArray = JSONArray()

    for (i in 1 until csvContent.size) {
        val jsonObject = JSONObject()
        val data = csvContent[i].split(",")

        for (j in headers.indices) {
            jsonObject.put(headers[j], data[j])
        }

        jsonArray.put(jsonObject)
    }

    File(jsonFilePath).writeText(jsonArray.toString())
    println("CSV file converted to JSON successfully.")
}

fun main() {
    println("Enter CSV file path:")
    val csvFilePath = readLine() ?: return
    println("Enter destination JSON file path:")
    val jsonFilePath = readLine() ?: return

    csvToJson(csvFilePath, jsonFilePath)
}

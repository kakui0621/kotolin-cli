import java.io.File
import java.io.IOException

fun analyzeLog(filePath: String, searchTerm: String) {
    val file = File(filePath)
    if (!file.exists()) {
        println("Error: The file $filePath does not exist.")
        return
    }

    try {
        val lines = file.readLines()
        for ((index, line) in lines.withIndex()) {
            if (line.contains(searchTerm)) {
                println("Line ${index + 1}: $line")
            }
        }
    } catch (e: IOException) {
        println("Error reading the file: ${e.message}")
    }
}

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Usage: <program_name> <path_to_log_file> <search_term>")
        return
    }

    val filePath = args[0]
    val searchTerm = args[1]
    analyzeLog(filePath, searchTerm)
}

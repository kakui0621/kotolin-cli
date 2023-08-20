import java.io.File
import java.io.IOException
import java.nio.file.*

fun backupFile(sourcePath: String, destinationPath: String) {
    try {
        if (!File(sourcePath).exists()) {
            println("Error: Source file doesn't exist.")
            return
        }
        Files.copy(Paths.get(sourcePath), Paths.get(destinationPath), StandardCopyOption.REPLACE_EXISTING)
        println("File backed up successfully!")
    } catch (e: IOException) {
        println("Error occurred during the backup: ${e.message}")
    }
}

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Usage: <program_name> <path_to_source_file> <path_to_destination_file>")
        return
    }
    backupFile(args[0], args[1])
}

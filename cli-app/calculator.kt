import javax.script.ScriptException

fun main() {
    println("Enter an expression (e.g., '1 + 1'):")
    val input = readLine() ?: return
    try {
        val result = eval(input)
        println("Result: $result")
    } catch (e: ScriptException) {
        println("Error: Invalid expression - ${e.message}")
    }
}

fun eval(expr: String): Double {
    return javax.script.ScriptEngineManager().getEngineByName("js").eval(expr) as Double
}

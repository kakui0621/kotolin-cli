data class Task(val id: Int, var title: String, var completed: Boolean = false)

class TaskManager {
    private val tasks = mutableListOf<Task>()
    private var currentId = 0

    fun addTask(title: String) {
        tasks.add(Task(currentId++, title))
        println("Task added.")
    }

    fun removeTask(id: Int) {
        tasks.removeIf { it.id == id }
        println("Task removed.")
    }

    fun markAsComplete(id: Int) {
        val task = tasks.find { it.id == id }
        task?.completed = true
        println("Task marked as completed.")
    }

    fun listTasks() {
        tasks.forEach {
            println("${it.id}: ${it.title} - ${if (it.completed) "Completed" else "Not Completed"}")
        }
    }
}

fun main() {
    val taskManager = TaskManager()
    
    loop@ while (true) {
        println("Choose an action: 1) Add 2) Remove 3) Mark as Complete 4) List 5) Exit")
        when (readLine()) {
            "1" -> {
                println("Enter task title:")
                val title = readLine() ?: ""
                taskManager.addTask(title)
            }
            "2" -> {
                println("Enter task ID to remove:")
                val id = readLine()?.toIntOrNull()
                if (id != null) taskManager.removeTask(id)
            }
            "3" -> {
                println("Enter task ID to mark as complete:")
                val id = readLine()?.toIntOrNull()
                if (id != null) taskManager.markAsComplete(id)
            }
            "4" -> taskManager.listTasks()
            "5" -> break@loop
        }
    }
}

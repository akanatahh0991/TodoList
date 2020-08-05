package todolist

/**
 * id ID
 * content タスクの内容
 * done 作業済かどうか
 */
data class Task(val id: Long, val content: String, val done: Boolean)
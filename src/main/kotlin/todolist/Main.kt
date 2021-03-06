package todolist

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import spark.Spark.get

fun main(args: Array<String>) {
    val objectMapper = ObjectMapper().registerKotlinModule()
    // オブジェクトをJSONに変換するためのクラス
    val jsonTransformer = JsonTransformer(objectMapper)
    //
    val taskController = TaskController()

    get("/task", taskController.index(), jsonTransformer)
}
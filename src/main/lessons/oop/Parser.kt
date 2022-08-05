package main.lessons.oop

fun main() {
    val xmlParser: Parser = Parser("xml")
    println("Parser "+xmlParser.getType()+" files")
}

class Parser (_type: String) {
    private val fileType: String
    init {
        fileType = _type
    }

    fun getType(): String {
        return fileType
    }
}
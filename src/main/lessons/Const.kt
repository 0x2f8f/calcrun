package main.lessons

fun main() {
    println(DbConstants.TABLE_USER_ATTRIBUTE_DATA)
}

class DbConstants {

    companion object {
        const val TABLE_USER_ATTRIBUTE_EMPID = "_id"
        const val TABLE_USER_ATTRIBUTE_DATA = "data"
    }
}
package main.lessons

fun main() {
    displayMessage(::morning)
    displayMessage(::evening)

    displayMes(::morn)
    displayMes(::even)

    helloUser("Yanis", ::mornUser)

    val action1 = selectAction(1)
    val action2 = selectAction(2)
    println(action1(3, 4))
    println(action2(3, 4))
}

fun displayMessage(mes: () -> Unit){
    mes()
}
fun morning(){
    println("Good Morning")
}
fun evening(){
    println("Good Evening")
}

fun displayMes(mes: () -> String){
    println(mes())
}
fun morn(): String {
    return "Good Morning"
}
fun even(): String {
    return "Good Evening"
}

fun helloUser(name: String, mes: (String) -> String) {
    println(mes(name))
}
fun mornUser(name: String): String {
    return "Good Morning $name"
}

fun selectAction(k: Int): (Int, Int) -> Int {
    return when (k) {
        1 -> ::sum1
        2 -> ::multiplication
        else -> ::empty
    }
}

fun sum1(a: Int, b: Int): Int {
    return a+b
}
fun multiplication(a: Int, b: Int): Int {
    return a*b
}
fun empty (a: Int, b: Int): Int{
    return 0
}
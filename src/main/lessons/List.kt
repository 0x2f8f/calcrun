package main.lessons

fun main() {
    val people = listOf("Tom", "Sam", "Kate", "Bob", "Alice", "Mike")

    for(person in people) println(person)
    println("---")
    println(people) // [Tom, Sam, Kate, Bob, Alice]
    println()

    val second = people.get(1)
    println(second)
    println(people[0])
    println()

    val check1 = people.getOrNull(10)
    val check2 = people.getOrElse(11){"Yanis"}
    println(check1)
    println(check2)
    println()

    val subPeople = people.subList(1,3)
    println(subPeople)
    println()

    //Изменяемый списки (это arrayListOf и mutableListOf)
    val numbers : ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5)
    val numbers2: MutableList<Int> = mutableListOf(5, 6, 7)
    println(numbers)
    println(numbers2)

    /*
        add(index, element): добавлят элемент по индексу
        add(element): добавляет элемент
        addAll(collection): добавляет коллекцию элементов
        remove(element): удаляет элемент
        removeAt(index): удаляет элемент по индексу
        clear(): удаляет все элементы коллекции
     */
    numbers.add(0, 10)
    numbers.add(11)
    println(numbers)

    numbers.addAll(numbers2)
    println(numbers)

    numbers.remove(5)
    numbers.removeAt(6)
    println(numbers)

    numbers2.clear()
    println(numbers2)

    val numbers3 : ArrayList<Int> = arrayListOf()
    numbers3.add(0,11)
    numbers3.add(1,22)
    numbers3.add(2,33)
    println(numbers3)
    println(numbers3[1])
}
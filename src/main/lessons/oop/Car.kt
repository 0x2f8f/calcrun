package main.lessons.oop

fun main() {
    val bmw: Car = Car("BMW", "X5")

    println(bmw.toString())
    println("Barnd: "+bmw.brand)
    println("Model: "+bmw.model)
}

class Car (_brand: String, _model: String) {
    var brand: String = _brand
    public var model: String = _model

    override fun toString(): String {
        return "Brand: $brand, model: $model"
    }
}
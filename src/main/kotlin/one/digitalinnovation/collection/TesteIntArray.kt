package one.digitalinnovation.collection

fun main() {
    val values = IntArray(6)

    values[0] = 1
    values[1] = 5
    values[2] = 3
    values[3] = 6
    values[4] = 2
    values[5] = 4

    for (valor in values) {
        println(valor)
    }

    println("_________________________")
    values.forEach { valor ->
        println(valor)
    }

    println("_________________________")
    for (index in values.indices) {
        println(values[index])
    }

    println("_________________________")

    values.sort()
    for (valor in values) {
        println(valor)
    }

}
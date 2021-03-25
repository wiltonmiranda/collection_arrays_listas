package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for(salario in salarios) {
        println(salario)
    }

    println("------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("______________________")

    salarioMaiorQue2500.forEach { println(it) }

    println("______________________")
    println(salarios.count { it in 2000.0..5000.00 })

    println("______________________")
    println(salarios.find { it == 2250.00 })
    println(salarios.count { it == 2000.00 })

    println("______________________")
    println(salarios.any { it == 1000.00 })
    println(salarios.any { it == 500.00 })



}
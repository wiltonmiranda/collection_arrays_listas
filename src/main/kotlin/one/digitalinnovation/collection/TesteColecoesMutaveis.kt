package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("----------------------")
    funcionarios.add(pedro)
    funcionarios.forEach{ println(it)}

    println("----------------------")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it)}

    println("-----------SET-----------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach{ println(it)}

    println("-----------SET-----------")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach{ println(it)}

    println("-----------SET-----------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach{ println(it)}

}
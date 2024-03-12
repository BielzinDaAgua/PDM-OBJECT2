// Classe base Funcionario
open class Funcionario(val nome: String, val idade: Int) {
    init {
        println("Novo funcionário registrado: $nome, $idade anos.")
    }

    open fun Apresentar() {
        println("Funcionário: $nome, $idade anos.")
    }
}

// Classe Gerente
class Gerente(nome: String, idade: Int, val setor: String) : Funcionario(nome, idade) {
    override fun Apresentar() {
        println("Gerente: $nome, $idade anos, Setor: $setor.")
    }
}

// Classe Desenvolvedor
class Desenvolvedor(nome: String, idade: Int, val linguagem: String) : Funcionario(nome, idade) {
    override fun Apresentar() {
        println("Desenvolvedor: $nome, $idade anos, Linguagem: $linguagem.")
    }
}

// Classe Analista
class Analista(nome: String, idade: Int, val area: String) : Funcionario(nome, idade) {
    override fun Apresentar() {
        println("Analista: $nome, $idade anos, Área: $area.")
    }
}

fun main() {
    // Criando uma lista de funcionários
    val funcionarios = mutableListOf<Funcionario>()

    // Adicionando diferentes tipos de funcionários à lista
    funcionarios.add(Gerente("Ana", 35, "TI"))
    funcionarios.add(Desenvolvedor("Carlos", 28, "Kotlin"))
    funcionarios.add(Analista("Maria", 30, "Financeiro"))

    // Iterando sobre a lista e chamando o método Apresentar para cada funcionário
    for (funcionario in funcionarios) {
        funcionario.Apresentar()
    }
}

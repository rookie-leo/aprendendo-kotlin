package br.com.treino.model

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(//tecnica utilizada para herança multipla, quem herdar de FuncionarioAdmin herdara de Funcionario tambem
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    abstract fun autentica(senha: Int): Boolean
}
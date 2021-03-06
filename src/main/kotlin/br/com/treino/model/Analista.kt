package br.com.treino.model

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double
        get() {
            return Math.ceil(salario * 0.1) // super chama o metodo da super class
        }

}
package br.com.treino.model

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario // super chama o metodo da super class
        }

}
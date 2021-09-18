package br.com.treino.model

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double
        get() {
            return salario * 0.05 // super chama o metodo da super class
        }

}
package br.com.treino.model

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome = nome, cpf = cpf, salario = salario){

    override val bonificacao: Double
        get() {
            return salario * 0.2// super chama o metodo da super class
        }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha){
            return true
        }
        return false
    }
}
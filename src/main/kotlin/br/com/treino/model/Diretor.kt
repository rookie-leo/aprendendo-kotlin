package br.com.treino.model

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario){

    override val bonificacao get() = super.bonificacao + salario + plr // super chama o metodo da super class

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha){
            return true
        }
        return false
    }
}
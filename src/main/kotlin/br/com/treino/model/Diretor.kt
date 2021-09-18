package br.com.treino.model

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel{

    override val bonificacao get() = salario + plr * 0.2 // super chama o metodo da super class

    override fun autentica(senha: Int): Boolean {
        return super<FuncionarioAdmin>.autentica(senha)
    }
}
package br.com.treino.model

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel{

    override val bonificacao: Double
        get() {
            return salario * 0.2// super chama o metodo da super class
        }

    override fun autentica(senha: Int): Boolean {
        return super<FuncionarioAdmin>.autentica(senha)
    }
}
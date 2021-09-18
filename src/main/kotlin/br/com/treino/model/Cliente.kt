package br.com.treino.model

class Cliente(
    val nome: String,
    val cpf: String,
    override val senha: Int
): Autenticavel {

    override fun autentica(senha: Int): Boolean {
        return super<Autenticavel>.autentica(senha)
    }

}
package br.com.treino.model

interface Autenticavel {

    val senha: Int//Não é indicado pois ha uma falha de segurança

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha){
            return true
        }
        return false
    }
}
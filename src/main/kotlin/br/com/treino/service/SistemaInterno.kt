package br.com.treino.service

import br.com.treino.model.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if(admin.autentica(senha)) {
            println("Autenticado com sucesso!")
        } else {
            println("Falha na autenticação!")
        }
    }
}
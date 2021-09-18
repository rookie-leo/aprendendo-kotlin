package br.com.treino.service

import br.com.treino.model.FuncionarioAdmin

class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if(admin.autentica(senha)) {
            println("Autenticado com sucesso!")
        } else {
            println("Falha na autenticação!")
        }
    }
}
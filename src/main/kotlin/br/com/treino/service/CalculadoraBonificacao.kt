package br.com.treino.service

import br.com.treino.model.Diretor
import br.com.treino.model.Funcionario
import br.com.treino.model.Gerente

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

}
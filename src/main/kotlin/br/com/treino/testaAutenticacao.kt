package br.com.treino

import br.com.treino.model.Diretor
import br.com.treino.model.Gerente
import br.com.treino.service.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Gerente",
        cpf = "111.111.111.11",
        salario = 1000.0,
        senha = 123
    )

    val diretor = Diretor(
        nome = "Diretora",
        cpf = "222.222.222.22",
        salario = 2000.0,
        senha = 456,
        plr = 200.0
    )

    val sistema = SistemaInterno()

    sistema.entra(gerente, 123)
    sistema.entra(diretor, 4565)
}
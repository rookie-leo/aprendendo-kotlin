package br.com.treino

import br.com.treino.model.Analista
import br.com.treino.model.Diretor
import br.com.treino.model.Funcionario
import br.com.treino.model.Gerente
import br.com.treino.service.CalculadoraBonificacao

fun testaFuncionarios() {
    val leo = Funcionario(
        "Leonardo",
        "111.111.111.11",
        1000.0
    )

    println("Nome: ${leo.nome}")
    println("CPF: ${leo.cpf}")
    println("Salario: ${leo.salario}")
    println("Bonificação: ${leo.bonificacao}")

    val jaq = Gerente(
        nome = "Jaqueline",
        cpf = "222.222.222.22",
        salario = 1500.0,
        senha = 123
    )

    if (jaq.autentica(123)) {
        println("Autenticado!")
        println("Nome: ${jaq.nome}")
        println("CPF: ${jaq.cpf}")
        println("Salario: ${jaq.salario}")
        println("Bonificação: ${jaq.bonificacao}")
    } else {
        println("Falha ao autenticar!")
    }

    val ana: Diretor = Diretor(
        nome = "Maria",
        cpf = "333.3333.333.33",
        salario = 2000.0,
        senha = 456,
        plr = 200.0
    )

    if (ana.autentica(senha = 456)) {
        println("Autenticado!")
        println("Nome: ${ana.nome}")
        println("CPF: ${ana.cpf}")
        println("Salario: ${ana.salario}")
        println("Bonificação: ${ana.bonificacao}")
        println("PLR: ${ana.plr}")
    } else {
        println("Falha ao autenticar!")
    }

    val maria: Funcionario = Analista(
//Quando se usa a classe mais generica, perdemos acesso a alguns recursos da classe
        nome = "Maria",
        cpf = "444.444.444.44",
        salario = 1650.99,
    )

    println("Nome: ${maria.nome}")
    println("CPF: ${maria.cpf}")
    println("Salario: ${maria.salario}")

    var calculadoraBonificacao = CalculadoraBonificacao()

    calculadoraBonificacao.registra(leo)
    calculadoraBonificacao.registra(jaq)
    calculadoraBonificacao.registra(ana)
    calculadoraBonificacao.registra(maria)
    println("Total bonificação: ${calculadoraBonificacao.total}")
}

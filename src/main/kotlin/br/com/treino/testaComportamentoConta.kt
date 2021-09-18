package br.com.treino

import br.com.treino.model.ContaCorrente
import br.com.treino.model.ContaPoupanca

fun testaComportamentoConta() {
    val contaLeo = ContaCorrente(titular = "Leo", numero = 1000)
    contaLeo.deposita(200.0)
    println(contaLeo.titular)
    println(contaLeo.numero)
    println(contaLeo.saldo)
    println("Depositando conta Leo")
    contaLeo.deposita(70.0)
    println(contaLeo.saldo)

    val contaJaq = ContaPoupanca(numero = 2000, titular = "Jaque")
    contaJaq.deposita(300.0)
    println(contaJaq.titular)
    println(contaJaq.numero)
    println(contaJaq.saldo)
    println("Depositando conta Jaque")
    contaJaq.deposita(20.0)
    println(contaJaq.saldo)

    println("Sacando conta Leo")
    contaLeo.saca(30.0)
    println(contaLeo.saldo)

    println("Sacando conta Jaque")
    contaJaq.saca(80.0)
    println(contaJaq.saldo)

    println("Saque em excesso conta Leo")
    contaLeo.saca(240.0)
    contaLeo.saca(240.0)
    println(contaLeo.saldo)

    println("Transfere uma grana ai")
    if (contaJaq.transfere(120.0, contaLeo)) {
        println("Transferencia ocorrida com sucesso!")
        println(contaJaq.saldo)
        println(contaLeo.saldo)
    } else {
        println("Saldo insulficiente!")
    }
}
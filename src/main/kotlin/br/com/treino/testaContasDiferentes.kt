package br.com.treino

import br.com.treino.model.ContaCorrente
import br.com.treino.model.ContaPoupanca

fun testaContasDiferentes() {
    val corrente = ContaCorrente(
        titular = "Leo",
        numero = 1000
    )

    val poupanca = ContaPoupanca(
        titular = "Jaque",
        numero = 1001
    )

    corrente.deposita(1000.0)
    poupanca.deposita(1000.0)

    println("Conta corrente: ${corrente.saldo}")
    println("Conta poupança: ${poupanca.saldo}")

    corrente.saca(100.0)
    poupanca.saca(100.0)

    println("Após saque - Conta corrente: ${corrente.saldo}")
    println("Após saque - Conta poupança: ${poupanca.saldo}")

    corrente.transfere(100.0, poupanca)

    println("Saldo conta corrente após transferencia para conta poupança: ${corrente.saldo}")
    println("Saldo conta poupança após receber transferencia da conta corrente: ${poupanca.saldo}")

    poupanca.transfere(150.50, corrente)

    println("Saldo conta poupança após transferencia para conta corrente: ${poupanca.saldo}")
    println("Saldo conta corrente após receber transferencia da conta poupança: ${corrente.saldo}")
}
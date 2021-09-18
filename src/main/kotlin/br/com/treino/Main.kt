package br.com.treino

import br.com.treino.model.ContaCorrente
import br.com.treino.model.ContaPoupanca

fun main() {
//    testaComportamentoConta()
//    testaFuncionarios()

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

    println("Conta corrente: ${corrente.getSaldo()}")
    println("Conta poupança: ${poupanca.getSaldo()}")

    corrente.saca(100.0)
    poupanca.saca(100.0)

    println("Após saque - Conta corrente: ${corrente.getSaldo()}")
    println("Após saque - Conta poupança: ${poupanca.getSaldo()}")

    corrente.transfere(100.0, poupanca)

    println("Saldo conta corrente após transferencia para conta poupança: ${corrente.getSaldo()}")
    println("Saldo conta poupança após receber transferencia da conta corrente: ${poupanca.getSaldo()}")

    poupanca.transfere(150.50, corrente)

    println("Saldo conta poupança após transferencia para conta corrente: ${poupanca.getSaldo()}")
    println("Saldo conta corrente após receber transferencia da conta poupança: ${corrente.getSaldo()}")
}








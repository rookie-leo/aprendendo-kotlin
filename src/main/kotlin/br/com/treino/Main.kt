package br.com.treino

fun main() {

    val contaLeo = Conta(titular = "Leo", numero = 1000)
    contaLeo.deposita(200.0)
    println(contaLeo.titular)
    println(contaLeo.numero)
    println(contaLeo.getSaldo())
    println("Depositando conta Leo")
    contaLeo.deposita(70.0)
    println(contaLeo.getSaldo())

    val contaJaq = Conta(numero = 2000, titular = "Jaque")
    contaJaq.deposita(300.0)
    println(contaJaq.titular)
    println(contaJaq.numero)
    println(contaJaq.getSaldo())
    println("Depositando conta Jaque")
    contaJaq.deposita(20.0)
    println(contaJaq.getSaldo())

    println("Sacando conta Leo")
    contaLeo.saca(30.0)
    println(contaLeo.getSaldo())

    println("Sacando conta Jaque")
    contaJaq.saca(80.0)
    println(contaJaq.getSaldo())

    println("Saque em excesso conta Leo")
    contaLeo.saca(240.0)
    contaLeo.saca(240.0)
    println(contaLeo.getSaldo())

    println("Transfere uma grana ai")
    if (contaJaq.transfere(120.0, contaLeo)) {
        println("Transferencia ocorrida com sucesso!")
        println(contaJaq.getSaldo())
        println(contaLeo.getSaldo())
    } else {
        println("Saldo insulficiente!")
    }
}

class Conta( //Construtor primario
    val titular: String,
    val numero: Int
) {
    private var saldo = 0.0
//        get() {
//            return field
//        } //implementacao padrao do metodo get

//    constructor(titular: String, numero: Int) {//Construtor secundario
//        this.titular = titular
//        this.numero = numero
//    }

    fun getSaldo(): Double {//Nao eh a forma mais ideal de se fazer
        return saldo
    }

    fun deposita(valor: Double) {
        if (valor > 0) saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        } else {
            saldo
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)

            return true
        }

        return false
    }
}



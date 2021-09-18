package br.com.treino.model

open class Conta( //Construtor primario
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

    open fun saca(valor: Double) {
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
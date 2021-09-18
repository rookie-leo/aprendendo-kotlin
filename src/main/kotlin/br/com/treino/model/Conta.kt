package br.com.treino.model

abstract class Conta( //Construtor primario
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set

//    constructor(titular: String, numero: Int) {//Construtor secundario
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double) {
        if (valor > 0) saldo += valor
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)

            return true
        }

        return false
    }
}
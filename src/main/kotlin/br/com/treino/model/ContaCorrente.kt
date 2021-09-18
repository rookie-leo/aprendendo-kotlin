package br.com.treino.model

class ContaCorrente(
    titular: String,
    numero: Int
): Conta(
    titular= titular,
    numero= numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.5
        super.saca(valorComTaxa)
    }
}
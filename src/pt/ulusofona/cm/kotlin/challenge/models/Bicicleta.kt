package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException

 abstract class Bicicleta(identificador: String) : Veiculo(identificador){

    override fun toString(): String {
        return "Bicicleta | $identificador | $dataDeAquisicao | $posicao"
    }
    override fun requerCarta(): Boolean {
        return false
    }

    @Throws(AlterarPosicaoException::class)
    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x, y)
    }
}

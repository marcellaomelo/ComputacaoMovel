package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import java.text.SimpleDateFormat

class Bicicleta(identificador: String) : Veiculo(identificador){

    override fun toString(): String {
        val data = SimpleDateFormat("dd-MM-yyyy")
        val dataFinal = data.format(dataDeAquisicao)
        return "Bicicleta | $identificador | $dataFinal | Posicao $posicao"
    }
    override fun requerCarta(): Boolean {
        return false
    }
    @Throws(AlterarPosicaoException::class)
    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x, y)
    }
}

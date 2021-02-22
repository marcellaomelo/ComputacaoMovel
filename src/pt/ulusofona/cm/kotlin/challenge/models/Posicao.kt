package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException

class Posicao (x: Int, y: Int){
    var x = x
    var y = y

    fun alterarPosicaoPara(x: Int, y:Int){
        if(this.x == x && this.y== y) {
            throw AlterarPosicaoException()
        }
        this.x = x
        this.y = y

    }

    override fun toString(): String {
        return "Posicao | x=$x | y=$y)"
    }
}

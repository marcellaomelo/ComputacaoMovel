package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

open abstract class Veiculo (id:String) : Movimentavel {

    var identificador = id
    lateinit var posicao: Posicao
    lateinit var dataDeAquisicao: Date


    open fun requerCarta(): Boolean {
        if (this is Carro) {
            return true
        }
        return false
    }

}

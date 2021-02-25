package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Veiculo (id:String) : Movimentavel {

    var identificador = id
    lateinit var posicao: Posicao
    lateinit var dataDeAquisicao: Date


    abstract fun requerCarta(): Boolean


    override var x: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    override var y: Int
        get() = TODO("Not yet implemented")
        set(value) {}

}

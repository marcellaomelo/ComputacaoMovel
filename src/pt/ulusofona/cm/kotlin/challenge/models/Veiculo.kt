package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

abstract class Veiculo (id:String) : Movimentavel {

    var id = id
    lateinit var posicao: Posicao
    lateinit var dataDeAquisicao: Date
//?innit
    init {
        this.posicao = Posicao(0,0)
        this.dataDeAquisicao = Date()
    }
     abstract fun requerCarta(): Boolean



}

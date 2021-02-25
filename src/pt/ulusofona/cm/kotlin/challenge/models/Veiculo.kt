package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

open abstract class Veiculo (var id:String) : Movimentavel {

    lateinit var posicao: Posicao
    lateinit var dataDeAquisicao: Date
//?innit
    init {
        this.posicao = Posicao(0,0)
        this.dataDeAquisicao = Date()
    }
     abstract fun requerCarta(): Boolean



}

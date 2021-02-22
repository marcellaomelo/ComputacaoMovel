package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

abstract class Veiculo (id:String){

    var identificador = id
    lateinit var posicao: Posicao
    lateinit var dataDeAquisicao: Date



    fun requerCarta(): Boolean{
        if(this is Carro){
            return true
        }
        return false
    }
}

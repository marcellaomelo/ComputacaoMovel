package pt.ulusofona.cm.kotlin.challenge.interfaces

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException


interface Ligavel {

    var eligado: Boolean
    @Throws(VeiculoLigadoException::class)
    fun ligar(){
        if(eligado){
            throw VeiculoLigadoException(mensagem = "")
        }
        eligado = true
    }
    @Throws(VeiculoDesligadoException::class)
    fun desligar()


    fun estaLigado() : Boolean
}


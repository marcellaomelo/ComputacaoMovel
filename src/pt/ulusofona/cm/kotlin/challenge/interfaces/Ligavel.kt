package pt.ulusofona.cm.kotlin.challenge.interfaces

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException


interface Ligavel {
    var eligado: Boolean
    fun ligar(){
        if(eligado){
            throw VeiculoLigadoException(mensagem = "")
        }
        eligado = true
    }
    fun desligar()

    fun estaLigado() : Boolean
}


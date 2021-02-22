package pt.ulusofona.cm.kotlin.challenge.interfaces

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException


interface ligavel {
    var eligado: Boolean
    fun ligar(){
        if(eligado){
            throw VeiculoLigadoException()
        }
        eligado = true
    }
    fun desligar(){
        if(!eligado){
            throw VeiculoDesligadoException()
        }
        eligado = false
    }

    fun estaLigado() : Boolean{
        return eligado
    }
}


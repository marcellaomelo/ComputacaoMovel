package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

 class Motor ( var cilindrada:Int, var cavalos: Int): Ligavel {

    var ligado = false
    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada)"
    }

     override fun ligar() {
        if (this.ligado) {
            throw VeiculoLigadoException("")
        } else {
            this.ligado= true
        }
    }
    override fun desligar() {
        if (this.ligado) {
            this.ligado = false

        } else {
            throw VeiculoDesligadoException("")

        }
    }
    override fun estaLigado(): Boolean {
        return this.ligado
    }




}

package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import java.text.SimpleDateFormat

 class Carro (id: String, var motor: Motor) : Veiculo(id), Ligavel{

    override fun requerCarta(): Boolean {
        return true
    }

     override var x: Int
         get() = TODO("Not yet implemented")
         set(value) {}
     override var y: Int
         get() = TODO("Not yet implemented")
         set(value) {}


     @Throws(AlterarPosicaoException::class)
    override fun moverPara(x: Int, y: Int) {
        if(motor.estaLigado()){
            posicao.alterarPosicaoPara(x, y)
            motor.desligar()

        }
        motor.ligar()
    }

     override var eligado: Boolean
         get() = TODO("Not yet implemented")
         set(value) {}


     override fun ligar() {
        motor.ligar()
    }
    override fun estaLigado(): Boolean {
        return motor.estaLigado()
    }

    override fun desligar() {
        motor.desligar()
    }



    override fun toString(): String {
        return "Carro | ${this.id} | $dataDeAquisicao | $posicao"
    }



}

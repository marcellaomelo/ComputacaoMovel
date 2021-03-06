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


     @Throws(AlterarPosicaoException::class)
    override fun moverPara(x: Int, y: Int) {
        if(motor.estaLigado()){
            posicao.alterarPosicaoPara(x, y)
            motor.desligar()

        }
        motor.ligar()
    }

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
        return "Carro | ${this.id} | $dataDeAquisicao | Posicao $posicao"
    }



}

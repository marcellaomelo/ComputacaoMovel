package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException

abstract class Carro (id: String, motor: Motor) : Veiculo(id){

    var motor = motor


    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | $posicao"
    }

    fun move(pessoa: Pessoa){
        if(pessoa.temCarta() == false){
            throw PessoaSemCartaException(pessoa.nome)
        }
        if(this.motor.ligado== false){
            throw VeiculoDesligadoException(mensagem = "")
        }
        ///mover carro

    }

}

package pt.ulusofona.cm.kotlin.challenge.models

import jdk.nashorn.internal.objects.Global.getDate
import jdk.nashorn.internal.objects.NativeDate.getDate
import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import java.time.LocalDateTime
import java.util.*

class Pessoa (nome: String, dataDeNascimento: Date){
    var nome: String = ""
    lateinit var veiculos: List<Veiculo>
    var dataDeNascimento: Date = dataDeNascimento
    lateinit var posicao: Posicao
    var carta: Carta? = null

    fun comprarVeiculo(veiculo:Veiculo){

    }

    fun pesquisarVeiculo(id: String) : Veiculo?{
        for (i in veiculos){
            if(i.identificador.equals(id)){
                return i
            }
        }
        throw VeiculoNaoEncontradoException()
    }
    fun venderVeiculo(id: String, comprador: Pessoa){

    }

    fun moverVeiculoPara(id: String, x: Int, y: Int){

    }
    fun temCarta(): Boolean{
        if(carta == null){
            return false
        }
        return true
    }
    fun tirarCarta(){
        var dataAtual: Date = Date()
        if(dataAtual.year - dataDeNascimento.year < 18){
            throw MenorDeIdadeException()
        }
        carta = Carta()

    }

    override fun toString(): String {
        return "Pessoa | $nome | $dataDeNascimento | $posicao "
    }


}

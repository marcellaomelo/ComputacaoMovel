package pt.ulusofona.cm.kotlin.challenge.models

//import jdk.nashorn.internal.objects.Global.getDate
//import jdk.nashorn.internal.objects.NativeDate.getDate
import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
//import java.time.LocalDateTime
import java.util.*

data class Pessoa (var nome: String, val dataDeNascimento: Date): Movimentavel{
    override var x: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    override var y: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    var veiculos: ArrayList<Veiculo> = ArrayList()
    lateinit var posicao: Posicao
    var carta: Carta? = null

    fun comprarVeiculo(veiculo:Veiculo){
        veiculos.add(veiculo)
    }
    @Throws(VeiculoNaoEncontradoException::class)
    fun pesquisarVeiculo(id: String) : Veiculo?{
        for (i in veiculos){
            if(i.identificador.equals(id)){
                return i
            }
        }
        throw VeiculoNaoEncontradoException(mensagem = "")
    }
    fun venderVeiculo(id: String, comprador: Pessoa){

    }

    fun moverVeiculoPara(id: String, x: Int, y: Int){
        for (i in veiculos) {
            if (i.identificador.equals(id) ) {
                if (i.requerCarta() && !temCarta()) {
                    throw PessoaSemCartaException("")
                }
                i.moverPara(x,y)
            }
        }

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
            throw MenorDeIdadeException(mensagem = "")
        }
        carta = Carta()

    }

    override fun toString(): String {
        return "Pessoa | $nome | $dataDeNascimento | $posicao "
    }


}

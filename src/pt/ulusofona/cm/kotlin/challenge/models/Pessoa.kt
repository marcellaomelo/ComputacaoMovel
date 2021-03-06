package pt.ulusofona.cm.kotlin.challenge.models

//import jdk.nashorn.internal.objects.Global.getDate
//import jdk.nashorn.internal.objects.NativeDate.getDate
import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.MenorDeIdadeException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
//import java.time.LocalDateTime
import java.util.*

data class Pessoa (var nome: String, val dataDeNascimento: Date): Movimentavel{

    var veiculos: ArrayList<Veiculo> = ArrayList()
    lateinit var posicao: Posicao
    var carta: Carta? = null

    fun comprarVeiculo(veiculo:Veiculo){
        veiculos.add(veiculo)
    }
    @Throws(VeiculoNaoEncontradoException::class)
    fun pesquisarVeiculo(id: String) : Veiculo?{
        for (i in veiculos){
            if(i.id.equals(id)){
                return i
            }
        }
        throw VeiculoNaoEncontradoException(mensagem = "")
    }

    fun venderVeiculo(id: String, x: Pessoa){
        for (veiculo in veiculos) {
            if (veiculo.id.equals(id) ) {
                x.comprarVeiculo(veiculo)
                veiculos.remove(veiculo)
            }
        }

    }
    @Throws(AlterarPosicaoException::class, PessoaSemCartaException::class)

    fun moverVeiculoPara(id: String, x: Int, y: Int){
        for (i in veiculos) {
            if (i.id.equals(id) ) {
                if (i.requerCarta() && !temCarta()) {
                    throw PessoaSemCartaException("$nome não tem carta para conduzir o veículo indicado")
                }
                i.moverPara(x,y)
            }
        }

    }
    override fun moverPara(x: Int, y: Int) {
        posicao.alterarPosicaoPara(x, y)
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

}



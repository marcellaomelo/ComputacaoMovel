package pt.ulusofona.cm.kotlin.challenge.models

class Motor (cavalos: Int, cilindrada:Int){
    var cavalos : Int = 0
    var cilindrada : Int = 0
    var ligado : Boolean = false
    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada)"
    }




}

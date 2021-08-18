fun main() {
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33
    val idade4 = 20

    val maiorIdade: Int = if (idade1 > idade2 && idade1 > idade3) {
        idade1
    } else if (idade2 > idade3) {
        idade2
    } else {
        idade3
    }

    println(maiorIdade)

    val idades = IntArray(size = 4)
    idades[0] = idade1
    idades[1] = idade2
    idades[2] = idade3
    idades[3] = idade4

    var maiorIdade2 = 0
    for (idade in idades){
        if(idade  > maiorIdade2){
            maiorIdade2 = idade
        }
    }

    println(maiorIdade2)
}
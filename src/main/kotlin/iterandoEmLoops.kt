fun iterandoEmLoops() {
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

    val idades = intArrayOf(25, 19, 33, 20, 55, 40)

    var maiorIdade2 = 0
    for (idade in idades) {
        if (idade > maiorIdade2) {
            maiorIdade2 = idade
        }
    }

    println(maiorIdade2)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println(menorIdade)
}
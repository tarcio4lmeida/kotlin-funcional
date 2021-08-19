fun operacoesAgregadoras() {
    val idades: IntArray = intArrayOf(10, 18, 33, 40, 67)

    val media = idades.average()

    println("maiorIdade: $media")

    val todosMaiores = idades.all {
        it > 18
    }
    println("todos maiores?: $todosMaiores")

    val peloMenosUmMaior = idades.any {
        it >= 18
    }
    println("Pelo menos um maior?: $peloMenosUmMaior")

    val maiores = idades.filter {
        it >= 18
    }

    println("Maiores que 18: $maiores")

    val alguemMaiorQue18 = idades.find {
        it >= 18
    }

    println("Maiores que 18: $alguemMaiorQue18")
}

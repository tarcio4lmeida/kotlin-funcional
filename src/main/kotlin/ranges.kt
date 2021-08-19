fun ranges() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s")
    }

    println()

    val numerosPares = 0..100 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar")
    }

    println()

    val numerosParesReversos = 100 downTo 0 step 2
    for (numeroParReverso in numerosParesReversos) {
        print("$numeroParReverso")
    }
}

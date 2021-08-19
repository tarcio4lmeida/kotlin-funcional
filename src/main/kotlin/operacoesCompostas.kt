import java.math.BigDecimal
import java.math.RoundingMode

fun funOperacoesCompostas() {
    val salarios: Array<BigDecimal> = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

    println(salarios.contentToString())

    val aumento: BigDecimal = "1.1".toBigDecimal()
    val salariosComAumento = salarios
        .map { salario ->
            calculaAumentoRelativo(salario, aumento)
        }.toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()

    println(gastoInicial)

    val meses = 6.toBigDecimal()

    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println(gastoTotal)


    val mediaMaioresSalarios = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    println(mediaMaioresSalarios)
}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000.00".toBigDecimal()) {
        salario + "500.00".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }



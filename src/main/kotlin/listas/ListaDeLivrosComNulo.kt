package listas

fun main() {
    val listaLivrosComNulos: MutableList<Livro> = mutableListOf(

        Livro(
            titulo = "Grande Sertão: Veredas",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1956
        ),
        Livro(
            titulo = "Minha vida de menina",
            autor = "Helena Morley",
            anoPublicacao = 1942,
            editora = "Editora A"
        ),
        Livro(
            titulo = "Memórias Póstumas de Brás Cubas",
            autor = "Machado de Assis",
            anoPublicacao = 1881
        ),
        Livro(
            titulo = "Iracema",
            autor = "José de Alencar",
            anoPublicacao = 1865,
            editora = "Editora B"
        )
    )

    listaLivrosComNulos
        .groupBy { it.editora ?: "Editora Desconhecida" }
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString { it?.titulo }}")
        }
    }

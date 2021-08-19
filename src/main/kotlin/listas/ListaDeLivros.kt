import listas.Livro
import listas.imprimeComMarcadores

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf<Livro>(livro1, livro2, livro3, livro4)
    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1956
        )
    )

    println(livros)

    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()

    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorAutor = livros.sortedBy {
        it.autor
    }.imprimeComMarcadores()

    val titulos: List<String> = livros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map {
            it.titulo
        }

    println(titulos)

    val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(

        null,
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
}


package desafio

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val id: Int, val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")


    val cursoKotlin = ConteudoEducacional("Kotlin", 120)
    val cursoJava = ConteudoEducacional("Java", 120)

    val listaConteudo = mutableListOf<ConteudoEducacional>(cursoKotlin, cursoJava)

    val formacao = Formacao("Bootcamp-TQI", listaConteudo, Nivel.INTERMEDIARIO)

    val use1 = Usuario(1, "Eduardo")
    val use2 = Usuario(2, "Thaynara")

    formacao.matricular(use1)
    formacao.matricular(use2)
    println(formacao)



}



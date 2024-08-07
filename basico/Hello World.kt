/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

package eu.mozzby.play               // 1. Definição do pacote (algo muito comum para a organização do código)

fun main() {                        // 2. Ponto de entrada de um código kotlin, definido pela função [main]
    println("Hello, World!")        // 3. imprime na saida padrão um texto, pulando a linha (nova linha)
    print("Hello, World!")         // 3.1. imprime na saida padrão um texto, na linha (mesma linha)
}
-------------------------------------
fun main() {
    // Define a variável 'name' e atribui a ela o valor "Hello, Kotlin learner!"
    val name: String = "Hello, Kotlin learner!"
    
    // Imprime o valor da variável 'name'
    println(name)
}

Explicação:
val name: String = "Hello, Kotlin learner!" está declarando uma variável imutável name com o tipo explícito String.
println(name) imprime o valor da variável name no console.
Declarar o tipo de variável explicitamente é uma prática comum quando você quer garantir que o tipo da variável seja claro para quem lê o código
ou quando o tipo não pode ser inferido automaticamente pelo compilador. No entanto, se o tipo é óbvio a partir do valor atribuído, você pode omitir
o tipo e deixar o Kotlin inferir automaticamente, como em val name = "Hello, Kotlin learner!".

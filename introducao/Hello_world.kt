/**
 * Olá, Mundo!
 *
 * @see [Hello World](https://play.kotlinlang.org/byExample/01_introduction/01_Hello%20world)
 */

package eu.octoelli.helloworld           // 1. Definição do pacote, algo muito comum para organização de código (apesar de opcional).

fun main() {                        // 2. Ponto de entrada de um código Kotlin, definido pela função [main].
    println("Olá, Mundo!")          // 3. Imprime na saída padrão um texto usando a função [println] (importada implicitamente).
}

/*
Em um navegador da Web no computador, abra o Playground Kotlin: https://play.kotlinlang.org/
Quando você clica no botão Executar, muita coisa acontece. O código na linguagem de programação Kotlin deve ser entendido por humanos,
para que as pessoas possam ler, escrever e colaborar com mais facilidade em programas Kotlin. No entanto, seu computador não entende
imediatamente esse idioma.

Você precisa de algo chamado compilador Kotlin, que pega o código Kotlin que você escreveu, analisa-o linha por linha e o traduz em algo 
que o computador possa entender. Esse processo é chamado de compilação do código.

Se o código for compilado com êxito, o programa será executado (ou executado). Quando o computador executa seu programa, ele executa cada
uma de suas instruções. Se você já seguiu uma receita culinária, executar cada etapa da receita é considerado executar cada instrução.
*/

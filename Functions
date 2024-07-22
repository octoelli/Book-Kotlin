Funções
Valores de parâmetro padrão e argumentos nomeados
fun printMessage(message: String): Unit {                               // 1
    println(message)
}
​
fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")
}
​
fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}
​
fun multiply(x: Int, y: Int) = x * y                                    // 4
​
fun main() {
    printMessage("Hello")                                               // 5                    
    printMessageWithPrefix("Hello", "Log")                              // 6
    printMessageWithPrefix("Hello")                                     // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
    println(sum(1, 2))                                                  // 9
    println(multiply(2, 4))                                             // 10
}
Aberto no Playground →
Destino: JVM
Em execução na v.2.0.0
Uma função simples que usa um parâmetro de tipo e retorna (ou seja, nenhum valor de retorno).StringUnit
Uma função que leva um segundo parâmetro opcional com valor padrão Info. O tipo de retorno é omitido, o que significa que ele é realmente .Unit
Uma função que retorna um inteiro.
Uma função de expressão única que retorna um inteiro (inferido).
Chama a primeira função com o argumento .Hello
Chama a função com dois parâmetros, passando valores para ambos.
Chama a mesma função omitindo a segunda. O valor padrão é usado.Info
Chama a mesma função usando argumentos nomeados e alterar a ordem dos argumentos.
Imprime o resultado da chamada de função.sum
Imprime o resultado da chamada de função.multiply
Funções infixas
Funções de membro e extensões com um único parâmetro podem ser transformadas em funções infix.
fun main() {
​
  infix fun Int.times(str: String) = str.repeat(this)        // 1
  println(2 times "Bye ")                                    // 2
​
  val pair = "Ferrari" to "Katrina"                          // 3
  println(pair)
​
  infix fun String.onto(other: String) = Pair(this, other)   // 4
  val myPair = "McLaren" onto "Lucas"
  println(myPair)
​
  val sophia = Person("Sophia")
  val claudia = Person("Claudia")
  sophia likes claudia                                       // 5
}
​
class Person(val name: String) {
  val likedPeople = mutableListOf<Person>()
  infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}
Aberto no Playground →
Destino: JVM
Em execução na v.2.0.0
Define uma função de extensão infix no .Int
Chama a função infix.
Cria um chamando a função infix da biblioteca padrão.Pairto
Aqui está a sua própria implementação do chamado criativo .toonto
A notação Infix também funciona em funções de membros (métodos).
A classe que contém torna-se o primeiro parâmetro.
Observe que o exemplo usa Funções locais (funções aninhadas em outra função).
Funções do operador
Certas funções podem ser "atualizadas" para Operadores, permitindo suas chamadas com o símbolo do operador correspondente.
operator fun Int.times(str: String) = str.repeat(this)       // 1
println(2 * "Bye ")                                          // 2
​
operator fun String.get(range: IntRange) = substring(range)  // 3
val str = "Always forgive your enemies; nothing annoys them so much."
println(str[0..14])                                          // 4
Aberto no Playground →
Destino: JVM
Em execução na v.2.0.0
Isso leva a função infix de cima um passo adiante usando o modificador.operator
O símbolo do operador para é para que você possa chamar a função usando .times()*2 * "Bye"
Uma função de operador permite fácil acesso de alcance em strings.
O operador habilita get()sintaxe de acesso entre colchetes.
Funções com parâmetrosvararg
Varargs permitem que você passe qualquer número de argumentos separando-os com vírgulas.
fun printAll(vararg messages: String) {                            // 1
    for (m in messages) println(m)
}
printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2
​
fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
    for (m in messages) println(prefix + m)
}
printAllWithPrefix(
    "Hello", "Hallo", "Salut", "Hola", "你好",
    prefix = "Greeting: "                                          // 4
)
​
fun log(vararg entries: String) {
    printAll(*entries)                                             // 5
}
log("Hello", "Hallo", "Salut", "Hola", "你好")
Aberto no Playground →
Destino: JVM
Em execução na v.2.0.0
O modificador transforma um parâmetro em um vararg.vararg
Isso permite chamar com qualquer número de argumentos de cadeia de caracteres.printAll
Graças aos parâmetros nomeados, você pode até adicionar outro parâmetro do mesmo tipo após o vararg. Isso não seria permitido em Java porque não há como passar um valor.
Usando parâmetros nomeados, você pode definir um valor para separadamente do vararg.prefix
Em tempo de execução, um vararg é apenas uma matriz. Para passá-lo para um parâmetro vararg, use o operador spread especial que permite que você passe (um vararg de ) em vez de (um ).**entriesStringentriesArray<String>

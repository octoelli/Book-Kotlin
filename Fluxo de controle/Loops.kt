O Kotlin é compatível com todos os loops comumente usados: , , forw    hile    do-while

<h1>for</h1>
for em Kotlin funciona da mesma maneira que na maioria das linguagens.
val cakes = listOf("carrot", "cheese", "chocolate")
​
for (cake in cakes) {                               // 1    Percorre cada bolo da lista.
    println("Yummy, it's a $cake cake!")
}
​
------------------------------------------------------
fun main() {

    val cakes = listOf("carrot", "cheese", "chocolate")
    
    for (cake in cakes) {                               // 1
        println("Yummy, it's a $cake cake!")
    }


}

Link: https://pl.kotl.in/BatrLfJt1

Yummy, it's a carrot cakes!
Yummy, it's a cheese cakes!
Yummy, it's a chocolate cakes!
------------------------------------------------------


<h1>while e do-while</h1>
while e as construções funcionam de forma semelhante à maioria das linguagens também.do-while
fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")
​
fun main(args: Array<String>) {
    var cakesEaten = 0
    var cakesBaked = 0
    
    while (cakesEaten < 5) {                    // 1  Executa o bloco enquanto a condição é verdadeira.
        eatACake()
        cakesEaten ++
    }
    
    do {                                        // 2  Executa o bloco primeiro e depois verifica a condição.
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
​
}




<1>Iteradores</h1>
Você pode definir seus próprios iteradores em suas classes implementando o operador neles.iterator
class Animal(val name: String)
​
class Zoo(val animals: List<Animal>) {
​
    operator fun iterator(): Iterator<Animal> {             // 1  Define um iterador em uma classe. Ele deve ser nomeado e ter o modificador.iteratoroperator
        return animals.iterator()                           // 2  Retorna o iterador que atende aos seguintes requisitos de método:
                                                                                                                                  next(): Animal
                                                                                                                                  hasNext(): Boolean
    }
}
​
fun main() {
​
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
​
    for (animal in zoo) {                                   // 3  Percorre os animais no zoológico com o iterador definido pelo usuário.
        println("Watch out, it's a ${animal.name}")
    }
​
}





O iterador pode ser declarado no tipo ou como uma função de extensão.

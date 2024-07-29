fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {                                
    when (obj) {                                     // 1	Esta é uma afirmação.when 
        1 -> println("One")                          // 2	Verifica se é igual a .obj
        "Hello" -> println("Greeting")               // 3	Verifica se é igual a .obj"Hello"
        is Long -> println("Long")                   // 4	Executa a verificação de tipo.
        !is String -> println("Not a string")        // 5	Executa a verificação de tipo inverso.
        else -> println("Unknown")                   // 6	Instrução padrão (pode ser omitida)
    }   
}

class MyClass

Observe que todas as condições de ramificação são verificadas sequencialmente até que uma delas seja satisfeita. Portanto, apenas a primeira ramificação adequada será executada.


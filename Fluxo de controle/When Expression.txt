fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {                   // 1	Esta é uma expressão.when
        1 -> "one"                              // 2	Define o valor como se for igual a ."one"obj1
        "Hello" -> 1                            // 3	Define o valor como um se for igual a .obj"Hello"
        is Long -> false                        // 4	Define o valor como if é uma instância de .falseobjLong
        else -> 42                              // 5	Define o valor se nenhuma das condições anteriores for atendida. Ao contrário da instrução in, a ramificação padrão geralmente é necessária na expressão, exceto no caso em que o compilador pode verificar se outras ramificações cobrem todos os casos possíveis.42whenwhen
    }
    return result
}

class MyClass

Na pratica [link](<iframe src="https://pl.kotl.in/oFQty5Odj"></iframe>)

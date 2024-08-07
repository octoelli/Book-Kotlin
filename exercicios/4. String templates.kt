/*
  4. Modelos de string
Este programa informa os usuários sobre a próxima venda promocional de um item específico. Ele tem um modelo de string, que depende da discountPercentagevariável para o desconto percentual e da itemvariável para o item em promoção. No entanto, há erros de compilação no código.


fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}
Você consegue descobrir a causa raiz dos erros e corrigi-los?
Você pode determinar a saída deste programa antes de executar o código no Kotlin Playground?
Dica: É possível reatribuir um valor a uma variável somente leitura?

Depois de corrigir os erros, o programa deverá compilar sem erros e imprimir esta saída:


Sale - Up to 20% discount on Google Chromecast! Hurry up!

Modelos de strings
Os erros de compilação são o resultado da atribuição das discountPercentagevariáveis
offer​​somente leitura e a novos valores;essa atribuição não é permitida.
*/

fun main() {
    val discountPercentage = 20
    val item = "Google Chromecast"
    val offer = "Sale  - Up to $discountPercentage% discount off $item! Hurry Up!"

    println(offer)
}
/*
Como uma solução alternativa, você pode declarar o discountPercentageinteiro e offera string com
a varpalavra-chave. No entanto, seus valores são imutáveis ​​no contexto do programa, então você pode ficar com a valpalavra-chave.

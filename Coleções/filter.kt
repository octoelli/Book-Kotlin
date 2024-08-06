A função de filtro permite filtrar coleções.
le usa um predicado de filtro como um parâmetro lambda. 
O predicado é aplicado a cada elemento. 
Os elementos que compõem o predicado são retornados na coleção de resultados. true

val numbers = listOf(1, -2, 3, -4, 5, -6)      // 1 Define a coleção de números.

val positives = numbers.filter { x -> x > 0 }  // 2 Obtém números positivos: [1, 3, 5]

val negatives = numbers.filter { it < 0 }      // 3 Usa a notação mais curta para obter números negativos "it": [-2, -4, -6] 

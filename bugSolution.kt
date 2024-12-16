fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = mutableListOf<Int>()
    for (i in list) {
        if (i <= 2) newList.add(i)
    }
    println(newList) // Output: [1, 2]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    list2.removeAll { it > 2 }
    println(list2) // Output: [1, 2]
}
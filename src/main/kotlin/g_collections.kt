fun printAll(strings: Collection<String>) {
    for (s in strings) print("$s ")
    println()
}

fun main(){
    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)

    /**
     * Koleksi biasanya berisi sejumlah objek (mungkin berjumlah 0) yang memiliki tipe yang sama.
    Objek dalam sebuah koleksi dipanggil dengan elemen atau item.
     */
}
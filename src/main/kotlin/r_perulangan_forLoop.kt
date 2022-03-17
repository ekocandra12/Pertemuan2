fun main() {
//The for loop
    for (i in 1..10) {
        print("$i ")
    }
    print('\n')
    print('\n')
    val arrInt = arrayOf(1, 2, 3, 4)
    for (i in arrInt) println("values of the array " +i)

    print('\n')
    val listInt = listOf(1, 22, 83, 4)
    for ((index, value) in listInt.withIndex()) {
        println("the element at $index is $value")
    }

    /**
     * Kotlin tidak memiliki tradisional for-loop seperti di Java 7 dan dibawahnya.
     * For-loop di Kotlin menggunakan iterator untuk mengakses elemen. Mirip dengan konsep for-
    each di JavaScript, C# atau Java 8.
     */
}
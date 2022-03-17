fun main (){
    var arrA = arrayOf<Int>()
    arrA += 34
    println(arrA[0])

    var arrB = arrayOf<Int>()
    for (i in 1..10) {
        arrB += i
    }

    for (i in arrB){
        print("$i ")
    }

    /**
     * Array adalah koleksi data yang sejenis. Untuk membuat sebuah array bisa menggunakan fungsi
    arrayOf() dan melewatkan nilai item kepada array tersebut, jadi arrayOf(1,2,3) berarti membuat
    array dengan item [1,2,3].
     */
}
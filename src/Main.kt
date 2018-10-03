import java.lang.NumberFormatException

fun main(args: Array<String>) {
    try {
        print("Angka pertama: ")
        val angka1 = readLine()?.let { it.toInt() }
        print("Angka kedua: ")
        val angka2 = readLine()?.let { it.toInt() }
        println("Masukkan pilihan kalkulator: \n 1. Perkalian \n 2. Pembagian \n 3. Penjumlahan \n 4. Pengurangan \n Pilihan anda: \n")
        val pilihan = readLine()?.let { it.toInt() }
        val perkalian1: (Int, Int) -> Int = { s1, s2 -> s1 * s2 }
        val pembagian1: (Int, Int) -> Int = { s1, s2 -> s1 / s2 }
        val penjumlahan1: (Int, Int) -> Int = { s1, s2 -> s1 + s2 }
        val pengurangan1: (Int, Int) -> Int = { s1, s2 -> s1 - s2 }
        if (angka1 != null && angka2 != null) {
            val angka1: Int = angka1!!
            val angka2: Int = angka2!!
            when (pilihan) {
                1 -> hasil(angka1, angka2, perkalian1)
                2 -> hasil(angka1, angka2, pembagian1)
                3 -> hasil(angka1, angka2, penjumlahan1)
                4 -> hasil(angka1, angka2, pengurangan1)
                else -> {
                    println("Pilihan anda tidak ada")
                }
            }
        }

    } catch (ex: NumberFormatException) {
        println("Maaf yang boleh di inputkan hanya angka dan tidak boleh ada yang kosong dan null")
    }
}

fun hasil(angka1: Int, angka2: Int, result:
(Int, Int) -> Int) {
    try {
        val res = result(angka1, angka2)
        println(res)
    } catch (ex: NumberFormatException) {
        println("Maaf yang boleh di inputkan hanya angka")
    }

}
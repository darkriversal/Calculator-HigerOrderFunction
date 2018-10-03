import java.lang.NumberFormatException

fun main(args: Array<String>) {
    try {
    print("Angka pertama: ")
    val angka1 = readLine()!!
    print("Angka kedua: ")
    val angka2 = readLine()!!
    println("Masukkan pilihan kalkulator: \n 1. Perkalian \n 2. Pembagian \n 3. Penjumlahan \n 4. Pengurangan \n Pilihan anda: \n")
    val pilihan = readLine()!!
    val perkalian1: (Int, Int) -> Int = {s1, s2 -> s1*s2}
    val pembagian1: (Int, Int) -> Int = {s1, s2 -> s1/s2}
    val penjumlahan1: (Int, Int) -> Int = {s1, s2 -> s1+s2}
    val pengurangan1: (Int, Int) -> Int = {s1, s2 -> s1-s2}
    when (pilihan.toInt()){
        1 -> hasil(angka1.toInt(), angka2.toInt(), perkalian1)
        2 -> hasil(angka1.toInt(), angka2.toInt(), pembagian1)
        3 -> hasil(angka1.toInt(), angka2.toInt(), penjumlahan1)
        4 -> hasil(angka1.toInt(), angka2.toInt(), pembagian1)
        else -> {
            println("Pilihan anda tidak ada")
        }
    }
    } catch (ex: NumberFormatException){
        println("Maaf yang boleh di inputkan hanya angka dan tidak boleh ada yang kosong")
    }
}

fun hasil(angka1: Int, angka2: Int, result:
(Int, Int) -> Int){
    val res = result(angka1, angka2)
    println(res)
}
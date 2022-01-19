fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    var max = a // try to avoid var if possible
    if (b > a) max = b

    println(max)

}
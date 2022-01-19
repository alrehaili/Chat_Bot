fun main() {
    val one = readLine()!!.toInt()
    val two = readLine()!!.toInt()
    val three = readLine()!!.toInt()
    val four = readLine()!!.toInt()
    val five = readLine()!!.toInt()
    println( five in one..two && five in three..four )
}
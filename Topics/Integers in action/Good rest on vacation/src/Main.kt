fun main() {
    val days = readLine()!!.toInt()
    val costPday = readLine()!!.toInt()
    val flight = readLine()!!.toInt()
    val hotelPnight = readLine()!!.toInt()

    println( (flight*2) + ((days-1) * hotelPnight) + (costPday*days))
}
fun main() {    
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()
    val H = readLine()!!.toInt()

    if (H >= A && H <=B)
        println("Normal")
    else if (H < A)
        println("Deficiency")
    else if (H > B)
        println("Excess")
}
fun main() {
    val num = readLine()!!.toInt()
    if (num > 0)
        println("positive")
    else if (num < 0)
        println("negative")
    else
        println("zero")
}
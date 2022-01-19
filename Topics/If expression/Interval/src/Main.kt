fun main() {
    val num = readLine()!!.toInt()
    if ( (-15 < num && num <= 12)  || (num in 15..16)
        || (19 <= num && num > 0))
        println("True")
    else
        println("False")
}
fun main() {
    var num = 0
    do {
        val n =readLine()!!.toInt()
        if ( n > num )
        num=n
    } while (n !=0)
    println(num.toString())
}
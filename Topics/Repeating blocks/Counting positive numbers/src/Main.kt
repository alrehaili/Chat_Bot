fun main() {
    val num = readLine()!!.toInt()
    var positive = 0
    repeat(num){
        val n = readLine()!!.toInt()
        if (n > 0)
            positive++
    }
    println(positive.toString())
}
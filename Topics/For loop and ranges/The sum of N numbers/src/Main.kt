fun main() {
    val number= readLine()!!.toInt()
    var n = 0
    for ( i in 1..number){
        n += readLine()!!.toInt()
    }
    println(n.toString())
}
fun main() {
    val number = readLine()!!.toInt()
    var max = 0

    repeat(number){
        var scan = readLine()!!.toInt()
        if ( scan % 4 == 0 && scan > max )
        {
            max = scan
        }
    }

    println(max.toString())

}
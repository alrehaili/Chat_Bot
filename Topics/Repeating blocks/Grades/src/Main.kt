fun main() {
    var number = readLine()!!.toInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(number){
        var n = readLine()!!.toInt()
        when (n) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }
    println("$d $c $b $a")

}
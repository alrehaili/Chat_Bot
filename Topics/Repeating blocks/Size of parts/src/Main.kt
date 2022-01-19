fun main() {
    var number = readLine()!!.toInt()
    var perfect = 0
    var larger = 0
    var smaller = 0
    repeat(number){
        var n = readLine()!!.toInt()
        if (n == 0)
            perfect++
        else if (n > 0)
            larger++
        else
            smaller++
    }
    print("$perfect $larger $smaller")
}
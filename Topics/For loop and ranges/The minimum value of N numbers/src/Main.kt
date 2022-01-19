fun main() {
    val number= readLine()!!.toInt()
    var mini = readLine()!!.toInt();
    var value: Int
    repeat(number-1){
        value = readLine()!!.toInt();
        if (value < mini)
            mini = value
    }
    println(mini.toString())

}
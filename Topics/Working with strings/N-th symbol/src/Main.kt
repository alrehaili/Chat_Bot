fun main() {
    val word = readLine()!!.toString()
    val num = readLine()!!.toInt()

    print("Symbol # $num of the string \"$word\" is '${word[num-1]}'")


}
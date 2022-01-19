fun main() {
    val num = readLine()!!.toInt()
    val num0 = (num / 10) / 10
    val num1 = (num / 10) % 10
    val num2 = (num % 10 )
    println(num0+num1+num2)
}
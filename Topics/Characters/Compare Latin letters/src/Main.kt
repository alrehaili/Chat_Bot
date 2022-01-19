fun main() {
    val one = readLine()!!.first()
    val two = readLine()!!.first()

    print(one.equals(two, ignoreCase = true))
}
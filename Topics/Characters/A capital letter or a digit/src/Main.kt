fun main() {
    val ch = readLine()!!.first()
    print(ch.isUpperCase() || (ch.isDigit() && ch != '0'))
}
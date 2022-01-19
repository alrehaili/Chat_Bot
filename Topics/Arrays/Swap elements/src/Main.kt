fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toIntArray()
    // Do not touch lines above
    // Write only exchange actions here.
    var temp = numbers[numbers.lastIndex]
    var temp2 = numbers[0]
    numbers[0] = temp
    numbers[numbers.lastIndex]= temp2

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}
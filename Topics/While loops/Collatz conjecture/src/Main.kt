fun main() {
    var n = readLine()!!.toInt()

    while (n !=1 ){
        print("$n ")
        if (n % 2 == 0) {
            n /= 2
        } else {
            n *= 3
            n++
        }
    }
    print("$n ")
}
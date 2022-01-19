fun main() {

    val word = readLine()

    print("${word?.length} repetitions of the word $word: ")
    print("$word".repeat(word?.length ?: 0))
}
fun main() {
    val index = readln().toInt()
    val word = readln()
    if (index >= word.length || index < 0) {
        println("There isn't such an element in the given string, please fix the index!")
    } else {
        println(word[index])
    }
}
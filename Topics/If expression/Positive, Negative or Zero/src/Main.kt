fun main() {
    // write your code here
    val number = readln().toInt()

    if (number < 0) {
        println("negative")
    } else {
        if (number > 0) {
            println("positive")
        } else {
            println("zero")
        }
    }
}

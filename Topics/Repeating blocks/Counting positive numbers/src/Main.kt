fun main() {
    // put your code here
    val numberCount = readln().toInt()
    var count = 0

    repeat(numberCount) {
        if (readln().toInt() > 0) {
            count++
        }
    }
    println(count)
}
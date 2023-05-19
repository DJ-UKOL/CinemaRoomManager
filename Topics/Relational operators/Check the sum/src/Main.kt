const val NUMBER = 20

fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println(a + b == NUMBER || a + c == NUMBER || b + c == NUMBER)
}

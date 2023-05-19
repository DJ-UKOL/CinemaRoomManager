import kotlin.math.abs

// write your code here
fun getLastDigit(a: Int): Int = abs(a % 10)

/* Do not change code below */
fun main() {
    val a = readln().toInt()
    println(getLastDigit(a))
}
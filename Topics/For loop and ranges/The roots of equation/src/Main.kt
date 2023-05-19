val range = 1..1000
fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (x in range) {
        if (a * x * x * x + b * x * x + c * x + d == 0) {
            println(x)
        }
    }
}

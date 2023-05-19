fun main() {
    // write your code here
    val range1 = readln().toInt()..readln().toInt()
    val range2 = readln().toInt()..readln().toInt()
    val a = readln().toInt()

    println(a in range1 && a in range2)
}
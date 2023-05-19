fun main() {
    // write your code here
    val numList = MutableList(readln().toInt()) { readln().toInt() }

    for (i in 1..readln().toInt() % numList.size) {
        numList.add(0, numList.removeLast())
    }

    println(numList.joinToString(" "))
}

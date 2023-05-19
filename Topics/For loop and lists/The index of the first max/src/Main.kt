fun main() {
    // write your code here
    var div = 0
    var index = 0
    for (i in 0 until readln().toInt()) {
        val a = readln().toInt()
        if (a > div) {
            div = a
            index = i
        }
    }
    println(index)
}
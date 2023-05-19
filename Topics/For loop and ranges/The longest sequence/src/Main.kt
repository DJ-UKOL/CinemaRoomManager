fun main() {
    // write your code here
    val num = readln().toInt()
    var a = readln().toInt()
    var count = 1
    var div = 0

    for (i in 1 until num) {
        val m = readln().toInt()
        if (a <= m) {
            count++
        } else {
            if (div < count) {
                div = count
                count = 1
            }
        }
        a = m
    }

    if (div < count) {
        div = count
    }

    println(div)

}

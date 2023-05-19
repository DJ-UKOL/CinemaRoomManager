fun main() {
    // put your code here
    var count = 0
    for (i in readln().toInt()..readln().toInt()) {
        count += i
    }
    println(count)
}
fun main() {
    // put your code here
    val number = readln().toInt()
    var count1 = 0
    var count2 = 0
    var count3 = 0

    repeat(number) {
        val input = readln().toInt()
        if (input == -1) count3++
        if (input == 1) count2++
        if (input == 0) count1++
    }

    println("$count1 $count2 $count3")
}
fun main() {
    // write your code here
    val butterCups = readln().toInt()
    val isWeekend = readln().toBoolean()

    println(
        (!isWeekend && (butterCups in 10..20)) || (isWeekend && (butterCups in 15..25))
    )
}
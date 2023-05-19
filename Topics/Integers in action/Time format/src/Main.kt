fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // do not change this line
    // enter your code
    val seconds = totalSeconds % (60 * 24)
    val minutes = totalSeconds / 60 % 24
    val hours = totalSeconds / 60 % 24

    println("$hours:$minutes:$seconds")
}

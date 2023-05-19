import com.sun.tools.javac.Main
import kotlin.Exception

fun calculateBrakingDistance(v1: String, a: String): Int {
    // write your code here
    var result = 0
    try {
        result = -(v1.toInt() * v1.toInt()) / (2 * a.toInt())
    } catch (e: NumberFormatException) {
        println(e.message)
        return -1
    } catch (e: ArithmeticException) {
        println("The car does not slow down!")
        return -1
    }
    return result
}
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    while (scanner.hasNextInt()) {
        // TODO
        val price = scanner.nextInt()
        if (balance < price) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $price.")
        }
        balance -= price
    }
    // TODO
    if (balance >= 0) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}

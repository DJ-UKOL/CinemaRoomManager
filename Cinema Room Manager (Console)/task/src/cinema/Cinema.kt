package cinema

const val SEATS = 60
const val price10 = 10
const val price8 = 8

fun printMenu(listSeats: MutableList<MutableList<String>>) {

    var inputNumber: String
    while (true) {
        println(
            "1. Show the seats\n" +
                    "2. Buy a ticket\n" +
                    "3. Statistics\n" +
                    "0. Exit"
        )
        inputNumber = readln()
        when (inputNumber) {
            "1" -> showSeats(listSeats)
            "2" -> buyTicket(listSeats)
            "3" -> showStatistics(listSeats)
            "0" -> break
            else -> println("Wrong input")
        }
    }
}

fun showStatistics(listSeats: MutableList<MutableList<String>>) {
    var purchase = 0
    var income = 0
    var totalIncome = 0
    for (i in listSeats.indices) {
        for (j in listSeats[i]) {
            if (listSeats.size * listSeats[0].size <= SEATS) {
                totalIncome += price10
                if (j == "B") {
                    purchase++
                    income += price10
                }
            } else {
                if (listSeats.size / 2 > i) {
                    totalIncome += price10
                    if (j == "B") {
                        purchase++
                        income += price10
                    }
                } else {
                    totalIncome += price8
                    if (j == "B") {
                        purchase++
                        income += price8
                    }
                }
            }
        }
    }
    println("Number of purchased tickets: $purchase")

    val percentage = try {
        100.0 / (listSeats.size * listSeats[0].size / (purchase / 1.0))
    } catch (e: ArithmeticException) {
        0.0
    }

    val formatPercentage = "%.2f".format(percentage)
    println("Percentage: $formatPercentage%")



    println("Current income: \$$income")
    println("Total income: \$$totalIncome")
}

fun buyTicket(listSeats: MutableList<MutableList<String>>) {
    println("Enter a row number:")
    val rowNumber = readln().toInt()
    println("Enter a seat number in that row:")
    val seatNumber = readln().toInt()

    try {
        if (listSeats[rowNumber - 1][seatNumber - 1] != "B") {
            print("Ticket price: ")

            if (listSeats.size * listSeats[0].size <= SEATS) {
                println("\$${price10}")
            } else {
                if (listSeats.size / 2 >= rowNumber) {
                    println("\$${price10}")
                } else {
                    println("\$${price8}")
                }
            }

            listSeats[rowNumber - 1][seatNumber - 1] = "B"
        } else {
            println("That ticket has already been purchased!")
            buyTicket(listSeats)
        }
    } catch (e: IndexOutOfBoundsException) {
        println("Wrong input!")
        buyTicket(listSeats)
    }
}

fun showSeats(listSeats: MutableList<MutableList<String>>) {
    println("Cinema:")
    print(" ")
    for (i in 1..listSeats[0].size) {
        print(" $i")
    }
    println()
    for (i in 1..listSeats.size) {
        print("$i")
        for (j in 1..listSeats[i - 1].size) {
            print(" ${listSeats[i - 1][j - 1]}")
        }
        println()
    }
}

fun main() {
    // write your code here
    println("Enter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()
    val listSeats = MutableList(rows) { MutableList(seats) { "S" } }
    printMenu(listSeats)
}
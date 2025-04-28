package lotto.io

import camp.nextstep.edu.missionutils.Console
import lotto.Lotto

class InputView {
    fun readPurchaseAmount(): Int {
        println("Please enter the purchase amount.")
        val input = Console.readLine()

        /* parse input to int and validate */
        val amount = try {
            input.toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("[ERROR] Please enter a valid number.")
        }

        if (amount <= 0) {
            throw IllegalArgumentException("[ERROR] The purchase amount must be greater than zero.")
        }

        if(amount % TICKET_PRICE != 0) {
            throw IllegalArgumentException("[ERROR] The purchase price must be a positive number.")
        }

        return amount
    }

    fun readWinningNumbers(): Lotto {
        println("\nPLease enter last week's winning numbers.")
        val input = Console.readLine()

        try {
            val numbers = input.split(",").map { number -> number.trim().toInt() }.toList()
            return Lotto(numbers)
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("[ERROR] Please enter valid numbers separated by commas.")
        }
    }

    fun readBonusNumber(winningNumbers: Lotto): Int {
        println("\nPLease enter the bonus number.")
        val input = Console.readLine()

        /* parse input to int and validate */
        val bonusNumber = try {
            input.toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("[ERROR] Please enter a valid bonus number. Should be distinct from winning numbers.")
        }

        if (bonusNumber < 1 || bonusNumber > 45) {
            throw IllegalArgumentException("[ERROR] Bonus number must be between 1 and 45.")
        }

        if (winningNumbers.contains(bonusNumber)) {
            throw IllegalArgumentException("[ERROR] Bonus number cannot be one of the winning numbers.")
        }

        return bonusNumber
    }


    companion object {
        private const val TICKET_PRICE = 1000
    }
}
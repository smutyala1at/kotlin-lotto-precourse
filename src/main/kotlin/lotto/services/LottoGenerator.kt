package lotto.services

import camp.nextstep.edu.missionutils.Randoms
import lotto.Lotto

class LottoGenerator {
    fun generate(count: Int): List<Lotto> {
        val tickets = mutableListOf<Lotto>()
        repeat(count) {
            val numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6)
            tickets.add(Lotto(numbers))
        }
        return tickets
    }
}
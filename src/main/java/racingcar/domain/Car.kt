package racingcar.domain

import camp.nextstep.edu.missionutils.Randoms
import racingcar.constants.Numbers

class Car(private val name: String) {
    private var position = 0
    // 추가 기능 구현

    fun move() {
        val randomNumber = Randoms.pickNumberInRange(
            Numbers.MINIMUM_RANDOM_NUMBER_RANGE.getNumber(),
            Numbers.MAXIMUM_RANDOM_NUMBER_RANGE.getNumber()
        )
        if (randomNumber >= Numbers.MOVE_NUMBER_STANDARD.getNumber()) position += 1
    }

    fun getPosition():Int{
        return position
    }
}
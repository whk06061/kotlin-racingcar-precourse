package racingcar.view

import camp.nextstep.edu.missionutils.Console
import racingcar.exception.Validator

class InputView {

    private val validator = Validator()

    fun readCarName(): List<String> {
        val input = Console.readLine()
        return validator.checkCarNameInput(input)
    }
}
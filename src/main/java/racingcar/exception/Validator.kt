package racingcar.exception

import racingcar.constants.ErrorMessage

class Validator {

    fun checkCarNameInput(input: String): List<String> {

        val names = mutableListOf<String>()
        input.split(",").forEach { names.add(it.replace(" ", "")) }
        names.forEach { if (it.length > 5) throw IllegalArgumentException(ErrorMessage.ERROR_NAME_LENGTH.getMessage()) }
        return names
    }
}
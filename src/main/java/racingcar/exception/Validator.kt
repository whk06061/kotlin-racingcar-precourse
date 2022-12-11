package racingcar.exception

import racingcar.constants.ErrorMessage

class Validator {

    fun checkCarNameInput(input: String): List<String> {
        val names = mutableListOf<String>()
        input.split(",").forEach { names.add(it.replace(" ", "")) }
        names.forEach { if (it.length > 5) throw IllegalArgumentException(ErrorMessage.NAME_LENGTH.getMessage()) }
        return names
    }

    fun checkTryCountInput(input: String): Int {
        return input.toIntOrNull() ?: throw IllegalArgumentException(ErrorMessage.NOT_NUMBER.getMessage())
    }
}
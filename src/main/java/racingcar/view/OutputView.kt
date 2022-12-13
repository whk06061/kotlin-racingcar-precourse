package racingcar.view

import racingcar.constants.InputMent
import racingcar.constants.OutputMent

class OutputView {

    fun printInputCarNameMent() {
        println(InputMent.INPUT_CAR_NAME_MENT.getMessage())
    }

    fun printInputTryCountMent() {
        println(InputMent.INPUT_TRY_COUNT_MENT.getMessage())
    }

    fun printResultMent() {
        println()
        println(OutputMent.RESULT_MENT.getMessage())
    }

    fun printCarResult(carName: String, position: Int) {
        var advanceResult = ""
        for (i in 0 until position) {
            advanceResult += OutputMent.ADVANCE_SHAPE.getMessage()
        }
        println(OutputMent.RESULT_FORMAT.getMessage().format(carName, advanceResult))
    }

    fun printFinalResult(winners: List<String>) {
        println(OutputMent.FINAL_RESULT_FORMAT.getMessage().format(winners.joinToString()))

    }

    fun printErrorMessage(message:String){
        println(message)
    }
}
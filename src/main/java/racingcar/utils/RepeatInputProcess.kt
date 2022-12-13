package racingcar.utils

import racingcar.view.OutputView

object RepeatInputProcess {
    fun repeat(inputProcess: () -> Any): Any {
        val outputView = OutputView()
        while (true) {
            try {
                return inputProcess()
            } catch (e: IllegalArgumentException) {
                outputView.printErrorMessage(e.message.toString())
            }
        }
    }
}
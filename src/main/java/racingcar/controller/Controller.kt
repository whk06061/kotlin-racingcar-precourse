package racingcar.controller

import racingcar.domain.Car
import racingcar.view.InputView
import racingcar.view.OutputView

class Controller {

    private val outputView = OutputView()
    private val inputView = InputView()

    private val cars = mutableListOf<Car>()

    fun play() {
    }

    private fun readCarNames(): List<String> {
        outputView.printInputCarNameMent()
        return inputView.readCarName()
    }
}
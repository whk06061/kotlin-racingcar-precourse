package racingcar.controller

import racingcar.domain.Car
import racingcar.view.InputView
import racingcar.view.OutputView

class Controller {

    private val outputView = OutputView()
    private val inputView = InputView()

    private val cars = mutableListOf<Car>()
    private var tryCount = 0

    init {
        val carNames = readCarNames()
        for (name in carNames) {
            cars.add(Car(name))
        }
        tryCount = readTryCount()
    }

    fun play() {
        var count = tryCount
        while (count > 0) {
            count -= 1
            outputView.printResultMent()
            cars.forEachIndexed { index, car ->
                run {
                    car.move()
                    outputView.printCarResult(car.getName(), car.getPosition())
                }
            }
        }
    }

    private fun readCarNames(): List<String> {
        outputView.printInputCarNameMent()
        return inputView.readCarName()
    }

    private fun readTryCount(): Int {
        outputView.printInputTryCountMent()
        return inputView.readTryCount()
    }
}
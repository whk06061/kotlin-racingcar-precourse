package racingcar.controller

import racingcar.domain.Car
import racingcar.utils.RepeatInputProcess
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
        outputView.printResultMent()
        while (count > 0) {
            count -= 1
            cars.forEach { car ->
                run {
                    car.move()
                    outputView.printCarResult(car.getName(), car.getPosition())
                }
            }
            println()
        }
        printFinalResult()
    }

    private fun getWinners(): List<String> {
        val winners = mutableListOf<String>()
        var bestPosition = 0
        cars.forEach { car ->
            run {
                val currentPosition = car.getPosition()
                if (currentPosition > bestPosition) bestPosition = currentPosition
            }
        }
        cars.forEach { car -> if (car.getPosition() == bestPosition) winners.add(car.getName()) }
        return winners
    }

    private fun printFinalResult() {
        val winners = getWinners()
        outputView.printFinalResult(winners)
    }

    private fun readCarNames(): List<String> {
        outputView.printInputCarNameMent()
        @Suppress("UNCHECKED_CAST")
        return RepeatInputProcess.repeat { inputView.readCarName() } as List<String>
    }

    private fun readTryCount(): Int {
        outputView.printInputTryCountMent()
        return RepeatInputProcess.repeat { inputView.readTryCount() } as Int
    }
}
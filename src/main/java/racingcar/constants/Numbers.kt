package racingcar.constants

enum class Numbers(private val number: Int) {
    MINIMUM_RANDOM_NUMBER_RANGE(0),
    MAXIMUM_RANDOM_NUMBER_RANGE(9),
    MOVE_NUMBER_STANDARD(4);

    fun getNumber(): Int {
        return this.number
    }
}
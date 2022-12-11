package racingcar.constants

enum class InputMent(private val message: String) {
    INPUT_CAR_NAME_MENT("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_TRY_COUNT_MENT("시도할 회수는 몇회인가요?");

    fun getMessage(): String {
        return this.message
    }
}
package racingcar.constants

enum class OutputMent(private val message: String) {
    RESULT_MENT("실행 결과"),
    RESULT_FORMAT("%s : %s"),
    ADVANCE_SHAPE("-");

    fun getMessage(): String {
        return this.message
    }
}
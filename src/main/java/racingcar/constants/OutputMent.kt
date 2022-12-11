package racingcar.constants

enum class OutputMent(private val message: String) {
    RESULT_MENT("실행 결과"),
    RESULT_FORMAT("%s : %s"),
    ADVANCE_SHAPE("-"),
    FINAL_RESULT_FORMAT("최종 우승자 : %s");

    fun getMessage(): String {
        return this.message
    }
}
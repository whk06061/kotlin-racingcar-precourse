package racingcar.constants

enum class ErrorMessage(private val message: String) {
    PREFIX("[ERROR]"),
    NAME_LENGTH("${PREFIX.message} 이름은 5자 이하만 가능합니다."),
    NOT_NUMBER("${PREFIX.message} 숫자만 입력해주세요.");

    fun getMessage(): String {
        return this.message
    }
}
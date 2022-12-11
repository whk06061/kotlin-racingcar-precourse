package racingcar.constants

enum class ErrorMessage(private val message: String) {
    PREFIX("[ERROR]"),
    ERROR_NAME_LENGTH("${PREFIX.message} 이름은 5자 이하만 가능합니다.");

    fun getMessage():String{
        return this.message
    }
}
package oncall.exception;

public class IllegalInputException extends CustomException {
    public IllegalInputException() {
        super("유효하지 않은 입력 값입니다. 다시 입력해 주세요.");
    }
}

package com.mall.common.exception;

/**
 * 当后端有逻辑错误，但又不希望前端统一向用户抛错，而希望前端捕捉后单独处理，以便后续操作时，抛出此异常
 * 抛出409
 *
 * @author zjt
 * @date 2021-04-02
 */
public class ConflictException extends AbstractApiException {

    private static final long serialVersionUID = 5910013900317154083L;

    public ConflictException(String format, Object... args) {
        super(format, args);
    }

    public ConflictException(String message) {
        super(message);
    }

    public ConflictException(Object duplicateObj) {
        super(duplicateObj);
    }

    @Override
    public String getExceptionType() {
        return "Conflict Error";
    }

}

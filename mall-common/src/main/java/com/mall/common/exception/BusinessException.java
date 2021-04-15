package com.mall.common.exception;

/**
 * 普通业务逻辑异常
 * 抛出402
 *
 * @author zjt
 * @date 2021-04-02
 */
public class BusinessException extends AbstractApiException {


    private static final long serialVersionUID = 5910013900317154083L;

    public BusinessException(String format, Object... args) {
        super(format, args);
    }

    public BusinessException(String message) {
        super(message);
    }

    @Override
    public String getExceptionType() {
        return "Business Error";
    }
}

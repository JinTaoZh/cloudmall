package com.mall.common.exception;

/**
 * 请求参数异常
 * 抛出400
 *
 * @author zjt
 * @date 2021-04-02
 */
public class ParameterException extends AbstractApiException {

    private static final long serialVersionUID = 8868193805023044915L;

    public ParameterException(String format, Object... args) {
        super(format, args);
    }

    public ParameterException(String message) {
        super(message);
    }

    @Override
    public String getExceptionType() {
        return "Parameter Error";
    }

}

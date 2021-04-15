package com.mall.common.exception;

/**
 * 用户校验异常，用户登录、解析用户信息出错时抛出该类型的错误
 * 抛出 401
 *
 * @author zjt
 * @date 2021-04-02
 */
public class AuthenticationException extends AbstractApiException {

    private static final long serialVersionUID = -5898075103944003272L;

    public AuthenticationException(String format, Object... args) {
        super(format, args);
    }

    public AuthenticationException(String message) {
        super(message);
    }

    @Override
    public String getExceptionType() {
        return "Authentication Error";
    }
}

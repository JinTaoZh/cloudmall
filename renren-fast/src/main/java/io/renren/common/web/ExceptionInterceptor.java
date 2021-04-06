package io.renren.common.web;

import io.renren.common.exception.*;
import io.renren.common.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一的异常处理
 *
 * @author zjt
 * @date 2021-04-02
 */
@Slf4j
@RestControllerAdvice
public class ExceptionInterceptor {

    @ExceptionHandler(ParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorView handleParameterException(AbstractApiException ex) {
        return new ErrorView(HttpStatus.BAD_REQUEST.value(), ex.getExceptionType(), ex.getMessage());
    }

    @ExceptionHandler(AuthenticationException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ErrorView handleAuthenticationException(AbstractApiException ex) {
        return new ErrorView(HttpStatus.UNAUTHORIZED.value(), ex.getExceptionType(), ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.PAYMENT_REQUIRED)
    public ErrorView handleBusinessException(AbstractApiException ex) {
        return new ErrorView(HttpStatus.PAYMENT_REQUIRED.value(), ex.getExceptionType(), ex.getMessage());
    }

    @ExceptionHandler(PermissionException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ErrorView handlePermissionException(AbstractApiException ex) {
        return new ErrorView(HttpStatus.FORBIDDEN.value(), ex.getExceptionType(), ex.getMessage(), ex.getErrMsg());
    }

    @ExceptionHandler(ConflictException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ErrorView handleConflictException(AbstractApiException ex) {
        return new ErrorView(HttpStatus.CONFLICT.value(), ex.getExceptionType(), ex.getMessage(), ex.getDuplicateObj());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorView handleGeneralException(Exception ex, HttpServletRequest servletRequest) {
        // 抛出500错误是 打印出错的接口方法名 链接 请求参数 以便排查错误
        log.error("######Server Error, method: {}, url: {}, parameters: {}", servletRequest.getMethod(), servletRequest.getRequestURL(), JsonUtil.obj2JsonStr(servletRequest.getParameterMap()));
        log.error("", ex);
        return new ErrorView(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Internal Server Error", ex.getMessage());
    }

}

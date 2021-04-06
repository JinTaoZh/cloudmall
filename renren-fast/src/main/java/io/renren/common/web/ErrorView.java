package io.renren.common.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.util.Map;

/**
 * @author zjt
 * @date 2021-04-02
 */
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorView {

    private final Integer statusCode;

    private final String errorType;

    private final String message;

    private Object duplicateObj;

    private Map<String, String> errMsg;

    public ErrorView(Integer statusCode, String errorType, String message) {
        this.statusCode = statusCode;
        this.errorType = errorType;
        this.message = message;
    }

    public ErrorView(Integer statusCode, String errorType, String message, Map<String, String> errMsg) {
        this.statusCode = statusCode;
        this.errorType = errorType;
        this.message = message;
        this.errMsg = errMsg;
    }

    public ErrorView(Integer statusCode, String errorType, String message, Object duplicateObj) {
        this.statusCode = statusCode;
        this.errorType = errorType;
        this.message = message;
        this.duplicateObj = duplicateObj;
    }
}
package io.renren.common.exception;

import lombok.Getter;
import org.slf4j.helpers.MessageFormatter;

import java.util.Map;

/**
 * 同一异常处理的抽象类
 *
 * @author zjt
 * @date 2021-04-02
 */
@Getter
public abstract class AbstractApiException extends RuntimeException {

    private static final long serialVersionUID = -1623045206093282352L;

    private Object duplicateObj;

    private Map<String, String> errMsg;

    /**
     * 支持格式化输入
     *
     * @param format 格式化样式
     * @param args   {@link <https://dzone.com/articles/java-string-format-examples>}
     * @see MessageFormatter 效率貌似更高效和方便一些
     */
    public AbstractApiException(String format, Object... args) {
        super(MessageFormatter.arrayFormat(format, args).getMessage());
    }

    // 不建议拼接直接拼接字符串
    public AbstractApiException(String message) {
        super(message);
    }

    public AbstractApiException(Map<String, String> errMsg) {
        this.errMsg = errMsg;
    }

    public AbstractApiException(Object duplicateObj) {
        this.duplicateObj = duplicateObj;
    }

    public abstract String getExceptionType();


}

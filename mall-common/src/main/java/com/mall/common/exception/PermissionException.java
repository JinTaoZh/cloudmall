package com.mall.common.exception;

import java.util.HashMap;

/**
 * 权限异常
 * 抛出403
 *
 * @author zjt
 * @date 2021-04-02
 */
public class PermissionException extends AbstractApiException {

    private static final long serialVersionUID = -3914566644983744078L;

    public PermissionException(String message) {
        super(message);
    }

    public PermissionException(String message, String... rolesNames) {
        super(new HashMap<String, String>() {{
            put("message", message);
            put("roleNames", String.join("/", rolesNames)); // 缺少的角色名称
        }});
    }

    @Override
    public String getExceptionType() {
        return "Parameter Error";
    }

}

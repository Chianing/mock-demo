package com.chianing.demo.mockdemo.constant;

/**
 * 响应码枚举
 *
 * @author Squall
 */
public enum ResultCode {
    /**
     * 成功
     */
    SUCCESS(200),

    /**
     * 失败
     */
    FAILED(400),

    /**
     * 内部错误
     */
    INTERNAL_SERVER_ERROR(500);

    private final int code;

    ResultCode(int code) {
        this.code = code;
    }

    public int code() {
        return code;
    }
}

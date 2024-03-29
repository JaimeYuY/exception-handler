package com.ocean.angel.tool.constant;

/**
 *  响应码
 */
public enum ResultCode {

    SUCCESS(200, "Success"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    PARAM_ERROR(500, "Parameter error.")
    ;

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

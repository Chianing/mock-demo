package com.chianing.demo.mockdemo.model.vo;

import com.chianing.demo.mockdemo.constant.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo<T> implements Serializable {

    private static final long serialVersionUID = -5581439345655658430L;

    private String msg;

    private int code;

    private T data;

    public static <T> ResultVo<T> success() {
        return new ResultVo<T>().setResultCode(ResultCode.SUCCESS);
    }

    public static <T> ResultVo<T> success(T data) {
        return new ResultVo<T>().setResultCode(ResultCode.SUCCESS).setData(data);
    }

    public static <T> ResultVo<T> success(ResultCode code, String msg, T data) {
        return new ResultVo<T>().setResultCode(code).setMsg(msg).setData(data);
    }

    public static <T> ResultVo<T> successWithMessage(String msg, T data) {
        return new ResultVo<T>().setResultCode(ResultCode.SUCCESS).setMsg(msg).setData(data);
    }

    public static <T> ResultVo<T> failed(String msg) {
        return new ResultVo<T>().setResultCode(ResultCode.FAILED).setMsg(msg);
    }

    public static <T> ResultVo<T> failedWithInternalServerError(String msg) {
        return new ResultVo<T>().setResultCode(ResultCode.INTERNAL_SERVER_ERROR).setMsg(msg);
    }

    public ResultVo<T> setResultCode(ResultCode resultCode) {
        this.code = resultCode.code();
        return this;
    }

    public ResultVo<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public ResultVo<T> setData(T data) {
        this.data = data;
        return this;
    }

    public boolean isSuccess() {
        return ResultCode.SUCCESS.code() == this.code;
    }
}

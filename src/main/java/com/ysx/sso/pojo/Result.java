package com.ysx.sso.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;
    private String message;
    private Object object;

    public static Result success(){
        return new Result(ResultStatus.SUCCESS.getCode(), ResultStatus.SUCCESS.getMessage(), null);
    }

    public static Result success(Object object){
        return new Result(ResultStatus.SUCCESS.getCode(), ResultStatus.SUCCESS.getMessage(), object);
    }

    public static Result error(ResultStatus resultStatus){
        return new Result(resultStatus.getCode(), resultStatus.getMessage(), null);
    }

    public static Result error(ResultStatus resultStatus, Object object){
        return new Result(resultStatus.getCode(), resultStatus.getMessage(), object);
    }

    public static Result error(ResultStatus resultStatus, String detail, Object object){
        return new Result(resultStatus.getCode(), resultStatus.getMessage() + ": " + detail, object);
    }

    public static Result success(Integer code, String message, Object object){
        return new Result(code, message, object);
    }

    public static Result error(Integer code, String message, Object object){
        return new Result(code, message, object);
    }
}

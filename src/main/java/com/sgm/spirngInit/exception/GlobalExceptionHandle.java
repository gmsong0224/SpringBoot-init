package com.sgm.spirngInit.exception;

import com.sgm.spirngInit.common.BaseResponse;
import com.sgm.spirngInit.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandle {
    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHandle(BusinessException e){
        log.error("BusinessException", e);
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> businessExceptionHandle(RuntimeException e){
        log.error("RuntimeException", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, "系统错误");
    }
}

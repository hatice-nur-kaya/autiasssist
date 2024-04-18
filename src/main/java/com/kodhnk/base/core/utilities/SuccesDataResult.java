package com.kodhnk.base.core.utilities;


import com.kodhnk.base.core.constant.Response;

public class SuccesDataResult<T> extends DataResult<T> {
    public SuccesDataResult(Response message, T data, int statusCode) {
        super(true, message, data, statusCode);
    }
}
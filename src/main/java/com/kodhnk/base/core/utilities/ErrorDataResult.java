package com.kodhnk.base.core.utilities;

import com.kodhnk.base.core.constant.Response;

public class ErrorDataResult<T> extends DataResult<T> {
    public ErrorDataResult(Response message, T data, int statusCode) {
        super(false, message, data, statusCode);
    }
}
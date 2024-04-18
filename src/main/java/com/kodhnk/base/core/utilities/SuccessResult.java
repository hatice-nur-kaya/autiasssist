package com.kodhnk.base.core.utilities;

import com.kodhnk.base.core.constant.Response;

public class SuccessResult extends Result {
    public SuccessResult(Response message, int statusCode) {
        super(true, message, statusCode);
    }
}
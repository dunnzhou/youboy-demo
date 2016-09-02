package com.youboy.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-01T14:57:41.508Z")

public class ApiException extends Exception {

    private int code;

    public ApiException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}

package com.youboy.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-01T14:57:41.508Z")

public class NotFoundException extends ApiException {
    private int code;

    public NotFoundException(int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}

package com.et.pro.util;

import java.util.Map;

public class Result2 extends XMap {
    private static final String ERROR_CODE = "errorCode";
    private static final String ERROR_MESSAGE = "errorMessage";
    private static final String SYNTAX_ERROR = "syntax error";

    public Result2() {
        this.put(ERROR_CODE, 0);
    }

    public Result2(Map m) {
        super(m);
        if (!this.containsKey(ERROR_CODE)) {
            this.put(ERROR_CODE, 0);
        }
    }

    public Result2(int errorCode, String errorMessage) {
        super();
        this.put(ERROR_CODE, errorCode);
        this.put(ERROR_MESSAGE, errorMessage);
    }

    public int getErrorCode() {
        return this.getInt(ERROR_CODE);
    }

    public void setErrorCode(int errorCode) {
        this.put(ERROR_CODE, errorCode);
    }

    public String getErrorMessage() {
        return this.getString(ERROR_MESSAGE);
    }

    public void setErrorMessage(String errorMessage) {
        this.put(ERROR_MESSAGE, errorMessage);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public XMap getXMap() {
        XMap xmap = new XMap();
        xmap.putAll(this);
        xmap.remove(ERROR_CODE);
        xmap.remove(ERROR_MESSAGE);
        return xmap;
    }
}

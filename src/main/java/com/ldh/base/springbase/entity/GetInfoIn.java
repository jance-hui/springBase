package com.ldh.base.springbase.entity;

import java.io.Serializable;

public class GetInfoIn implements Serializable {
    private static final long serialVersionUID = 1L;
    private String queryNo;

    public String getQueryNo() {
        return queryNo;
    }

    public void setQueryNo(String queryNo) {
        this.queryNo = queryNo;
    }
}

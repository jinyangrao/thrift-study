package com.spark.sql.service;


import org.apache.thrift.TException;
import rao.thrift.bean.TResult;
import rao.thrift.service.TResultService;

public class HandleService implements TResultService.Iface {

    @Override
    public TResult getResponse(String code) throws TException {
        TResult result = new TResult();
        result.setCode(code);
        result.setDescribe("sucess");
        return result;
    }
}

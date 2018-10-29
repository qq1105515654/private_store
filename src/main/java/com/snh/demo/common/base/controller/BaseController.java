package com.snh.demo.common.base.controller;

import com.snh.demo.common.base.domain.BaseEntity;

import java.util.HashMap;
import java.util.Map;


public class BaseController <T extends BaseEntity> {


    private final String CODE_SUCCESS="200";

    private final String CODE_FAILED="500";


    public Map<String,Object> success(){
        Map<String,Object> result=new HashMap<>();
        result.put("code",CODE_SUCCESS);
        result.put("message","操作成功");
        return result;
    }

    public Map<String,Object> success(Object data){
        Map<String,Object> result=new HashMap<>();
        result.put("code",CODE_SUCCESS);
        result.put("message","操作成功");
        result.put("data",data);
        return result;
    }

    public Map<String,Object> success(String msg){
        Map<String,Object> result=new HashMap<>();
        result.put("code",CODE_SUCCESS);
        result.put("message",msg);
        return result;
    }


    public Map<String,Object> failed(){
        Map<String,Object> result=new HashMap<>();
        result.put("code",CODE_FAILED);
        result.put("message","操作失败");
        return result;
    }


    public Map<String,Object> failed(String msg){
        Map<String,Object> result=new HashMap<>();
        result.put("code",CODE_FAILED);
        result.put("message",msg);
        return result;
    }


}

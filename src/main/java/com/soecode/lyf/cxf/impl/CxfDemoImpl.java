package com.soecode.lyf.cxf.impl;

import com.soecode.lyf.cxf.CxfDemo;

import javax.jws.WebService;

@WebService
public class CxfDemoImpl implements CxfDemo {
    @Override
    public String helloWord(String arg) {
        return "hello "+arg+"!!!";
    }
}

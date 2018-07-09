package com.soecode.lyf.cxf;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface CxfDemo {
    @WebMethod
    String   helloWord(@WebParam(name = "userName") String arg);
}


package com.soecode.lyf.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CxfDemo", targetNamespace = "http://cxf.lyf.soecode.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CxfDemo {


    /**
     * 
     * @param userName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "helloWord", targetNamespace = "http://cxf.lyf.soecode.com/", className = "com.demo.lyf.client.HelloWord")
    @ResponseWrapper(localName = "helloWordResponse", targetNamespace = "http://cxf.lyf.soecode.com/", className = "com.demo.lyf.client.HelloWordResponse")
    public String helloWord(
        @WebParam(name = "userName", targetNamespace = "")
        String userName);

}

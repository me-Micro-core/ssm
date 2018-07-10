
package com.soecode.lyf.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CxfDemoService", targetNamespace = "http://cxf.lyf.soecode.com/", wsdlLocation = "http://localhost:9090/ssm/ws/books?wsdl")
public class CxfDemoService
    extends Service
{

    private final static URL CXFDEMOSERVICE_WSDL_LOCATION;
    private final static WebServiceException CXFDEMOSERVICE_EXCEPTION;
    private final static QName CXFDEMOSERVICE_QNAME = new QName("http://cxf.lyf.soecode.com/", "CxfDemoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9090/ssm/ws/books?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CXFDEMOSERVICE_WSDL_LOCATION = url;
        CXFDEMOSERVICE_EXCEPTION = e;
    }

    public CxfDemoService() {
        super(__getWsdlLocation(), CXFDEMOSERVICE_QNAME);
    }

    public CxfDemoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CXFDEMOSERVICE_QNAME, features);
    }

    public CxfDemoService(URL wsdlLocation) {
        super(wsdlLocation, CXFDEMOSERVICE_QNAME);
    }

    public CxfDemoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CXFDEMOSERVICE_QNAME, features);
    }

    public CxfDemoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CxfDemoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CxfDemo
     */
    @WebEndpoint(name = "CxfDemoPort")
    public CxfDemo getCxfDemoPort() {
        return super.getPort(new QName("http://cxf.lyf.soecode.com/", "CxfDemoPort"), CxfDemo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CxfDemo
     */
    @WebEndpoint(name = "CxfDemoPort")
    public CxfDemo getCxfDemoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cxf.lyf.soecode.com/", "CxfDemoPort"), CxfDemo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CXFDEMOSERVICE_EXCEPTION!= null) {
            throw CXFDEMOSERVICE_EXCEPTION;
        }
        return CXFDEMOSERVICE_WSDL_LOCATION;
    }

}

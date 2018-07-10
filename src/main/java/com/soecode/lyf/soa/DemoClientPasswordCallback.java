package com.soecode.lyf.soa;


import org.apache.wss4j.common.ext.WSPasswordCallback;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;



public class DemoClientPasswordCallback implements CallbackHandler {
    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {
        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
        String ident = "I";
        String passwd = "abc";
        pc.setPassword(passwd);
        pc.setIdentifier(ident);
    }
}


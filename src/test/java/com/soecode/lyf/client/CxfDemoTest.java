package com.soecode.lyf.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:cxf/spring-cxf-client.xml"})
public class CxfDemoTest {
    @Autowired
    private CxfDemo client;
    @Test
    public void helloWordTest(){
        /*ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:cxf/spring-cxf-client.xml");
        CxfDemo client = (CxfDemo) factory.getBean("client");*/
        String names = client.helloWord("乐乐");
        System.out.println(names);
    }
}

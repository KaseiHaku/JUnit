package kasei.unittest;


import org.junit.jupiter.api.Test;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.jndi.support.SimpleJndiBeanFactory;
import org.springframework.mock.env.MockEnvironment;
import org.springframework.mock.env.MockPropertySource;
import org.springframework.mock.http.server.reactive.MockServerHttpRequest;
import org.springframework.mock.http.server.reactive.MockServerHttpResponse;
import org.springframework.test.util.AopTestUtils;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * spring 项目相关的单元测试
 */
public class SpringUnitTest {
    
    
    
    @Test
    public void environmentTest(){
        MockEnvironment mockEnvironment = new MockEnvironment();
        MockPropertySource mockPropertySource = new MockPropertySource();
    }

    /**
     * JNDI: 主要作用是从 .properties, .xml, .ini 文件中获取配置属性，而不用自己写代码解析文件
     */
    @Test
    public void jndiTest() throws NamingException {

        System.out.println(System.getProperty("user.dir")); // jndi.properties 只会在这个目录下找
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        
        
        InitialContext jndiCtx = new InitialContext();
        String jndiKey = (String)jndiCtx.lookup("jndiKey");
        String defaultKey = (String)jndiCtx.lookup("defaultKey");
        String rootKey = (String)jndiCtx.lookup("root.rootKey");
        String jdbcUrl = (String)jndiCtx.lookup("db.datasource.jdbc.url");
        System.out.println(jndiKey);
        System.out.println(rootKey);
        System.out.println(defaultKey);
        System.out.println(jdbcUrl);
    }
    
    
    @Test
    public void servletTest(){
        MockMvcBuilders.standaloneSetup();

        MockMvcRequestBuilders.head("");

        MockMvcResultMatchers.content();
        MockMvcResultHandlers.log();
    }
    
    @Test
    public void springSupportUnitTest(){
        ReflectionTestUtils reflectionTestUtils = null;
        AopTestUtils aopTestUtils = null;
        AopProxyUtils aopProxyUtils = null;
    }
    
    @Test
    public void reactiveTest(){
        MockServerHttpRequest req = null;
        MockServerHttpResponse resp = null;
        WebTestClient webTestClient = null;
    }
    
    
}

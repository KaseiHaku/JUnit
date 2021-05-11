package kasei.junit.spring;


import org.junit.jupiter.api.Test;
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
public class SpringTest {
    
    
    
    @Test
    public void environmentTest(){
        MockEnvironment mockEnvironment = new MockEnvironment();
        MockPropertySource mockPropertySource = new MockPropertySource();
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
    }
    
    @Test
    public void reactiveTest(){
        MockServerHttpRequest req = null;
        MockServerHttpResponse resp = null;
        WebTestClient webTestClient = null;
    }
    
    
}

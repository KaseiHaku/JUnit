package kasei.junit;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import java.util.concurrent.TimeUnit;




/**
 * 基本上所有的 JUnit 核心注解都在 org.junit.jupiter.api 包下
 * */
@DisplayName("my first junit jupiter test class") // 仅仅用于描述测试名称
@Execution(ExecutionMode.CONCURRENT)
class MyFirstJUnitJupiterTests {

    @BeforeAll
    static void beforeAll(){
        System.out.println("@BeforeAll");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("@AfterAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("\n@BeforeEach");
    }
    @AfterEach
    void afterEach(){
        System.out.println("@AfterEach");
    }



    @Test // 表明当前方法是个测试方法，没有任何其他配置
    void test() {
        System.out.println("@Test");
    }


    @Test
    @DisplayName("display name")
    void displayName(){
        System.out.println("@DisplayName");
    }

    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void parameterizedTest(String candidate) {
        System.out.println("@ParameterizedTest");
        System.out.println(candidate);
    }

    @RepeatedTest(10)
    void repeatedTest() {
        System.out.println("@RepeatedTest");
    }

    @Test
    @Disabled("disabled")
    void disabled() {
        System.out.println("@Disabled");
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void timeOut(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

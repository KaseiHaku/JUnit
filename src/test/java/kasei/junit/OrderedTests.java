package kasei.junit;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {


    @Test
    @Order(3)
    void test3(){
        System.out.println(3);
    }


    @Test
    @Order(2)
    void test2(){
        System.out.println(2);
    }


    @Test
    @Order(1)
    void test1(){
        System.out.println(1);
    }
}

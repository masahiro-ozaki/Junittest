package com.example.demo;

import static org.junit.Assert.assertEquals;

        import com.example.demo.service.HelloService;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTest {

    @Autowired
    HelloService helloService;

    @Test
    public void testSayHello() {
        assertEquals("Hello, PePeSe !", helloService.sayHello("PePeSe"));
    }
    @Test
    public void abc(){
        assertEquals(1,1) ;
    }
    @Test
    public void abcd(){
        assertEquals("Jet","Jet");
    }
}

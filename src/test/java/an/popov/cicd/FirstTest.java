package an.popov.cicd;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstTest {
  @Test
  void test1(){
    String string = "Hello";
    Assertions.assertEquals("Hello", string);
  }

  @Test
  void test2(){
    String string = "Hello world";
    Assertions.assertEquals("Hello world", string);
  }
}

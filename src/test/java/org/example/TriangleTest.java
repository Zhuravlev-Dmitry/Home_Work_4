package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TriangleTest {

    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    @DisplayName("Позитивная проверка")
    void positiveTest() throws TriangleException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(6, triangle.getSqrTriangle(3, 4,5), "Правильно = 6");
        logger.info("Логируем позитивную проверку");
    }

    @Test
    @DisplayName("Негативная проверка № 1")
    void negativeTest1()  {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(TriangleException.class, ()-> triangle.getSqrTriangle(5,0 ,10));
    }
    @Test
    @DisplayName("Негативная проверка № 2")
    void negativeTest2()  {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(TriangleException.class, () -> triangle.getSqrTriangle(-10, 15,15));
    }
    @ParameterizedTest
    @DisplayName("Параметризованный негативный тест № 3")
    @CsvSource({"20,30,50","500,600,1300","100,4,5","80,100,200"})
    void paramTest (int a, int b, int c)  {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(Exception.class, () -> triangle.getSqrTriangle(a, b, c));
    }


}

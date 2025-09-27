package test.ch4_more_OOP.polymorphism.parametric.simplelist;

import ch4_more_OOP.polymorphism.parametric.simplelist.SimpleLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

class SimpleLinkedListTest {

    private  String[] namesArray;

    @BeforeEach
    void setUp(){
        namesArray = new String[]{"Ahmed", "Saed", "John", "Peter", "Vladimir"};
        System.out.println("Test case run.");
    }

    @Test
     void should_ReturnTrue_When_SizeIsCorrect(){
        //given
        //when
        SimpleLinkedList<String> names = new SimpleLinkedList<>(namesArray);
        //then
        Assertions.assertEquals(namesArray.length,names.getSize());
    }

    @Test
     void should_ReturnListWithoutTheFirstElement_WhenRemoveTheFirst(){
        //given
        SimpleLinkedList<String> names = new SimpleLinkedList<>(namesArray);
        String[] namesArrayWithoutLastOne = new String[]{"Ahmed", "Saed", "John", "Peter"};

        //when
        Executable executableRemoveItem = ()-> {
            names.removeItem("Vladimir");
            Assertions.assertEquals(names.toString(), Arrays.toString(namesArrayWithoutLastOne));
        };
        Executable executableSizeAfterRemoval = ()-> {
            Assertions.assertEquals(names.getSize(), namesArrayWithoutLastOne.length);
        };

        //then
        Assertions.assertAll(executableRemoveItem, executableSizeAfterRemoval);
     }

    @Test
    void should_ReturnArray_WhenCallToArray(){
        //given
        SimpleLinkedList<String> names = new SimpleLinkedList<>(namesArray);
        //when
        var arrayValue= names.toArray(String.class);
        // then
        Assertions.assertInstanceOf(String[].class, arrayValue);
    }


    @ParameterizedTest
    @ValueSource(strings = {"John", "Jane", "Lily"})
    void should_ReturnSizeIncreasedByOne_When_AddItem(String name){
        //given
        SimpleLinkedList<String> names = new SimpleLinkedList<>(namesArray);

        //when
        int sizeBeforeAdd = names.getSize();
        names.addItem(name);
        int sizeAfterAdd = names.getSize();
        //then
        Assertions.assertEquals(sizeAfterAdd, sizeBeforeAdd+1);
    }

//    @Test
//     void should_ThrowArithmeticException_WhenDivideByZero(){
//        //given
//        var height = 10;
//        var width =0;
//        //when
//        Executable executable = ()-> {
//            var ratio = height / width;
//        };
//        //then
//        Assertions.assertThrows(ArithmeticException.class, executable);
//    }
}
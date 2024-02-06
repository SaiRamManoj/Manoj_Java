package LamdaFunctionsTest;

import LamdaFunctions.StringToIntegerConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToIntegerConverterTest {
    StringToIntegerConverter st= new StringToIntegerConverter();

    @Test
    public void test1(){
        Assertions.assertEquals(23,st.convertAndPrint("23"));

        Assertions.assertEquals(45.67,st.convertAndPrint(("45.67")));
    }
}

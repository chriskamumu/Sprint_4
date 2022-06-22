import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountCheckNameHasSpaceOnlyInTheMiddleTest {

    private final String name;
    private final Boolean expected;

    public AccountCheckNameHasSpaceOnlyInTheMiddleTest(String name, Boolean expected){
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData(){
        return Arrays.asList(new Object[][] {
                {"Тимоти Шаламе", true},
                {"Тимоти ", false},
                {" Тимоти", false},
                {"Тимоти Шаламе ", false}
        });
    }

    @Test
    public void testCheckNameHasSpaceOnlyInTheMiddle() {
        Account account = new Account(name);
        Boolean actualResult = account.checkNameHasSpaceOnlyInTheMiddle();
        String errorMessage = "Ожидаемый результат = " + expected + ", не равен фактическому = " + actualResult + "." + "\n" + "Для имени = " + name;
        assertEquals(errorMessage, expected, actualResult);
    }
}

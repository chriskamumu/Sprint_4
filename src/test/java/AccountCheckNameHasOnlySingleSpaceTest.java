import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountCheckNameHasOnlySingleSpaceTest {

    private final String name;
    private final Boolean expected;

    public AccountCheckNameHasOnlySingleSpaceTest(String name, Boolean expected){
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData(){
        return Arrays.asList(new Object[][] {
                {"Тимоти Шаламе", true},
                {"ТимотейШевроле", false},
                {"Тимоти Хэл Шаламе", false},
                {"Тимоти Шаламе ", false}
        });
    }

    @Test
    public void testCheckNameHasOnlySingleSpace() {
        Account account = new Account(name);
        Boolean actualResult = account.checkNameHasOnlySingleSpace();
        String errorMessage = "Ожидаемый результат = " + expected + ", не равен фактическому = " + actualResult + "." + "\n" + "Для имени = " + name;
        assertEquals(errorMessage, expected, actualResult);
    }
}

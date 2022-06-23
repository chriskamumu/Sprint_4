import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountCheckNameToEmbossTest {

    private final String name;
    private final Boolean expected;

    public AccountCheckNameToEmbossTest(String name, Boolean expected){
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData(){
        return Arrays.asList(new Object[][] {
                {"Тимоти Шаламе", true},
                {"ТимотейШевроле", false},
                {"Ти", false},
                {"Т м", true},
                {"Тимоти ____nineteen", true},
                {"Тимоти _______twenty", false},
                {"Тимоти ", false},
                {" Тимоти", false},
                {"Тимоти Хэл Шаламе", false},
                {"Тимоти Шаламе ", false},
                {" ", false},
                {"", false},
                {null, false}
        });
    }

    @Test
    public void testCheckNameToEmboss() {
        Account account = new Account(name);
        Boolean actualResult = account.checkNameToEmboss();
        String errorMessage = "Ожидаемый результат = " + expected + ", не равен фактическому = " + actualResult + "." + "\n" + "Для имени = " + name;
        assertEquals(errorMessage, expected, actualResult);
    }
}

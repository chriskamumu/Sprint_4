import java.util.ArrayList;
import java.util.List;

public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */

        List<String> names = new ArrayList<>();
        names.add("Тимоти Шаламе");
        names.add("ТимотейШевроле");
        names.add("Ти");
        names.add("Т м");
        names.add("Тимоти ____nineteen");
        names.add("Тимоти _______twenty");
        names.add("Тимоти ");
        names.add(" Тимоти");
        names.add("Тимоти Хэл Шаламе");
        Account account;

        for (String name:
                names) {
            account = new Account(name);
            System.out.println(name + ": " + account.checkNameToEmboss());
        }

    }

}

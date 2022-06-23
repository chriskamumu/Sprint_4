public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

        return this.name != null && this.checkLength() && checkNameHasOnlySingleSpace() && checkNameHasSpaceOnlyInTheMiddle();
    }

    private boolean checkLength() {
        return this.name.length() >= 3 && this.name.length() <= 19;
    }

    private boolean checkNameHasOnlySingleSpace() {
        String space = " ";
        return name.contains(space) && name.indexOf(space) == name.lastIndexOf(space);
    }

    private boolean checkNameHasSpaceOnlyInTheMiddle(){
        String space = " ";
        return name.contains(space) && !name.startsWith(space) && !name.endsWith(space);
    }
}

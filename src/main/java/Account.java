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

    public boolean checkLength() {
        //в строке не меньше 3 и не больше 19 символов
        return this.name.length() >= 3 && this.name.length() <= 19;
    }

    public boolean checkNameHasOnlySingleSpace() {
        String space = " ";
        return name.contains(space) && name.indexOf(space) == name.lastIndexOf(space);
    }

    public boolean checkNameHasSpaceOnlyInTheMiddle(){
        String space = " ";
        return name.contains(space) && name.indexOf(space) != 0 && name.lastIndexOf(space) != this.name.length()-1;
    }
}

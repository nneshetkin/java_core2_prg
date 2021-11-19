
/*2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи.
С помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.*/




package lesson3.homework.Task2;

public class Task2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Сергеев","+7904500001");
        phoneBook.add("Андреев","+793123401");
        phoneBook.add("Сергеев","+7900000002");
        phoneBook.add("Иванов","+7920046501");


        for (String phoneNumber: phoneBook.get("Сергеев")){
         System.out.println("Сергеев" + " " + phoneNumber);
        }
        for (String phoneNumber:phoneBook.get("Иванов")){
            System.out.println("Иванов" + " " + phoneNumber);
        }

    }



}




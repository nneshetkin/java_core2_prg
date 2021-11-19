/* 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать сколько раз встречается каждое слово.*/

package lesson3.homework.Task1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        String[] s =new String[] {
                "Андрей",
                "Иван",
                "Ирина",
                "Марина",
                "Генадий",
                "Аркадий",
                "Акакий",
                "Иван",
                "Иван",
                "Иван",
                "Ирина"
        };

        Map<String,Integer> count =new HashMap<>();

        for (String name:s) {
            if (count.containsKey(name))
            {
                count.put(name,count.get(name)+1);
            }
            else count.put(name,1);
        }
    for (Map.Entry<String,Integer> entry : count.entrySet())
    {
        System.out.println(entry.getKey()+ "  " + entry.getValue());
    }
    }

}

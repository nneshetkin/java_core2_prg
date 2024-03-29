package lesson1.hw1;

public class Championship {
    //Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать
    // и прыгать (методы просто выводят информацию о действии в консоль).
    //Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
    // соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
    //Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
    //У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
    // Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.

    public static void main(String[] args) {
        Participants[] participants = {
                new Cat("Disya", 1500, 300),
                new Cat("Murzik", 1700, 220),
                new Robot("123", 99999, 0),
                new Robot("4r41", 5000, 50),
                new Human("Petya", 2500, 150),
                new Human("Irina", 3500, 120)
        };

        Barriers[] barriers = {
          new Track(1200),
          new Wall(30),
          new Track(2000),
          new Wall(140),
          new Track(3000),
          new Wall( 250)
        };

        for (Participants r : participants) {
            for (Barriers b : barriers) {
                if (b instanceof Track) {
                    r.run(b.getLength());
                } else {
                    r.jump(b.getHeight());
                }
//                if (!r.overcome(o)) break;
            }
        }
    }

}

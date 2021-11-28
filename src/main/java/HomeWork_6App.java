

public class HomeWork_6App {


    public static void main(String[] args) {


        Dog dog = new Dog("Бобик", "белый");
        Dog dog1 = new Dog("Марс", "серый");
        Dog dog2 = new Dog("Рыжик", "чёрный");

        Cat cat = new Cat("Murzik","цветной");
        Cat cat1 = new Cat("Barsik", "желтый");
        Cat cat2 = new Cat("Baron", "пёстрый");

        dog.info();
        dog.Sail(-1);
        dog.Sail(5);
        dog2.Sail(15);
        dog1.Run(-1);
        dog1.Run(250);
        dog1.Run(501);
        cat2.info();
        cat1.Run(-1);
        cat.Run(100);
        cat.Run(0);
        cat2.setSail(2);

        System.out.println(Animal.counter());



            }

        }


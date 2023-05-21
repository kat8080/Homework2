public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8.;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        System.out.println("Задача 6");
        var weightOneBoxer = 78.2;
        System.out.println(weightOneBoxer + " кг.");
        var weightTwoBoxer = 82.7;
        System.out.println(weightTwoBoxer + " кг.");
        var totalWeight = weightOneBoxer + weightTwoBoxer;
        System.out.println("Общий вес боксеров " + (totalWeight) + " кг.");
        System.out.println("Разница " + (weightTwoBoxer - weightOneBoxer) + " кг.");

        // Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница (1 способ) " + (weightTwoBoxer - weightOneBoxer) + " кг.");
        System.out.println("Разница (2 способ) " + (weightTwoBoxer % weightOneBoxer) + " кг.");

        // Задача 8
        System.out.println("Задача 8");
        var totaWorkingHours = 640;
        System.out.println("Всего - " + totaWorkingHours + " ч.");
        var oneEmployee = 8;
        System.out.println("Один сотрудник работает - " + oneEmployee + " ч.");
        var totalEmployee = totaWorkingHours / oneEmployee;
        System.out.println("Всего работников в компании – " + totalEmployee + " человек.");
        System.out.println("Если в компании работает " + (totalEmployee + 94) + " человека, то всего " + (totalEmployee + 94) * oneEmployee + " часа работы может быть поделено между сотрудниками.");

        System.out.println("Проверка что будет после происоединения ветки в гит хабе");
    }
}
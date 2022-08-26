public class Main {
    public static void main(String[] args) {
        var dog = 8.;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightOneBoxer = 78.2;
        System.out.println(weightOneBoxer + " кг.");
        var weightTwoBoxer = 82.7;
        System.out.println(weightTwoBoxer + " кг.");
        var totalWeight = weightOneBoxer + weightTwoBoxer;
        System.out.println("Общий вес боксеров " + (totalWeight) + " кг.");
        System.out.println("Разница " + (weightTwoBoxer - weightOneBoxer) + " кг.");
        System.out.println("Разница " + (weightTwoBoxer % weightOneBoxer) + " кг.");

        var totalTime = 640;
        System.out.println("Всего - " + totalTime + " ч.");
        var oneEmployee = 8;
        System.out.println("Один сотрудник работает - " + oneEmployee + " ч.");
        var totalEmployee = totalTime / oneEmployee;
        System.out.println("Всего работников в компании – " + totalEmployee + " человек.");
        System.out.println("Если в компании работает " + (totalEmployee + 94) + " человека, то всего " + (totalEmployee + 94) * oneEmployee + " часов работы может быть поделено между сотрудниками.");
    }
}
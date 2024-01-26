// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);

            System.out.println("Задача 1");
            int age = 21;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний.");
            } else {
                System.out.println("Если возраст человека равен " + age + " ,он не достиг совершеннолетия, нужно немного подождать.");
            }
            System.out.println("Задача 2");
            int temperature = 18;
            if (temperature <= 5) {
                System.out.println("Сегодня холодно, нужно надеть шапку.");
            } else {
                System.out.println("Сегодня тепло, можно идти без шапки.");
            }
            System.out.println("Задача 3");
            int speed = 120;
            if (speed >= 60) {
                System.out.println("Если скорость " + speed + " ,придётся заплатить штраф.");
            } else {
                System.out.println("Можно ездить спокойно.");
            }
            System.out.println("Задача 4");
            int agePerson = 36;
            if (agePerson >= 2 && agePerson <= 6) {
                System.out.println("Если возраст человека равен " + agePerson + " ,то ему нужно ходить в детский сад.");
            } else if (agePerson >= 7 && agePerson <= 17) {
                System.out.println("Если возраст человека равен " + agePerson + " , то ему нужно ходить в школу.");
            } else if (agePerson >= 18 && agePerson <= 24) {
                System.out.println("Если возраст человека равен " + agePerson + " ,то его место в университете.");
            } else if (agePerson > 24) {
                System.out.println("Если возраст человека равен " + agePerson + " ,то ему пора ходить на работу.");
            }
            System.out.println("Задача 5");
            int ageKid = 13;
            if (ageKid < 5) {
                System.out.println("Если возраст ребёнка равен, " + ageKid + " то ему нельзя кататься на аттракционе.");
            } else if (ageKid > 5 && ageKid <= 14) {
                System.out.println("Если возраст ребёнка равен, " + ageKid + " то можно кататься на аттракционе в сопровождении взрослого.");
            } else if (ageKid > 14) {
                System.out.println ("Если возраст ребёнка равен, " + ageKid + " то можно кататься без сопровождения взрослого.");

            }
            System.out.println("Задача 6");
            int nomberTickets = 88;
            if (nomberTickets <= 59) {
                System.out.println("Если в вагоне сидячих мест " + (60 - nomberTickets) + " и 42 стоячих.");
            } else if (nomberTickets >= 60 && nomberTickets <= 101) {
                System.out.println("В вагоне нет сидячих мест, стоячих мест осталось " + (102 - nomberTickets) + " штук.");
            } else {
                System.out.println("Вагон полностью забит.");

            }
            System.out.println("Задача 7");
            int one = 8;
            int two = 88;
            int three = 98;
            if (one > two && one > three) {
                System.out.println("Наибольшее число one.");
            } else if (two > three) {
                System.out.println("Наибольшее число two.");
            } else {
                System.out.println("Наибольшее число three.");
            }


            }

        }}









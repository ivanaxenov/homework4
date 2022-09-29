public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Подожди немного, возраст еще не наступил!");

        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int age = 18;
        boolean school = age >= 7 && age < 18;
        boolean university = age >= 18 && age < 24;
        boolean work = age >= 24;
        if (school) {
            System.out.println("Идешь в школу ");
        }
        if (age < 7) {
            System.out.println("Идешь в садик");
        }
        if (work) {
            System.out.println("Вы закончили университет");
        }
        if (university) {
            System.out.println("Вы закончили школу и можете идти в университет");
        }

    }

    public static void task3() {
        System.out.println("Задание 3");
        int seatsTaken = 90;
        int capacity = 102;
        int seats = 60;
        int stands = capacity - seats;
        boolean standsOnly = seatsTaken < capacity && seatsTaken >= seats;
        boolean standsAndSeats = seatsTaken < seats;
        if (standsOnly) {
            System.out.println(" Только " + (capacity - seatsTaken) + " стоячих мест доступно");
        }
        if (standsAndSeats) {
            System.out.println(stands + " Стоячих мест и " + (capacity - seatsTaken - stands) + " сидячих доступно");
        }
        if (seatsTaken >= capacity) {
            System.out.println(" Мест уже нет ");
        }


    }

    public static void task4() {
        System.out.println("Задание 4");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else {
            System.out.println("Подожди немного, возраст еще не наступил!");
        }

    }

    public static void task5() {
        System.out.println("Задание 5");
        int age = 26;
        boolean school = age >= 7 && age < 18;
        boolean university = age >= 18 && age < 24;
        boolean work = age >= 24;
        if (school) {
            System.out.println("Идешь в школу ");
        } else if (work) {
            System.out.println("Вы закончили университет, ищите работу");
        } else if (university) {
            System.out.println("Вы закончили школу и можете идти в университет");
        } else {
            System.out.println("Идешь в садик");
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        int seatsTaken = 50;
        int capacity = 102;
        int seats = 60;
        int stands = capacity - seats;
        boolean standsOnly = seatsTaken < capacity && seatsTaken >= seats;
        boolean standsAndSeats = seatsTaken < seats;
        if (standsOnly) {
            System.out.println("Только " + (capacity - seatsTaken) + " стоячих мест доступно");
        } else if (standsAndSeats) {
            System.out.println(stands + " Стоячих мест и " + (capacity - seatsTaken - stands) + " сидячих доступно");
        } else {
            System.out.println(" Мест уже нет ");
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        int age = 7;
        boolean youngOld = age < 2 || age >= 70;
        boolean kindergarten = age > 2 && age < 6;
        boolean university = age >= 18 && age < 24;
        boolean work = age >= 24 && age < 70;
        if (kindergarten) {
            System.out.printf("Если тебе %s лет , то идешь в детский сад", age);
        } else if (university) {
            System.out.printf("Если тебе %s лет, то закончил школу и идешь в университет", age);
        } else if (work) {
            System.out.printf("Если тебе %s лет, то ты выпустился с университета и ищешь работу", age);
        } else if (youngOld) {
            System.out.printf("Если тебе %s лет, то отдыхай", age);
        } else {
            System.out.printf("Если тебе %s лет, иди в школу", age);
        }

    }

    public static void task8() {
        System.out.println(" Задание 8 ");
        int age = 16;
        boolean child = age < 5;
        boolean teenager = age >= 14;
        if (child) {
            System.out.printf("Если тебе %s лет, не сможешь прокатиться ", age);
        } else if (teenager) {
            System.out.printf("Если тебе %s лет, то можешь прокатиться без сопровождения взрослого", age);
        } else {
            System.out.printf("Если тебе %s, тебе нельзя кататься без сопровождения взрослого", age);
        }
    }

    public static void task9() {
        System.out.println("Задание 9");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean bigOne = one > two && one > three;
        boolean bigTwo = two > one && two > three;
        if (bigOne) {
            System.out.printf("%s болшее", one);
        } else if (bigTwo) {
            System.out.printf("%s большее", two);
        } else {
            System.out.printf("%s большее", three);
        }
    }

}


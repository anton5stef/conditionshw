import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 13;
        if (age>18) {
            System.out.println("Если возраст человека равен" +age+" то он совершеннолетний");}
        else {
            System.out.println("Если возраст человека равен " + age +  ", возраст совершеннолетия еще не наступил и нужно немного подождать");

        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 13;
        if (temperature<5) {
            System.out.println("На улице " + temperature + " градусов. На улице холодно, нужно надеть шапку");}
        else {
            System.out.println("На улице " + temperature + " градусов, сегодня тепло, можно идти без шапки"); }

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int driverspeed = 62;
        if (driverspeed > 60) {
            System.out.println("Если скорость " + driverspeed + " то придется заплатить штраф"); }
        else {
            System.out.println("Если скорость " + driverspeed + " то можно ездить спокойно"); }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 14;
        boolean babysad = age >= 2 && age <= 6;
        boolean school = age >= 7 && age <= 18;
        boolean university = age > 18 && age < 24;
        boolean job = age >= 24;
        if (babysad) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад"); }
        else if (school) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу"); }
        else if (university) {
            System.out.println("Если возраст человека равен " + age + " то его место в университете"); }
        else if (job) {
            System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу");}
        else{
            System.out.println("Он слишком молод, чтобы ваще куда-то ходить"); } }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 15;
        boolean sovzroslim = age > 5 && age < 14;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " то он не может кататься на аттракционе");
        } else if (sovzroslim) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься без сопровождения взрослого.");
        } else {
            System.out.println("У ребёнка нет возраста");
        }


    } public static void task6 () {
        System.out.println("Задача 6");
        int vagonmax = 102;
        int mestsid = 60;
        int ludeiyedut = 102;
        int seatsremaining = ludeiyedut - mestsid;
        if (vagonmax > ludeiyedut) {
            if (ludeiyedut > mestsid) {
                System.out.println("В вагоне не осталось сидячих мест, но осталось " + seatsremaining + " стоячих");
                ;
            }
        } else if (vagonmax == ludeiyedut) {
            System.out.println("Вагон полный");
        } else {
            System.out.println("В вагоне нет столько места");
        }
    } public static void task7 () {
        System.out.println("Задача 7");
        int one = 13;
        int two = 15;
        int three = 15;
        if (one>=two && one>=three) {
            System.out.println("Самое большое число это " + one);}
        else if(two>=one && two>=three){
            System.out.println("Самое большое число это " + two);}
        else if (three>=one && three>=two) {
            System.out.println("Самое большое число это " + three);
        }
}}
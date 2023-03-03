public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }

    private static void task1() {
        System.out.println("Задача 1 ");

        String firstName = "Inan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);


        System.out.println("Задача 2 ");
        System.out.println(fullName.toUpperCase());

    }
    private static void task2() {
        System.out.println("Задача 3");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        String fullName1 = fullName.replace("ё", "е") ;
        System.out.println("Данные ФИО сотрудника — " + fullName1);




    }






}
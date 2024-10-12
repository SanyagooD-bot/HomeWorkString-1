public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №1 Строки");
        System.out.println("_______________Задание 1__________________");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);
        System.out.println("__________________________________________");

        System.out.println("_______________Задание 2__________________");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("__________________________________________");

        System.out.println("_______________Задание 2__________________");
        fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameTrue);
        System.out.println("__________________________________________");
    }
}
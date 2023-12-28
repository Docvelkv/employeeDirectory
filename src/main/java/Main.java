public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();
        directory.addToDirectory(new Employee("Иванов Иван",
                "+7(625)068-83-40", 6));
        directory.addToDirectory(new Employee("Журавлёв Владислав",
                "+7(511)456-49-23", 4));
        directory.addToDirectory(new Employee("Моргунов Лев",
                "+7(625)125-03-54", 8));
        directory.addToDirectory(new Employee("Петров Егор",
                "+7(766)355-41-97", 16));
        directory.addToDirectory(new Employee("Рудаков Павел",
                "+7(872)281-39-97", 2));
        directory.addToDirectory(new Employee("Сидоров Леонид",
                "+7(808)985-22-45", 3));
        directory.addToDirectory(new Employee("Фирсов Михаил",
                "+7(428)542-37-18", 5));
        directory.addToDirectory(new Employee("Андреева Лидия",
                "+7(278)968-20-08", 6));
        directory.addToDirectory(new Employee("Антонова Юлия",
                "+7(338)508-66-09", 10));
        directory.addToDirectory(new Employee("Иванов Иван",
                "+7(728)971-22-89", 1));

        directory.showWholeDirectory();
        directory.sortByNames();
        System.out.println("**********");
        directory.showWholeDirectory();
        directory.sortByExperience();
        System.out.println("**********");
        directory.showWholeDirectory();
        System.out.println("**********");
        directory.searchByExperience(2, 4).forEach(System.out::println);
        System.out.println("**********");
        directory.searchEmployeeByServiceNumber(3);
        System.out.println("**********");
        directory.searchPhoneByName("Иванов Иван").forEach(System.out::println);
    }
}

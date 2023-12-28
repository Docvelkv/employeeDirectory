import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Directory implements Iterable<Employee> {
    private final List<Employee> empDirectory;

    /**
     * Конструктор
     */
    public Directory() {
        this.empDirectory = new ArrayList<>();
    }

    /**
     * Добавление сотрудника в справочник
     * @param employee сотрудник
     */
    public void addToDirectory(Employee employee) {
        empDirectory.add(employee);
    }

    /**
     * Демонстрация всего справочника
     */
    public void showWholeDirectory() {
        empDirectory.forEach(System.out::println);
    }

    /**
     * Поиск по стажу (в интервале)
     * @param from начало интервала (включительно)
     * @param to   конец интервала
     */
    public List<Employee> searchByExperience(int from, int to) {
        return empDirectory.stream()
                .filter(x -> x.getExperience() >= from && x.getExperience() < to)
                .collect(Collectors.toList());
    }

    /**
     * Поиск номера телефона по имени сотрудника
     * @param name имя сотрудника
     */
    public List<Employee> searchPhoneByName(String name) {
        return empDirectory.stream()
                .filter(x -> x.getFullName().equals(name))
                .collect(Collectors.toList());
    }

    /**
     * Поиск сотрудника по табельному номеру
     * @param serviceNumber табельный номер
     */
    public void searchEmployeeByServiceNumber(int serviceNumber){
        for (Employee employee : empDirectory) {
            if (employee.getServiceNumber() == serviceNumber) {
                System.out.printf("Табельный номер %d - %s\n",
                        serviceNumber, employee);
            }
        }
    }

    /**
     * Сортировка по имени.
     */
    public void sortByNames(){
        empDirectory.sort(new ComparatorByName());
    }

    /**
     * Сортировка по стажу.
     */
    public void sortByExperience(){
        empDirectory.sort(new ComparatorByExperience());
    }

    /**
     * Переопределение итератора
     * @return Iterator
     */
    @Override
    public Iterator<Employee> iterator() {
        return empDirectory.iterator();
    }
}

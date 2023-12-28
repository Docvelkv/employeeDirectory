import java.util.Comparator;

/**
 * Класс для сравнения сотрудников по имени
 */
public class ComparatorByName implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getFullName().compareTo(emp2.getFullName());
    }
}

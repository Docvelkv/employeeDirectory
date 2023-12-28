import java.util.Comparator;

/**
 * Класс для сравнения сотрудников по стажу
 */
public class ComparatorByExperience implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getExperience() - emp2.getExperience();
    }
}

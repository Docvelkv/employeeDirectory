import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {

    private final String fullName;
    private static final AtomicInteger id = new AtomicInteger(1);
    private final int serviceNumber;
    private final String phoneNumber;
    private final int experience;

    /**
     * Конструктор
     * @param fullName имя сотрудника
     * @param phoneNumber номер телефона в формате +x(xxx)xxx-xx-xx
     * @param experience стаж работы
     */
    public Employee(String fullName, String phoneNumber, int experience) {
        this.fullName = fullName;
        this.serviceNumber = idGeneration();
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    /**
     * Получение полного имени
     * @return String
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Получение табельного номера
     * @return int
     */
    public int getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Получение номера телефона
     * @return String
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Получение стажа работы
     * @return int
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Внутренний метод: генерация табельного номера
     * @return int
     */
    private int idGeneration(){
        return id.getAndIncrement();
    }

    /**
     * Переопределение equals
     * @param obj объект для совпадения
     * @return истина или ложь
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return serviceNumber == employee.getServiceNumber();
    }

    /**
     * Переопределение hashCode
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(serviceNumber);
    }

    /**
     * Переопределение toString
     * @return String
     */
    @Override
    public String toString() {
        return "Сотрудник: " + getFullName() +
                ", табельный номер: " + getServiceNumber() +
                ", телефон: " + getPhoneNumber() +
                ", стаж: " + getExperience() + ".";
    }
}
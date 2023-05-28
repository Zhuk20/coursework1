import java.util.Objects;
public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private int department;
    private int salary;
    private static int id;

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        if (salary>=0) {
            this.salary = salary;
        }
        id = id++;
    }

    public int getId() {
        return id++;
    }

    public String getSurname() {
        return surname;

    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        if (salary >= 0) {
            return salary;
        }
        return salary = 0;
    }

    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void setDepartment(int department) {
        if (department > 0 && department < 5) {
            this.department = department;
        }
        throw new IllegalArgumentException("в нашей компании всего пять отделов");
    }

    @Override
    public String toString() {
        return "| " + getId() + " | " + name + " | " + surname + " | " +
                patronymic + " | " + department + " | " + salary + " |";
    }


}


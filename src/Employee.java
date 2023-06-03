public class Employee {
    private final String name;
    private final String surname;
    private final String patronymic;
    private int department;
    private int salary;
    private int id;
    private static int idCount = 1;

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        if (department < 1 || department > 5) {                    // В условии сказано, что у нас пять отделов
            throw new IllegalArgumentException("в нашей компании всего пять отделов");
        }
        this.department = department;
        if (salary >= 0) {                                           // Не может быть отрицательной зарплаты
            this.salary = salary;
        }
        this.id = idCount++;
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
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {                    // В условии сказано, что у нас пять отделов
            throw new IllegalArgumentException("в нашей компании всего пять отделов");
        }
        this.department = department;
    }

    @Override
    public String toString() {
        return "| " + id + " | " + name + " | " + surname + " | " +
                patronymic + " | " + department + " | " + salary + " |";
    }

}
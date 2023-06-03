public class Main {
    private static void printAllArr() {   // Распечатать весь массив
        for (Employee employee : employees) {
            if (employee != null) {                     // Печатаем только заполненные строки массива
                System.out.println(employee + " ");
            }
        }
    }

    private static int sumSalary() {      // Общая сумма зарплат
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static void printMaxSalary() {     // Печатаем сотрудника у которого самая большая зарплата
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        System.out.println("Сотрудник максимальной зарплатой " + max);
    }

    private static void printMinSalary() {     // Печатаем сотрудника у которого самая маленькая зарплата
        Employee min = employees[0];
        for (Employee employee : employees) {                      // Ищем минимальное число зарплаты
            if (employee != null && employee.getSalary() < min.getSalary()) {
                min = employee;
            }

        }
        System.out.println("Сотрудник минимальной зарплатой " + min);
    }

    private static float averageSalary() {       // Ищем среднюю зарплату
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                count++;
            }
        }
        return (float) sumSalary() / count;                      // Выводим среднее арифметическое зарплат всех сотрудников
    }

    private static void printFio() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());

        }
    }

    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {


        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 2000);
        employees[1] = new Employee("Сидоров", "Сидор", "Сидорович", 2, 1000);
        employees[2] = new Employee("Петров", "Петр", "Петрович", 3, 2000);
        employees[3] = new Employee("Александров", "Александр", "Александрович", 4, 1000);
        employees[4] = new Employee("Путин", "Владимир", "Владимирович", 5, 1_000_000);
        employees[5] = new Employee("Константинов", "Константин", "Константинович ", 1, 1000);
        printAllArr();                                 // Получить список всех сотрудников.
        System.out.println();
        System.out.println("Сумма затрат в месяц " + sumSalary());               // Посчитать сумму затрат на зарплаты.
        System.out.println();
        printMinSalary();                              // Найти сотрудника с минимальной заплатой.
        System.out.println();
        printMaxSalary();                             // Найти сотрудника с максимальной зарплатой.
        System.out.println();
        System.out.printf("Средняя сумма зарплат %.2f\n", averageSalary());           // Подсчитать среднее значение зарплат.
        System.out.println();
        printFio();                                     // Получить Ф. И. О. всех сотрудников
    }
}
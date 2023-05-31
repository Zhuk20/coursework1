public class Main {
    private static void printAllArr(Employee[] arr) {   // Распечатать весь массив
        for (Employee employee : arr) {
            if (employee != null) {                     // Печатаем только заполненые строки массива
                System.out.println(employee + " ");
            }
        }
    }

    private static int sumSalary(Employee[] arr) {      // Общая сумма зарплат
        int sum = 0;
        for (Employee employee : arr) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static void printMaxSalary(Employee[] arr) {     // Печатаем сотрудника у которого самая большая зарплата
        int max = 0;
        for (Employee employee : arr) {                      // Ищем максимальное число зарплаты
            if (employee != null) {
                max = Math.max(max, employee.getSalary());
            }
        }
        for (Employee employee : arr) {                       // Ищем сотрудника с максимальной зарплатой и печатаем
            if (employee.getSalary() == max) {
                System.out.println(employee);
                break;
            }
        }
    }

    private static void printMinSalary(Employee[] arr) {     // Печатаем сотрудника у которого самая маленькая зарплата
        int min = 99999999;
        for (Employee employee : arr) {                      // Ищем минимальное число зарплаты
            if (employee != null) {
                min = Math.min(min, employee.getSalary());
            }
        }
        for (Employee employee : arr) {                       // Ищем сотрудника с минимальной зарплатой и печатаем
            if (employee.getSalary() == min) {
                System.out.println(employee);
                break;
            }
        }
    }

    private static float averageSalary(Employee[] arr) {       // Ищем среднюю зарплату
        float sum = 0;
        int count = 0;
        for (Employee employee : arr) {                        // Ищем количество сотрудников и сумму зарплаты всех сотрудников
            if (employee != null) {
                count++;
                sum += employee.getSalary();
            }
        }
        return sum /= count;                                    // Выводим среднее арифметическое зарплат всех сотрудников
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 10);
        employees[1] = new Employee("Сидоров", "Сидор", "Сидорович", 2, 10);
        employees[2] = new Employee("Петров", "Петр", "Петрович", 3, 8);
        employees[3] = new Employee("Александров", "Александр", "Александрович", 4, 8);
        employees[4] = new Employee("Путин", "Владимир", "Владимирович", 5, 800_000);
        employees[5] = new Employee("Константинов", "Константин", "Константинович ", 1, 8);
        printAllArr(employees);                                 // Получить список всех сотрудников.
        System.out.println(sumSalary(employees));               // Посчитать сумму затрат на зарплаты.
        printMinSalary(employees);                              // Найти сотрудника с минимальной заплатой.
        printMaxSalary(employees);                              // Найти сотрудника с максимальной зарплатой.
        System.out.println(averageSalary(employees));           // Подсчитать среднее значение зарплат.
    }

}
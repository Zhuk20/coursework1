import java.util.Arrays;

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
        employees[1] = new Employee("Сидоров", "Сидор", "Сидорович", 1, 10);
        employees[2] = new Employee("Петров", "Петр", "Петрович", 1, 8);
        System.out.println(averageSalary(employees));
        printAllArr(employees);
    }

}
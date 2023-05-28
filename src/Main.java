import java.util.Arrays;

public class Main {
    private static void printAllArr(Employee[] arr) {
        for (Employee employee : arr) {
            if (employee != null) {
                System.out.println(employee + " ");
            }
        }
    }

    private static int sumSalary(Employee[] arr) {
        int sum = 0;
        for (Employee employee : arr) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static void maxSalary(Employee[] arr) {
        int max = 0;
        for (Employee employee : arr) {
            if (employee != null) {
                max = Math.max(max, employee.getSalary());
            }
        }
        for (Employee employee : arr){
            if (employee.getSalary() == max){
                System.out.println(employee);
                break;
            }
        }
    }
    private static void minSalary(Employee[] arr) {
        int min = 99999999;
        for (Employee employee : arr) {
            if (employee != null) {
                min = Math.min(min, employee.getSalary());
            }
        }
        for (Employee employee : arr){
            if (employee.getSalary() == min){
                System.out.println(employee);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 300);
        employees[1] = new Employee("Сидоров", "Сидор", "Сидорович", 1, 300);
        employees[2] = new Employee("Петров", "Петр", "Петрович", 1, 400);


        printAllArr(employees);
        System.out.println(sumSalary(employees));
        minSalary(employees);
        maxSalary(employees);
    }

}
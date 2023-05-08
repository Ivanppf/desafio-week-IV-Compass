import java.text.NumberFormat;
import java.util.Scanner;

public class MainBonus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int employeesNumber;

        while (true) {
            try {
                System.out.print("Employees number: ");
                employeesNumber = Integer.parseInt(input.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("ERROR, please try again!");
            }
        }

        Employee[] employees = new Employee[employeesNumber];

        for (int i = 0; i < employees.length; i++) {

            while (true) {
                try {
                    System.out.print("\nEmployee name: ");
                    String name = input.nextLine();
                    if (!name.matches("[a-zA-Z]+"))
                        throw new Exception();
                    System.out.print("Employee salary: R$ ");
                    float salary = Float.parseFloat(input.nextLine());
                    Employee emp = new Employee(name, salary);
                    employees[i] = emp;
                    break;
                } catch (Exception e) {
                    System.out.println("ERROR, please try again!");
                }
            }

        }

        for (Employee emp : employees) {

            System.out.println("\nEmployee: " + emp.getName());
            System.out.println("Salary: R$ " + String.format("%,.2f", emp.getSalary()));
            float bonus = 0;
            if (emp.getSalary() > 2000) {
               bonus = -10;
            } else if (emp.getSalary() > 1000) {
               bonus = 10;
            } else {
                bonus = 20;
            }
            bonus = emp.getSalary() * bonus / 100;

            if (bonus >= 0)
                System.out.println("Bonus: R$ " + String.format("%,.2f", bonus));
            else
                System.out.println("Discount: R$ " + String.format("%,.2f", bonus *-1));

            float liquid_salary = emp.getSalary() + bonus;

            System.out.println("Liquid salary: R$ " + String.format("%,.2f", liquid_salary));

            emp.setSalary(liquid_salary);

        }


    }

}

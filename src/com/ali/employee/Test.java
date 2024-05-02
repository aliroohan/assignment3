package com.ali.employee;

public class Test {
    public static void main(String [] args){
        Employee [] employees = new Employee[6];
        employees[0] = new SalariedEmployees("John", "Smith", "111-11-1111", 800.00, new Date(1, 1, 1990));
        employees[1] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40, new Date(2, 2, 1991));
        employees[2] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06, new Date(3, 3, 1992));
        employees[3] = new BasePlusCommissionEmpolyee("Bob", "Lewis", "444-44-4444", 5000, .04, 300, new Date(4, 4, 1993));
        employees[4] = new PieceWorker("Ali", "Ahmed", "555-55-5555", 10, 200, new Date(5, 5, 1994));
        employees[5] = new PieceWorker("Ahmed", "Ali", "666-66-6666", 10, 200, new Date(6, 6, 1995));

        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);
            System.out.printf("earned: $%,.2f\n", Employee.payroll(currentEmployee));
            System.out.println();
        }

    }
}

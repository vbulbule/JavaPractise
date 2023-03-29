package hackethon1.employeeregistration;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Registration re = new Registration();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            Employee emp = new Employee(name);
            re.register(emp);
            System.out.println(emp.showEmployee());
        }
        String searchName = sc.nextLine();
        System.out.println(re.findEmployee(searchName));
    }
}

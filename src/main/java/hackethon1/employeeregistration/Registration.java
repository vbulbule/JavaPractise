package hackethon1.employeeregistration;

import java.util.ArrayList;

class Registration {
    private ArrayList<Employee> employees;

    public Registration() {
        employees = new ArrayList<>();
    }

    public boolean register(Employee emp) {
        return employees.add(emp);
    }

    public String findEmployee(String name) {
        for (Employee emp : employees) {
            if (emp.getName().equals(name)) {
                return emp.showEmployee();
            }
        }
        return "N/A";
    }
}

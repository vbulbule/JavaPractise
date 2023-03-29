package hackethon1.employeeregistration;

class Employee {
    private static int Idcounter = 1;
    private int id;
    private String name;

    public Employee(String name) {
        this.id = Idcounter++;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String showEmployee() {
        return id + ": " + name;
    }
}

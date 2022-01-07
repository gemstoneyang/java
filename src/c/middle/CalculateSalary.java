package c.middle;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary func = new CalculateSalary();
        func.calculateSalaries();
    }
    public long getSalaryIncrease(Employee employee) {
        double[] rate = {-0.95, 0.1, 0.2, 0.3, 1};
        int type = employee.getType();
        long salary = employee.getSalary();
        salary += salary * rate[type-1];
        return salary;
    }
    public void calculateSalaries() {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("LeeDaeRi", 1, (long)1000000000);
        employee[1] = new Employee("KimManager", 2, (long)100000000);
        employee[2] = new Employee("WhangDesign", 3, (long)70000000);
        employee[3] = new Employee("ParkArchi", 4, (long)80000000);
        employee[4] = new Employee("LeeDevelop", 5, (long)60000000);
        
        for(Employee people:employee) {
            String name = people.getName();
            long salary = getSalaryIncrease(people);
            System.out.println(name+"="+salary);
        }
    }
}
package OOPChapter7;

public class FullTime extends Employee{
    public float MonthlySalary;
    public float calculateAnnualSalary()
    {
        return MonthlySalary * 12;
    }

    public static void main(String[] args) {
        FullTime full1 = new FullTime();
        full1.fname = "Manish";
        full1.lname = "Sharma";
        full1.MonthlySalary = 5000;
        full1.dob = "2002/03/24";

        System.out.println(full1.displayName()+" = "+full1.calculateAnnualSalary());
    }
}

package OOPChapter7;

public class PartTime extends Employee{
    public float hourlySalary;
    public int noofDays = 26;

    public float calculateAnnualSalary(){
        return hourlySalary * noofDays*12;
    }

    public static void main(String[] args) {
        PartTime part1 = new PartTime();
        part1.fname = "Manish";
        part1.lname = "Sharma";
        part1.hourlySalary = 2000;
        part1.dob = "2002/03/24";

        System.out.println(part1.displayName()+" = "+part1.calculateAnnualSalary());

    }
}

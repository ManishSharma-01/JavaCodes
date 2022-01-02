package OOPChapter7;

public class Programmer extends emplye {
    float bonus = 10000;
    float salarytotal = bonus + salary;


    public static void main(String[] args) {
    Programmer p = new Programmer();
        System.out.println("Programmer's Salary is "+ p.salary);
        System.out.println("Programmer's Bonus is "+ p.bonus);
        System.out.println("Programmer's total Salary is "+ p.salarytotal);
    }
}

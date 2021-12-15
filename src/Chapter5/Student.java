package Chapter5;

public class Student {
    private String fname;
    private String lname;
    private int age;
    private String address;
//
    public Student( String fname, String lname, int age, String address) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.address = address;
    }

//GEtter
    public String getfname(){
        return fname;}
    public String getlname(){return lname;}
    public String getaddress(){
    return address;}

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

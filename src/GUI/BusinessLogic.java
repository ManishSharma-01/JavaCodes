package GUI;

public class BusinessLogic {

    private int firstNum;
    private int secondNum;

    public BusinessLogic(int firstNum, int secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;

    }

    public int sub(){
        return firstNum - secondNum;
    }
    public int add() {
        return firstNum + secondNum;
    }


}

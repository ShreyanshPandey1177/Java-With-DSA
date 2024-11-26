
public class ClassesAndobject {

    public static void main(String[] args) {
        Pen p1 = new Pen();  //created pen obj call p1
        p1.setColor("Blue");

        p1.setTrip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "shraddha khappara";

    }
}

class Pen {

    //prop +functionality
    String colors;
    int tip;

    int getColor() {
        return this.color;
    }

    void setColor(String newColor) {
        this.colors = newColor;   //setter
    }

    void setTrip(int newTrip) {
        this.tip = newTrip;
    }
}

class BankAccount {

    public String username;
    private String password;     // access modifiers

    public void setPassword(String Password) {
        password = "pwd";
    }
}

class Student {

    String name;
    int age;
    float percentage;

    void calPercentage(int phy, int chem, int maths) {
        percentage = (phy + chem + maths) / 3;
    }
}

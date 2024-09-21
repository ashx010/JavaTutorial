import java.awt.*;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String licenseNo = "DL0000";
        System.out.println();
        Color paintColor = Color.RED;
        Car myCar = new Car(licenseNo, paintColor);
        System.out.println(myCar.licenseNo + "\t" + myCar.getPaintColor());
        myCar.changeColor(Color.BLUE);
        System.out.println(myCar.licenseNo + "\t" + myCar.getPaintColor());

        //loops
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("Enter the range for while loop");
        int j = sc.nextInt();
        while (j<10){
            System.out.println(j);
            j++;
        }
        do{
            System.out.println(j);
            j++;
        }while (j<20);


        //if-else
        System.out.println("Enter to check conditional statement");
        int k = sc.nextInt();
        if(k<10){
            System.out.println("A");
        } else if (k>10 && k<100) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        //random class
        Random rd = new Random();
        System.out.println(rd.nextInt());
        System.out.println(rd.nextInt(10));
        System.out.println(rd.nextInt(10, 20));

        //encapsulation
        BankAccount account = new BankAccount(123, 100);
        account.getInfo();
        account.deposit(100);
        account.withdraw(50);
        account.getInfo();

        //inheritance
        BankUser user = new BankUser("Jade", 20, true, 1234, 500);
        user.getUserInfo();
        if(user instanceof  BankAccount){
            System.out.println("user instanceof  BankAccount");
        }
        if(user instanceof  BankUser){
            System.out.println("user instanceof  BankUser");
        }



    }
}
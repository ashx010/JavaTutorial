import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String licenseNo = "Dl0001";
        Color paintColor = Color.RED;
        Car myCar = new Car(licenseNo, paintColor);
        System.out.println(myCar.licenseNo + "\t" + myCar.getPaintColor());
        myCar.changeColor(Color.BLUE);
        System.out.println(myCar.licenseNo + "\t" + myCar.getPaintColor());
    }
}
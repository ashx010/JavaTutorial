import java.awt.*;

public class Car {
    String licenseNo;
    Color paintColor;
    public Car( String inLicenseNo, Color inPaintColor){
        this.licenseNo = inLicenseNo;
        this.paintColor = inPaintColor;
    }

    public void changeColor(Color newPaintColor){
        this.paintColor = newPaintColor;
    }

    public Color getPaintColor(){
        return this.paintColor;
    }
}

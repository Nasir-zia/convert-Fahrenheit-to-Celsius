import java.util.Scanner;

public class Fahrenheit_Celsius {
    public static void main(String[] args) {
        float tempeture;
        System.out.println("Enter a Tempeture in fahrenheit");
        Scanner sc = new Scanner(System.in);
        tempeture = sc.nextFloat();
        System.out.println("Tempeture Entered");
        tempeture =((tempeture-32)*5)/9;
        System.out.println("Tempetue is converted into Fahrenheit----->>"+tempeture);

    }
}

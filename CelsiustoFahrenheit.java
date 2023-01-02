package Lab3;
//Celsius To Fahrenheit
import java.util.Scanner;
public class CelsiustoFahrenheit {
    //Attribute
    private double Celsius;
    private double Fahrenheit;

    //Constructor Method
    CelsiustoFahrenheit(double Celsius) {
        this.Celsius = Celsius;
    }

    //Setter Method
    public void setCelsius(double Celsius) {
        this.Celsius = Celsius;
    }

    public void setFahrenheit(double Fahrenheit) {
        this.Fahrenheit = Fahrenheit;
    }


    //Getter Method
    public double getCelsius() {
        return this.Celsius;
    }

    public double getFahrenheit() {
        return this.Fahrenheit;
    }

    //Facility Method
    public void calFahrenheit(double Celsius) {
        Fahrenheit = (Celsius * 9.0) / 5.0 + 32;
        setFahrenheit(Fahrenheit);
    }

    public String toString() {
        getCelsius();  //เรียก Method นี้มาเพื่อนำค่า Celsius มาแสดงผล
        calFahrenheit(Celsius);  //เรียก Method นี้มาเพื่อคำนวณ Fahrenheit แล้วเอามาแสดงผล
        String s1 = "==============================\n" + "Celsius : " + Celsius + "\nFahrenheit : " + Fahrenheit + "\n==============================";
        return s1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //ประกาศ Instance ของ Scan
        System.out.print("Celsius : ");
        double n1 = scan.nextDouble();  //เอาตัวแปรมารับการแสกน
        CelsiustoFahrenheit CelsiustoFahrenheit = new CelsiustoFahrenheit(n1);  //ประกาศ Instance ของ Class
        System.out.println(CelsiustoFahrenheit.toString());  //ปริ้นโดยเรียกใช้ Method toString
    }
}
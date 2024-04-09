import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double m = scanner.nextDouble();
        double r = scanner.nextDouble();
        double mInEARTH = scanner.nextDouble();
        HanhTinh planet = new HanhTinh(m,r);
        double res = mInEARTH * planet.khoiLuongBeMat();
        System.out.printf("Your weight on %s is %.2f\n", name, res);
    }
}
class HanhTinh{
    private double khoiLuong;
    private double banKinh;
    public double G = 6.67300e-11;
    public HanhTinh(double khoiLuong, double banKinh){
        this.banKinh = banKinh;
        this.khoiLuong = khoiLuong;
    }
    public double trongLucBeMat(){
        return (khoiLuong*G)/(banKinh*banKinh);
    }
    public double khoiLuongBeMat(){
        HanhTinh traiDat = new HanhTinh(5.976e+24, 6.37814e6);
        return this.trongLucBeMat()/ traiDat.trongLucBeMat();
    }
}

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            if (t < 1) {
                System.out.println("invalid input");
                return;
            }
            sc.nextLine();
            ArrayList<TaiKhoan> list_TK = new ArrayList<TaiKhoan>();
            // nhập tên từng tài khoản
            for (int i = 1; i <= t; i++) {
                String ten = sc.nextLine();
                TaiKhoan tk = new TaiKhoan(i, ten);
                list_TK.add(tk);
            }
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] arrStr = line.split(" ", 4);
                int id = Integer.parseInt(arrStr[0]);
                if (arrStr[1].equals("Add")) {
                    String ghiChu = arrStr[2].substring(3, 5) + " " + arrStr[2].substring(0, 3) + " " + arrStr[2].substring(5) + " |";
                    ghiChu = ghiChu + " " + arrStr[3];
                    list_TK.get(id - 1).addNote(ghiChu);
                } else if (arrStr[1].equals("Share")) {
                    int idKhach = Integer.parseInt(arrStr[2]);
                    int idNote = Integer.parseInt(arrStr[3]);
                    list_TK.get(id - 1).shareNote(list_TK.get(idKhach - 1), idNote);
                } else throw new Exception("Lỗi lệnh");
            }
            for (int i = 0; i < t; i++) {
                list_TK.get(i).printInfo();
            }

        }catch (Exception e){
            System.out.println("invalid input");
        }
    }

}

class TaiKhoan {
    private int id;
    private String tenTk;
    private ArrayList<String> list_ghiChu;

    public TaiKhoan(){}
    public TaiKhoan(int id, String tenTk){
        this.id = id;
        this.tenTk = tenTk;
        this.list_ghiChu = new ArrayList<String>();
    }

    public void addNote(String s){
        this.list_ghiChu.add(s);
    }

    public void shareNote(TaiKhoan other, int idNote){
        String note = this.list_ghiChu.get(idNote-1);
        other.addNote(note);
    }

    public void printInfo(){
        System.out.println("Account: "+ this.tenTk);
        for(String note : this.list_ghiChu){
            System.out.println(note);
        }
    }

}
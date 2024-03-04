import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String init_Account = sc.nextLine();
            String transactions = sc.nextLine();

            ArrayList<Account> list_Acc = new ArrayList<Account>();
            CreateAcc(init_Account, list_Acc);
            thucThiLenh(transactions, list_Acc);
            for(Account acc : list_Acc){
                System.out.print(acc.toString());
            }
            System.out.println();
        }
    }
    public static boolean checkStringLetter(String s){
        for(int i = 0; i < s.length(); i++){
            if(!Character.isLetter(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static boolean checkStringDigit(String s){
        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static void CreateAcc(String init_Account, ArrayList<Account> list_acc){
        String[] arr_Init_Account = init_Account.split(" ");
        int a1 = 1;
        int slgTaiKhoan = Integer.parseInt(arr_Init_Account[0]);
        for(int i = 1; i <= slgTaiKhoan; i++){
            String name = "";
            while(true){
                if(!checkStringDigit(arr_Init_Account[a1])){
                    name = name + " " + arr_Init_Account[a1];
                    a1++;
                    continue;
                }
                break;
            }
            long soDuTaiKhoan = Integer.parseInt(arr_Init_Account[a1]);
            Account acc = new Account(i, name, soDuTaiKhoan);
            list_acc.add(acc);
            a1++;
        }
    }
    public static void thucThiLenh(String transactions, ArrayList<Account> list_acc){
        String[] arr_Transactions = transactions.split(" ");
        int slgLenh = Integer.parseInt(arr_Transactions[0]);
        int index = 1;
        for(int i = 1; i <= slgLenh; i++){
            if(checkStringLetter(arr_Transactions[index])){
                if(arr_Transactions[index].equals("rut")){
                    int id = Integer.parseInt(arr_Transactions[index+1]);
                    long tien = Long.parseLong(arr_Transactions[index+2]);
                    list_acc.get(id-1).rutTien(tien);
                    index = index + 3;
                } else if (arr_Transactions[index].equals("chuyen")) {
                    int id = Integer.parseInt(arr_Transactions[index+1]);
                    int id_nhan = Integer.parseInt(arr_Transactions[index+2]);
                    long tien = Long.parseLong(arr_Transactions[index+3]);
                    list_acc.get(id-1).chuyenTien(list_acc.get(id_nhan-1),tien);
                    index += 4;
                } else if (arr_Transactions[index].equals("nap")) {
                    int id = Integer.parseInt(arr_Transactions[index+1]);
                    long tien = Long.parseLong(arr_Transactions[index+2]);
                    list_acc.get(id-1).napTien(tien);
                    index += 2;
                }
            }
        }
    }
    static class Account{
        private int id;
        private String name;
        private long accountBalance;

        public Account(){}
        public Account(int id, String name, long accountBalance){
            this.id = id;
            this.name = name.trim();
            this.accountBalance = accountBalance;
        }
        //getter method
        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAccountBalance(long accountBalance) {
            this.accountBalance = accountBalance;
        }
        //getter method
        public String getId() {
            String idAccount = String.valueOf(this.id);
            while(idAccount.length() < 3){
                idAccount = "0" + idAccount;
            }
            return idAccount;
        }

        public String getName() {
            return name;
        }

        public long getAccountBalance() {
            return accountBalance;
        }
        public void napTien(long soTien){
            this.accountBalance += soTien;
        }
        public void rutTien(long soTien){
            this.accountBalance -= soTien;
        }
        public void chuyenTien(Account acc_other, long soTien){
            acc_other.accountBalance += soTien;
            this.accountBalance -= soTien;
        }

        public String toString(){
            return "[" + this.getId() + ", " + this.name + ", " + this.accountBalance + "]";
        }

    }
}


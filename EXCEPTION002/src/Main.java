import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0){
            String fileName = scanner.nextLine();
            try {
                CheckFileExtension(fileName);
            } catch (NotJavaFileException e){
                System.out.println(0);
            }
        }
    }
    public static void CheckFileExtension(String fileName) throws NotJavaFileException {
        if(fileName.isEmpty()) {
            System.out.println("Not java file exception.Mark is -1");
        } else if (!fileName.contains(".java")) {
            throw new NotJavaFileException();
        } else {
            System.out.println(1);
        }
    }
    static class NotJavaFileException extends Exception{
        public NotJavaFileException(){
        }
    }
}

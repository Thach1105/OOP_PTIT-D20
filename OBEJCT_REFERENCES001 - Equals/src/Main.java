import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-- > 0){
            String line1 = sc.nextLine();
            String line2= sc.nextLine();

            String[] arr1 = line1.split(" ");
            String[] arr2 = line2.split(" ");
            Song song1 = new Song(arr1[0], arr1[1], Integer.parseInt(arr1[2]));
            Song song2 = new Song(arr2[0], arr2[1], Integer.parseInt(arr2[2]));

            System.out.println(song1.equals(song2));
        }
    }
}

class Song{
    private String name;
    private String author;
    private int duration;
    public Song(){}
    public Song(String name, String author, int duration){
        this.name = name;
        this.author = author;
        this.duration = duration;
    }
    public boolean equals(Song obj){
        if((this.name.equals(obj.name)) && (this.author.equals(obj.author)) && (this.duration == obj.duration)){
            return true;
        }
        return false;
    }
}
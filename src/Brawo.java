import java.util.Scanner;

public class Brawo {
    public static void main(String[] args) {
        System.out.println("Wpisz swoje imię!");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        for (int i=1; i<=5; i++){
            System.out.println("Brawo "+name);
        }
    }
}

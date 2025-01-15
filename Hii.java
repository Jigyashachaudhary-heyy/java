import java.util.Scanner;

class Hii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter something:");
        String str = sc.nextLine(); 
        
        System.out.println("You entered: " + str); 
        
        sc.close();
    }
}

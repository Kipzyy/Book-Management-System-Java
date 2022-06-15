import java.util.Scanner;
import java.text.DecimalFormat;
public class BookManagementMain
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        String title;
        String genre;
        double price;
        int quantity;
        
        System.out.print("Enter book title : ");
        title = input.nextLine();
        
        System.out.print("Enter book genre : ");
        genre = input.nextLine();
        
        System.out.print("Enter book price : RM");
        price = input.nextDouble();
        
        System.out.print("Enter book quantity : ");
        quantity = input.nextInt();
        
        BookManagement book = new BookManagement(title, genre, price, quantity);
        
        System.out.println(book.toString());
    }
}

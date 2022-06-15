import java.text.DecimalFormat;
public class BookManagement
{
    /**Attributes*/
    private String title; //Book title
    private String genre; //Book genre
    private double price; //Book price
    private int quantity; //Book quantity

    /**Normal constructor*/
    public BookManagement(String n, String g, double p, int q)
    {
        title = n;
        genre = g;
        price = p;
        quantity = q;
    }

    /**Mutator*/
    public void setTitle(String T)
    {
        title = T;
    }

    public void setGenre(String G)
    {
        genre = G;
    }

    public void setPrice(double P)
    {
        price = P;
    }

    public void setQuantity(int Q)
    {
        quantity = Q;
    }

    /**Accessors*/
    public String getTitle()
    {
        return title;
    }

    public String getGenre()
    {
        return genre;
    }

    public double getPrice()
    {
        return price;
    }
    
    public int getQuantity()
    {
        return quantity;
    }

    /**toString - Display method*/
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        return "\nBook title : " + title + "\n" +
               "Book genre : " + genre + "\n" +
               "Book price : RM" + df.format(price) + "\n" +
               "Book quantity : " + quantity + "\n";
    }
}

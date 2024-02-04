package chapter_2.Question_3;

/*
1 class for reader: 
	instance: books type array, username, password, books url array, balance(credit)
	method: buy a book, setter getter uname, pword,  
    (static method)-> open url Desktop class to read book. delete book
 */
import java.util.HashMap;
import java.awt.Desktop;
import java.net.URI;

public class BookReader{
    private String userName;
    private String password;
    private double balance;

    private  HashMap<Book, String> purchasedBooks = new HashMap<>();
    
    BookReader(){}

    BookReader(String uname, String pw, double balance, HashMap<Book, String> purchasedBooks){
        this.userName = uname;
        this.password = pw;
        this.balance = balance;
        this.purchasedBooks = purchasedBooks;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public  boolean buyBook(String name, String genre){
        Book toBuy = new Book(name, genre);
        if (!purchasedBooks.containsKey(toBuy) && toBuy.getPrice() <= this.getBalance()){
            this.balance -= toBuy.getPrice();
            purchasedBooks.put(toBuy, "book url");
            return true;
        }
        return false;
        
    }

    public boolean readBook(Book toRead){
        if (purchasedBooks.containsKey(toRead)){
            openWebpage(purchasedBooks.get(toRead));
            return true;
        }
        return false;
    }


    public static void openWebpage(String urlString) {
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                URI uri = new URI(urlString);
                Desktop.getDesktop().browse(uri);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void viewPurchasedBooks(){
        purchasedBooks.forEach((book, link)->System.out.println(book + "\n" + link));
    }    
}
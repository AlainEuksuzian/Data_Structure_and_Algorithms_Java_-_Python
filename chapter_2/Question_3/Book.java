package chapter_2.Question_3;

public class Book{
    private String bookName;
    private String bookGenre;
    private double price;

    Book(){}

    Book(String name, String genre, double price){
        this.bookName = name;
        this.bookGenre = genre;
        this.price = price;
    }

    Book(Book object){
        this.bookName = object.bookName;
        this.bookGenre = object.bookGenre;
        this.price = object.price;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        else if (!(obj instanceof Book)){
            return false;
        }
        else {
            Book otherObj = (Book) obj;
            return (this.bookName.equalsIgnoreCase(otherObj.bookName) && 
            this.bookGenre.equalsIgnoreCase(otherObj.bookGenre) && this.price == otherObj.price);
        }
    }

    
    @Override
    public String toString() {
        return "The book name is :" + this.getBookName() + "\nThe Book genre is: " + this.getBookGenre()  + "\nThe book price is: " + this.getPrice();
    }

}

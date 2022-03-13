
import java.util.ArrayList;
class Book{
    public String name,author;
    public Book(String name,String author){
        this.name=name;
        this.author=author;
       }
    @Override
    public String toString(){
        return "Book {" + "book name : "+name + ", author : "+author+ "} \n";
    }
    }
class mylibrary{
    public ArrayList <Book> books;
    public mylibrary(ArrayList <Book> books ){
        this.books = books;
    }
    

    public void returnBook(Book book){
        System.out.println("The book is return by you");
        this.books.add(book);
    }
    public void addBook(Book book){
        System.out.println("The book is added");
        this.books.add(book);
    } 
    public void issueBook(Book book,String issueto){ 
        System.out.println("The book is issue by "+issueto);
        this.books.remove(book);   
    }
   }





public class library{
    public static void main(String [] args) {
        ArrayList<Book> t = new ArrayList<>();


        Book k1 = new Book ("javascript","by");
        t.add(k1);
        Book k2 = new Book ("css","by");
        t.add(k2);
        Book k3 = new Book ("python","by");
        t.add(k3);
        Book k4 = new Book ("java","by");
        t.add(k4);
        Book k5 = new Book ("html","by");
        t.add(k5);

        mylibrary l = new mylibrary(t);
        l.addBook(new Book("apple","Steve"));
        l.returnBook(new Book("ppppp","p"));
        l.issueBook(k5 ,"bbuybui");
        System.out.println(l.books);

       
      
            
    
       
        
    }
    
}
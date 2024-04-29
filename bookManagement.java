import java.util.Scanner;
public class bookManagement{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int size = 5;
        int counter = 0;
        Book[] books = new Book[size];
        while (true) {
            menu();
            int choice = sc.nextInt();
            if(choice==1){
                counter = addBook(books, counter);
            }else if(choice==2){
                counter = deleteBook(books, counter);                
            }else if(choice==3){
                searchBook(books, counter);
            }else if(choice==4){
                editBook(books, counter);
            }else if(choice==5){
                displayAll(books, counter);
            }else if(choice==6){
                displayBelow(books, counter);
            }else if(choice==7){
                displayMax(books, counter);
            }else if(choice==8){
                books = sort(books, counter);                
            }else if(choice==9){
                break;           
            }else{
                System.out.println("Invalid chioce! Try again");
            }
        }
        sc.close();
    }
    
    public static void menu(){
        System.out.println("--- Book Management Application ---");
        System.out.println("1. Add a book");
        System.out.println("2. Delete a book (by ISBN)");
        System.out.println("3. Search for a book (by ISBN)");
        System.out.println("4. Edit a book info");
        System.out.println("5. Display all books");
        System.out.println("6. Display all books that are below a price");
        System.out.println("7. Display the book with the maximum price");
        System.out.println("8. Sort the books by price");
        System.out.println("9. Exit");
    }

    public static int addBook(Book[] books, int counter){        
        if(counter==books.length){
            System.out.println("Inventory full! Can't add");
            return counter;
        }
        System.out.println("Enter the name: ");
        String name = sc.next();
        System.out.println("Enter ISBN: ");
        int isbn = sc.nextInt();
        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        for (int i=0; i<books.length; i++){
            if(books[i]==null){
                books[i] = new Book(name,isbn,price);
                return counter+=1;
            }
        }
        return counter;
    }

    public static int deleteBook(Book[] books, int counter){
        if(counter==0){
            System.out.println("Inventory empty! Can't delete");
            return counter;
        }
        System.out.println("Enter ISBN: ");
        int isbn = sc.nextInt();
        for (Book book : books){
            if (book.getIsbn()==isbn){
                book=null;
                return counter-=1;
            }    
        }
        System.out.println("Book not found!");
        return counter;
    }

    public static void searchBook(Book[] books, int counter){
        if(counter==0){
            System.out.println("Inventory empty! Can't search");
            return;
        }
        System.out.println("Enter ISBN: ");
        int isbn = sc.nextInt();
        for (Book book : books){
            if (book.getIsbn()==isbn){
                System.out.println(book);
                return;
            }    
        }
        System.out.println("Book not found!");
    }

    public static void editBook(Book[] books, int counter){
        if(counter==0){
            System.out.println("Inventory empty! Can't edit");
            return;
        }
        System.out.println("Enter ISBN: ");
        int isbn = sc.nextInt();
        for (Book book : books){
            if (book.getIsbn()==isbn){
                System.out.println("Enter new price: ");
                double price = sc.nextDouble();
                book.setPrice(price);
                return;
            }    
        }
        System.out.println("Book not found!");
    }

    public static void displayAll(Book[] books, int counter){
        if(counter==0){
            System.out.println("Inventory empty! Can't display");
            return;
        }
        for (Book book : books){
            System.out.println(book);
        }
    }

    public static void displayBelow(Book[] books, int counter){
        if(counter==0){
            System.out.println("Inventory empty! Can't display");
            return;
        }
        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        for (Book book : books){
            if(book.getPrice()<price){
                System.out.println(book);
            }
        }
    }

    public static void displayMax(Book[] books, int counter){
        if(counter==0){
            System.out.println("Inventory empty! Can't display");
            return;
        }
        double max = 0;
        for (Book book : books){
            if(book.getPrice()>max){
                max = book.getPrice();
            }
        }
        for (Book book : books){
            if(book.getPrice()==max){
                System.out.println(book);
            }
        }
    }

    public static Book[] sort(Book[] books, int counter){
        if(counter==0){
            System.out.println("Inventory empty! Can't sort");
            return books;
        }
        for (int i=0; i<books.length; i++){
            for (int j=i+1; j<books.length; j++){
                if(books[i].getPrice()>books[j].getPrice()){
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
        return books;
    }
}

class Book {
    private String name;
    private int isbn;
    private double price;
    public Book(String name, int isbn, double price){
        this.name = name;
        this.isbn = isbn;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public int getIsbn(){
        return this.isbn;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "name: "+name+"\nISBN: "+isbn+"\nprice: "+price;
    }
}
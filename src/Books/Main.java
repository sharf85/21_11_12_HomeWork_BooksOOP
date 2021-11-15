package Books;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //1.Book содержит поля id(int), title(String), author(String), price(int),
        // геттеры к ним и метод int computePrice(), который просто отдает цену книги
        //2.TechnicalBook наследует книгу, плюс имеет поле scientificField(String) - научная область
        //3.LiteratureBook наследует книгу, кроме того цена литературной книги
        // рассчитывается из суммы базовой стоимости и 10 условных единиц
        //4.BestSeller наслудует литературную книгу(!) и имеет дополнительное поле,
        // которое рассчитывается из стоимости литературной(!) книги, умноженной на коэффициент
        //5.Все классы должны содержать единственный конструктор, позволяющий задать все поля новому объекту.
        //6.В классе Main написать статический метод String describeBook(Book book),
        // отдающий описание книги (использующее поля книги)
        //7.В метое main создать несколько книг, сделать массив из них и вызвать описание каждой книги из массива.
        Book book = new Book(1, "Gone with the Wind", "Margaret Mitchell", 50);
        Book technicalBook = new TechnicalBook(2, "Java", "Herbert Schildt", 75, "Computer Science");
        Book literatureBook = new LiteratureBook(3, "Harry Pottter and the Philosopher's Stone", "J.K.Rowling", 40);
        Book bestSeller = new BestSeller(4, "Fifty Shades of Grey", "EL James", 40, 4.5);
        System.out.println(describeBook(book));
        System.out.println(describeBook(technicalBook));
        System.out.println(describeBook(literatureBook));
        System.out.println(describeBook(bestSeller));
        Book[] books = {book, technicalBook, literatureBook, bestSeller};
        booksArray(books);
        System.out.println(book.computePrice());
        System.out.println(technicalBook.computePrice());
        System.out.println(literatureBook.computePrice());
        System.out.println(bestSeller.computePrice());

    }


    static String describeBook(Book book) {
        return book.getId() + " " + book.getTitle() + " " + book.getAuthor() + " " + book.getPrice();

    }

    static void booksArray(Book[] books) {
        for (int i = 0; i < books.length; i++) {
        }
        System.out.println(Arrays.toString(books));
    }

}

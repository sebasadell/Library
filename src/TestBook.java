public class TestBook {
    public static void main(String[] argv){
        Book aBook = new Book ("Java for dummy", new Author("Name", "mail@mail.com", 'f'), 19.95, 1000);

        System.out.println(aBook.getName());
        System.out.println(aBook.getAuthor().getName());
        System.out.println(aBook.getAuthor().getEmail());
        System.out.println(aBook.getPrice());
        System.out.println(aBook.getQtyInStock());
        System.out.println(aBook);
        aBook.setPrice(24.95);
        aBook.setQtyInStock(750);
        System.out.println(aBook.getPrice());
        System.out.println(aBook.getQtyInStock());
        System.out.println(aBook.getAuthorName());
        System.out.println(aBook.getAuthorEmail());
        System.out.println(aBook.getAuthorGender());

        Book[] array = new Book[5];
        array[0] = new Book("Mistborn: The Final Empire", new Author("Brandon Sanderson", "brandonsanderson@mail.com", 'm'), 12.30, 5000);
        array[1] = new Book("Java for beginners", aBook.getAuthor(), 19.95, 500);
        array[2] = new Book("Game of Thrones", new Author("George R. R. Martin", "georgerrmartin@mail.com", 'm'), 14.21, 7500);
        array[3] = new Book("The Fellowship of the Ring", new Author("J. R. R. Tolkien", "", 'm'), 21.00, 2500);
        array[4] = new Book("Harry Potter and the Philosopher’s Stone", new Author("J. K. Rowling", "jkrowling@mail.com", 'f'), 7.60, 15000);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
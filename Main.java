public class Main{
    public static void main(String[] args) {
        Library<Integer, String, String> lib = new Library<>();
        Book<String> book1 = new Book<String>("Divine Comedy");
        LibraryCard<Integer,String> card1 =  new LibraryCard<Integer,String>(1, "Dante");
        lib.addToLibrary(book1, card1);
        Book<String> book2 = new Book<String>("Master and Margarita");
        LibraryCard<Integer,String> card2 =  new LibraryCard<Integer,String>(2, "Bulgakov");
        lib.addToLibrary(book2, card2);

        lib.getLibrary();

        lib.getLibraryCard(book1);
        lib.getLibraryCard(book2);
    }
}
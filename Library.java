// Создайте класс Library, который будет представлять библиотеку. 
// У этого класса должны быть методы для добавления книг и выдачи библиотечных карточек.
// Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.
import java.util.HashMap;
import java.util.Map;


public class Library<K extends Number, T,V extends String> {
    private Map<Book<T>, LibraryCard<K,V>> library;
    public Library(){
        library = new HashMap<>();
    }

    public void addToLibrary(Book<T> bookName, LibraryCard<K,V> card){
        library.putIfAbsent(bookName,card);
    }
    public void getLibraryCard(Book<T> bookName){
        System.out.println(library.getOrDefault(bookName, null));
    }
    public void getLibrary(){
        System.out.println(library.entrySet());
    }
}

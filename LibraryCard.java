// Создайте обобщенный класс LibraryCard<K, V>, который представляет библиотечную карточку для 
// определенной книги. Каждая карточка должна содержать параметры типов K для номера карточки и 
// V для информации о книге.
public class LibraryCard <K,V> {
    private K cardNumber;
    private V information;
    public LibraryCard(K cn, V inf){
        this.cardNumber = cn;
        this.information = inf;
    }

    @Override
    public String toString() {
        return "Card number: " + cardNumber + ", Information: " + information;
    }
}

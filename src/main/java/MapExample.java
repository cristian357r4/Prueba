import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args){
        Map<String,String> booksByISBN = new HashMap<>();
        booksByISBN.put("987-3-16-141414-0","Un mundo feliz");
        booksByISBN.put("987-3-16-141414-1","El mundo y sus dedmonios");
        booksByISBN.put("987-3-16-141414-2","literatura clasica");
        showBooks(booksByISBN);
        booksByISBN.remove("987-3-16-141414-2");
        System.out.println("Deleted book");
        System.out.println("-----------------------------");
        showBooks(booksByISBN);
    }

    public static void showBooks(Map<String,String> booksByISBN){
        booksByISBN.forEach((key, value) -> System.out.println("ISBN: " + key + ", Título: " + value));
    }

}

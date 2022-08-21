package ch23;
import java.util.ArrayList;
import ch21.Book;


public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("백설공주1", "아아1"));
		library.add(new Book("백설공주2", "아아2"));
		library.add(new Book("백설공주3", "아아3"));
		library.add(new Book("백설공주4", "아아4"));
		library.add(new Book("백설공주5", "아아5"));
		
		
		for(int i = 0 ; i < library.size(); i ++) {
			System.out.print("  ||   ");
			library.get(i).showInfo();
		}
	}

	
}

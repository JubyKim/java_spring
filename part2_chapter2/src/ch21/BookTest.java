package ch21;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("백설공주", "아아");
		library[1] = new Book("백공주", "아d아");
		library[2] = new Book("백설주", "아g아");
		library[3] = new Book("백설공", "아d아");
		library[4] = new Book("설공주", "아a아");
		
		
		System.arraycopy(library, 0, copyLibrary, 0, library.length);
		System.out.println("");
		
		for (Book b : library) {
			System.out.println(b);
			b.showInfo();
		}
		
		System.out.println("Copy");
		for (Book b : copyLibrary) {
			System.out.println(b);
			b.showInfo();
		}
		
		library[0].setAuthor("뜨아"); // 주소값 복사이기 때문. //Shallow copy
		
		
		for (Book b : library) {
			System.out.println(b);
			b.showInfo();
		}
		
		System.out.println("Copy");
		for (Book b : copyLibrary) {
			System.out.println(b);
			b.showInfo();
		}
		
	}

}

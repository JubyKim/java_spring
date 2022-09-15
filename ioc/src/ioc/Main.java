package ioc;

public class Main {

	public static void main(String[] args) {
		
		String url = "www.naver.com/boooks/it?page=10&size=20&name=spring-boot";
		
//		//Base 64 encoding 
//		IEncoder encoder = new Base64Encoder();
//		String result = encoder.encode(url);
//		System.out.println(result);
//		
//		//url encoder
//		IEncoder urlEncoder = new UrlEncoder();
//		String urlResult = urlEncoder.encode(url);
//		System.out.println(urlResult);
		
		Encoder encoder = new Encoder(new Base64Encoder());
		String result = encoder.encode(url);
		System.out.println(result); 
		
		

	}

}

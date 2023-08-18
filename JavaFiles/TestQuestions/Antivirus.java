package assignmentJava.TestQuestions;
class ProductKey{
	private final String productKey;
	ProductKey(String productKey){
		this.productKey = productKey;
		activate(productKey);
	}
	public void activate(String key) {
		if(key!=null && key.equals("123Sri")) {
			System.out.println("Antivirus Activated");
		}else {
			System.out.println("Your using a free version please upgrade");
		}
	}
	

}
public class Antivirus {
public static void main(String[] args) {
	ProductKey pk = new ProductKey("123Sr");

}
}

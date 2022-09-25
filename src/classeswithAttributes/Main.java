package classeswithAttributes;

public class Main {

	public static void main(String[] args ) {
		Product product = new Product();
		product.name = "Laptop";
		product.id=1;
		product.price=5000;
		product.description= "lenova Laptop";
				product .stockAmount=5;
				
		ProductManeger productManeger=new ProductManeger();
		productManeger.Add(product);
				
		

	}

}

package Service;

import java.util.List;

import io.springboot.Javaguides.Crude.model.Product;

public interface ProductService {
	 Product createProduct(Product product);
     Product updateProduct(Product product);
     List < Product > getAllProduct();
     Product getProductById(long productId);
     void deleteProduct(long id);

}

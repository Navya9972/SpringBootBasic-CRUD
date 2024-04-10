package ServiceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Exception.ResourceNotFoundException;
import Repository.ProductRepository;
import Service.ProductService;
import io.springboot.Javaguides.Crude.model.Product;


public class ProductServiceImpl implements ProductService {

	
	 @Autowired
	  private ProductRepository productRepository;

	    public List < Product> getAllProduct() {
	        return this.productRepository.findAll();
	    }

	    @Override
	    public Product getProductById(long productId) {

	        Optional < Product > productDb = this.productRepository.findById(productId);

	        if (productDb.isPresent()) {
	            return productDb.get();
	        } else {
	            throw new ResourceNotFoundException("Record not found with id : " + productId);
	        }
	    }

	    @Override
	    public void deleteProduct(long productId) {
	        Optional < Product > productDb = this.productRepository.findById(productId);

	        if (productDb.isPresent()) {
	            this.productRepository.delete(productDb.get());
	        } else {
	            throw new ResourceNotFoundException("Record not found with id : " + productId);
	        }

	    }

		@Override
		public Product createProduct(Product product) {
			
			return productRepository.save(product);
		}

		@Override
		public Product updateProduct(Product product) {
			 Optional < Product > productDb = this.productRepository.findById(product.getId());

		        if (productDb.isPresent()) {
		           Product productUpdate = productDb.get();
		            productUpdate.setId(product.getId());
		            productUpdate.setName(product.getName());
		            productUpdate.setDescription(product.getDescription());
		            productRepository.save(productUpdate);
		            return productUpdate;
		        } else {
		            throw new ResourceNotFoundException("Record not found with id : " + product.getId());
		        }
		    }
}

		
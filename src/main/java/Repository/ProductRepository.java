package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.springboot.Javaguides.Crude.model.Product;


public interface ProductRepository extends JpaRepository<Product,Long> {

}

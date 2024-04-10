package io.springboot.Javaguides.Crude.model;

import java.math.BigDecimal;
import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "description")
	    private String description;

	    @Column(name = "price")
	    private BigDecimal price;

	  


	    public Product(long id, String name, String description, BigDecimal price) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.price = price;
		
		}
	    
	    public long getId() {
	        return id;
	    }
	    public void setId(long id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getDescription() {
	        return description;
	    }
	    public void setDescription(String description) {
	        this.description = description;
	    }
	    public BigDecimal getPrice() {
	        return price;
	    }
	    public void setPrice(BigDecimal price) {
	        this.price = price;
	    }
	    
	}



package com.learn.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	
	private String productTitle;
	
	@Column(length = 3000)
	private String productDescription;
	
	private String  pImage;
	
	private String pPrice;
	
	private String pDiscount;
	
	private String pQuantity;
	
	@ManyToOne
	private Category category;
	

	
}

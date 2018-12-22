
package net.skhu.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity

@Table(name = "products")
public class Product {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
	
	String product_code;
	String product_name;
	String category;
	
	@JsonIgnore
	@OneToMany(mappedBy="product", fetch = FetchType.LAZY)
	List<OrderDetail> orderDetails;
}
	
	

package net.skhu.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

@Table(name = "order_details")
public class OrderDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
	
	int status_id;
	double discount;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
    Order order;
	
	@ManyToOne
	@JoinColumn(name ="product_id")
	Product product;
}

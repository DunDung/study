package net.skhu.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.domain.Customer;
import net.skhu.domain.Order;
import net.skhu.domain.OrderDetail;
import net.skhu.domain.Product;
import net.skhu.repository.CustomerRepository;
import net.skhu.repository.OrderRepository;


@RestController
@RequestMapping("api")
public class APIController {

	@Autowired OrderRepository orderRepository;
	@Autowired CustomerRepository customerRepository;
	

	
	@RequestMapping("order/{id}/product")
	public List<Product> products(@PathVariable("id") int id) {
        Order order = orderRepository.findById(id).get();
        List<Product> list = new ArrayList<>();
        
        for (OrderDetail r :  order.getOrderDetails())
            list.add(r.getProduct());
        return list;
	}
	
	@RequestMapping("customers")
	public List<Customer> customers(){
		return customerRepository.findAll();
	}
	@RequestMapping("orders")
	public List<Order> orders(){
		return orderRepository.findAll();
	}
}

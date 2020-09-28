package net.skhu.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
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
@RequestMapping("exam")
public class API2Controller {

	@Autowired CustomerRepository customerRepository;
	@Autowired OrderRepository orderRepository;

	
	@RequestMapping("list5")
	public String customers(Model model) {
		List<Customer> a = customerRepository.findAll();
		model.addAttribute("list", a);
        return "exam/list5";
	}
}

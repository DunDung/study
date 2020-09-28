package net.skhu.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>  {

}

package net.skhu.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@ToString(exclude={"orderCount"})
@EqualsAndHashCode(exclude={"orderCount"})

@Table(name = "customers")
public class Customer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
	
	String company;
	
	String last_name;
	String first_name;
	String city;
	String state_province;
	String zip_postal_code;

	String job_title;
	String business_phone;

	

}

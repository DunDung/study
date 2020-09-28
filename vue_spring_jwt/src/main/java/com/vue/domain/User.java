package com.vue.domain;

import java.util.Iterator;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="user_tbl")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idx;
	
	@Column(name="user_id", unique=true, length=20)
	private String userId;
	
	@Column(name="user_pw", length=20)
	private String userPw;
	
	@Column(name="user_name", length=20)
	private String userName;
	
	//@ManyToMany(cascade=CascadeType.ALL)
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;
	
	@Column(name="user_token", length=250)
	private String userToken;
	
	public User(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}

	public User() {}
	
	public String getRole(Set<Role> getRole) {
		
		Iterator<Role> it = getRole.iterator();
		String role = "";
		while(it.hasNext()) {
			role = it.next().getRole();
		}
		return role;
	}
}

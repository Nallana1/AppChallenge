package com.boot.rest.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Routes {
	
	@Id
	private Long account_id;
	
	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public String getRoute1() {
		return route1;
	}

	public void setRoute1(String route1) {
		this.route1 = route1;
	}

	public String getRoute2() {
		return route2;
	}

	public void setRoute2(String route2) {
		this.route2 = route2;
	}

	@Column(name="Route1")
	private String route1;
	
	@Column(name="Route2")
	private String route2;
	
}

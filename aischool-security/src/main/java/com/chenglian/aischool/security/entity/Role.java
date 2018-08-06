package com.chenglian.aischool.security.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="security_role")
public class Role {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuidGenerator")
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	private String roleId;
	
	private String roleName;
	
	@ManyToMany(fetch = FetchType.LAZY, targetEntity = User.class, cascade = CascadeType.ALL, mappedBy = "roles")
	@JsonBackReference
	private List<User> users;

	/**
	 * @return id
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * @param id 要设置的 id
	 */
	public void setId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName 要设置的 roleName
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return users
	 */
	public List<User> getUsers() {
		return users;
	}

	/**
	 * @param users 要设置的 users
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public Role() {
	}
}

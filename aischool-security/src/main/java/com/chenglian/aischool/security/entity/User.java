package com.chenglian.aischool.security.entity;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="security_user")
public class User {
    
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuidGenerator")
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
    private String userId;

    private String username;

    private String password;
    
    private String email;
    
    private Date lastPasswordResetDate;
    
    @ManyToMany(fetch = FetchType.EAGER, targetEntity = Role.class, cascade = CascadeType.ALL)
    @JoinTable(name = "security_user_role", joinColumns = @JoinColumn(name = "userId",referencedColumnName="userId")
    , inverseJoinColumns = @JoinColumn(name = "roleId",referencedColumnName="roleId"))
    @JsonManagedReference
    private List<Role> roles;
    
//    private Set<Role> roles;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    public void setLastPasswordResetDate(Date lastPasswordResetDate) {
        this.lastPasswordResetDate = lastPasswordResetDate;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    
    
	public User() {
	}

//	/**
//	 * @return roles
//	 */
//	@ManyToMany(fetch=FetchType.LAZY,targetEntity=Role.class)
//    @JoinTable(name = "security_user_role", joinColumns = @JoinColumn(name = "userId",referencedColumnName="userId")
//    , inverseJoinColumns = @JoinColumn(name = "roleId",referencedColumnName="roleId"))
//	public Set<Role> getRoles() {
//		return roles;
//	}
//
//	/**
//	 * @param roles 要设置的 roles
//	 */
//	public void setRoles(Set<Role> roles) {
//		this.roles = roles;
//	}
    
}

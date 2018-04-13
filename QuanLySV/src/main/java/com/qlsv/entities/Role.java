package com.qlsv.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

	@Column(name = "RoleID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer RoleID;

	@Column(name = "rolename")
	private String roleName;

	public Integer getRoleID() {
		return RoleID;
	}

	public void setRoleID(Integer roleID) {
		RoleID = roleID;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}

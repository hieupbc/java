package com.qlbckh.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the NguoiSuDung database table.
 *
 */
@Entity
@NamedQuery(name = "NguoiSuDung.findAll", query = "SELECT n FROM NguoiSuDung n")
public class NguoiSuDung implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private String userID;

	private String password;

	// bi-directional many-to-one association to QuyenHan
	@ManyToOne
	@JoinColumn(name = "QuyenHan")
	private QuyenHan quyenHanBean;

	public NguoiSuDung() {
	}

	public NguoiSuDung(String username, String password) {
		// TODO Auto-generated constructor stub
		this.userID = username;
		this.password = password;
	}

	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public QuyenHan getQuyenHanBean() {
		return this.quyenHanBean;
	}

	public void setQuyenHanBean(QuyenHan quyenHanBean) {
		this.quyenHanBean = quyenHanBean;
	}

}
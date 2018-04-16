package com.qlbckh.dto;

/**
 * @author tronghieuhoang
 *
 */
public class NguoiSuDungDTO {

	private String password;
	private String quyenHan;
	private String userID;

	public NguoiSuDungDTO() {
		// TODO Auto-generated constructor stub
	}

	public NguoiSuDungDTO(String userID, String password, String quyenHan) {
		this.userID = userID;
		this.password = password;
		this.quyenHan = quyenHan;
	}

	public String getPassword() {
		return password;
	}

	public String getQuyenHan() {
		return quyenHan;
	}

	public String getUserID() {
		return userID;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setQuyenHan(String quyenHan) {
		this.quyenHan = quyenHan;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "NguoiSuDungDTO [userID=" + userID + ", password=" + password + ", quyenHan=" + quyenHan + "]";
	}

}

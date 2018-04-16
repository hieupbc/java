package com.qlbckh.dto;

public class BaocaoDTO {

	private int baoCaoID;
	private String tenBaoCao;

	private String theLoaiBaoCao;
	private String duongDan;
	private String ngayHoanThanh;

	private String linhVuc;

	public BaocaoDTO() {
		// TODO Auto-generated constructor stub
	}

	public BaocaoDTO(int iDBaoCao, String tenBaoCao, String theLoaiBaoCao, String duongDan, String ngayHoanThanh,
			String linhVuc) {
		baoCaoID = iDBaoCao;
		this.tenBaoCao = tenBaoCao;
		this.theLoaiBaoCao = theLoaiBaoCao;
		this.duongDan = duongDan;
		this.ngayHoanThanh = ngayHoanThanh;
		this.linhVuc = linhVuc;
	}

	public int getBaoCaoID() {
		return baoCaoID;
	}

	public void setIDBaoCao(int iDBaoCao) {
		baoCaoID = iDBaoCao;
	}

	public String getTenBaoCao() {
		return tenBaoCao;
	}

	public void setTenBaoCao(String tenBaoCao) {
		tenBaoCao = tenBaoCao;
	}

	public String getTheLoaiBaoCao() {
		return theLoaiBaoCao;
	}

	public void setTheLoaiBaoCao(String theLoaiBaoCao) {
		theLoaiBaoCao = theLoaiBaoCao;
	}

	public String getDuongDan() {
		return duongDan;
	}

	public void setDuongDan(String duongDan) {
		duongDan = duongDan;
	}

	public String getNgayHoanThanh() {
		return ngayHoanThanh;
	}

	public void setNgayHoanThanh(String ngayHoanThanh) {
		ngayHoanThanh = ngayHoanThanh;
	}

	public String getLinhVuc() {
		return linhVuc;
	}

	public void setLinhVuc(String linhVuc) {
		linhVuc = linhVuc;
	}

}

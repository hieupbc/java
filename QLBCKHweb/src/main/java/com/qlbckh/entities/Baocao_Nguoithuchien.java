package com.qlbckh.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the Baocao_Nguoithuchien database table.
 *
 */
@Entity
@NamedQuery(name = "Baocao_Nguoithuchien.findAll", query = "SELECT b FROM Baocao_Nguoithuchien b")
public class Baocao_Nguoithuchien implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Baocao_NguoithuchienPK id;

	// bi-directional many-to-one association to NhaKhoaHoc
	@ManyToOne
	@JoinColumn(name = "IDNguoiThucHien", updatable = false, insertable = false)
	private NhaKhoaHoc nhaKhoaHoc;

	// bi-directional many-to-one association to VaiTro
	@ManyToOne
	@JoinColumn(name = "VaiTro")
	private VaiTro vaiTroBean;

	public Baocao_Nguoithuchien() {
	}

	public Baocao_NguoithuchienPK getId() {
		return this.id;
	}

	public void setId(Baocao_NguoithuchienPK id) {
		this.id = id;
	}

	public NhaKhoaHoc getNhaKhoaHoc() {
		return this.nhaKhoaHoc;
	}

	public void setNhaKhoaHoc(NhaKhoaHoc nhaKhoaHoc) {
		this.nhaKhoaHoc = nhaKhoaHoc;
	}

	public VaiTro getVaiTroBean() {
		return this.vaiTroBean;
	}

	public void setVaiTroBean(VaiTro vaiTroBean) {
		this.vaiTroBean = vaiTroBean;
	}

}
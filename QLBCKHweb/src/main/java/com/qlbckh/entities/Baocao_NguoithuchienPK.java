package com.qlbckh.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the Baocao_Nguoithuchien database table.
 *
 */
@Embeddable
public class Baocao_NguoithuchienPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column
	private int IDBaoCao;

	@Column
	private int IDNguoiThucHien;

	public Baocao_NguoithuchienPK() {
	}

	public int getIDBaoCao() {
		return this.IDBaoCao;
	}

	public void setIDBaoCao(int IDBaoCao) {
		this.IDBaoCao = IDBaoCao;
	}

	public int getIDNguoiThucHien() {
		return this.IDNguoiThucHien;
	}

	public void setIDNguoiThucHien(int IDNguoiThucHien) {
		this.IDNguoiThucHien = IDNguoiThucHien;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Baocao_NguoithuchienPK)) {
			return false;
		}
		Baocao_NguoithuchienPK castOther = (Baocao_NguoithuchienPK) other;
		return (this.IDBaoCao == castOther.IDBaoCao) && (this.IDNguoiThucHien == castOther.IDNguoiThucHien);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.IDBaoCao;
		hash = hash * prime + this.IDNguoiThucHien;

		return hash;
	}
}
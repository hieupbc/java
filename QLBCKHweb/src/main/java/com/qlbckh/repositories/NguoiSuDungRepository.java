package com.qlbckh.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qlbckh.entities.NguoiSuDung;

@Repository
public interface NguoiSuDungRepository extends CrudRepository<NguoiSuDung, String> {

}

package com.sai.BankRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sai.Entity.HDFCBank;
@Repository
public interface BankRepository extends CrudRepository<HDFCBank, Long> {

}

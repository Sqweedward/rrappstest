package com.rrapps.testproject.repository;

import com.rrapps.testproject.entity.AccountEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository {
    List<AccountEntity> findAll();
    List<AccountEntity> findByClientId(int idClient);
}

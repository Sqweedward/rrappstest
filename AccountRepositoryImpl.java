package com.rrapps.testproject.repository;

import com.rrapps.testproject.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountRepositoryImpl implements AccountRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedJdbcTemplate;


    @Override
    public List<AccountEntity> findAll() {
        return null;
    }

    @Override
    public List<AccountEntity> findByClientId(int idClient) {
        return  namedJdbcTemplate.query("exec GetAccountsByClientId :idClient", new MapSqlParameterSource(
                        "idClient", idClient), BeanPropertyRowMapper.newInstance(AccountEntity.class)
                );
    }
}

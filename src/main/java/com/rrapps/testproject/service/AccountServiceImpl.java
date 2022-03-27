package com.rrapps.testproject.service;

import com.rrapps.testproject.dto.AccountDTO;
import com.rrapps.testproject.entity.AccountEntity;
import com.rrapps.testproject.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("Account")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public ResponseEntity getAccountsByClientId(int idClient) {
        try {
            List<AccountDTO> accounts = accountRepository.findByClientId(idClient).stream().map(this::convertAccountEntityToDTO).collect(Collectors.toList());
            return new ResponseEntity(accounts, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    private AccountDTO convertAccountEntityToDTO(AccountEntity account) {
        return new AccountDTO(account.getId(), account.getNum(), account.getVkd(), account.getBalance(), account.getLastOperDate());
    }
}

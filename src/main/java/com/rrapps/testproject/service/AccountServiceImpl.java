package com.rrapps.testproject.service;

import com.rrapps.testproject.dto.AccountDTO;
import com.rrapps.testproject.entity.AccountEntity;
import com.rrapps.testproject.repository.AccountRepository;
import com.rrapps.testproject.utils.exceptions.UniversalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service("Account")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<AccountDTO> getAccountsByClientId(int idClient) throws Exception {
        List<AccountDTO> accounts = new ArrayList<AccountDTO>();
        try {
            accounts = accountRepository.findByClientId(idClient).stream().map(this::convertAccountEntityToDTO).collect(Collectors.toList());
        } catch (Exception e) {
            throw new UniversalException("Internal Error", e.fillInStackTrace(), e.getLocalizedMessage());
        }
        return accounts;
    }
    private AccountDTO convertAccountEntityToDTO(AccountEntity account) {
        return new AccountDTO(account.getId(), account.getNum(), account.getVkd(), account.getBalance(), account.getLastOperDate());
    }
}

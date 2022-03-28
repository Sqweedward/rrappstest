package com.rrapps.testproject.service;

import com.rrapps.testproject.dto.AccountDTO;

import java.util.List;

public interface AccountService {

    List<AccountDTO> getAccountsByClientId(int idClient) throws Exception;
}

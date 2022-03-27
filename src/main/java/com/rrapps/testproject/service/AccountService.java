package com.rrapps.testproject.service;

import org.springframework.http.ResponseEntity;

public interface AccountService {

    ResponseEntity getAccountsByClientId(int idClient);
}

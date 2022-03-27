package com.rrapps.testproject.controller;

import com.rrapps.testproject.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;


    @RequestMapping(method= RequestMethod.GET, produces = "application/json")
    ResponseEntity getAccountByClientId(@RequestParam int idClient) {
        return accountService.getAccountsByClientId(idClient);
    }
}

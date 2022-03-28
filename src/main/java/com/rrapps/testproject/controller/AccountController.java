package com.rrapps.testproject.controller;

import com.rrapps.testproject.service.AccountService;
import com.rrapps.testproject.utils.exceptions.UniversalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        try {
            return new ResponseEntity(accountService.getAccountsByClientId(idClient), HttpStatus.OK);
        }
        catch (UniversalException e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

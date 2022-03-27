package com.rrapps.testproject.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AccountEntity {

    private Long id;
    private Long idClient;
    private BigDecimal num;
    private Integer vkd;
    private BigDecimal balance;
    private Date lastOperDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public Integer getVkd() {
        return vkd;
    }

    public void setVkd(Integer vkd) {
        this.vkd = vkd;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getLastOperDate() {
        return lastOperDate;
    }

    public void setLastOperDate(Date lastOperDate) {
        this.lastOperDate = lastOperDate;
    }
}

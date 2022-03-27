package com.rrapps.testproject.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String num;
    private Integer vkd;
    private BigDecimal balance;
    private String lastOperDate;

    public AccountDTO() {
    }

    public AccountDTO(Long id, BigDecimal num, Integer vkd, BigDecimal balance, Date lastOperDate) {
        this.id = id;
        this.num = num.toString();
        this.vkd = vkd;
        this.balance = balance;
        try {
            this.lastOperDate = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss").format(lastOperDate);
        }
        catch (Exception e) {
            this.lastOperDate = null;
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getLastOperDate() {
        return lastOperDate;
    }

    public void setLastOperDate(String lastOperDate) {
        this.lastOperDate = lastOperDate;
    }
}

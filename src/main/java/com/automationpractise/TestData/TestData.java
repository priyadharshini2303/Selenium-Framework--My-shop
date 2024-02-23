package com.automationpractise.TestData;

import com.creditdatamw.zerocell.annotation.Column;

public class TestData {
    @Column(name = "UserName",index = 0)
    public String Username;
    @Column(name = "Password",index = 1)
    public String password;
}

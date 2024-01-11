package com.teranet.rps.training;

public enum CalcCompany {
    CASIO("casio",1946,"Shibuya, Tokyo, Japan"),
    TEXAS("Texas Instruments",1930,"Dallas, Texas, US")
    ;
    private final String companyName;
    private final long establishedYear;
    private final String headquaters;

    CalcCompany(String companyName, long establishedYear, String headquaters) {
        this.companyName = companyName;
        this.establishedYear = establishedYear;
        this.headquaters = headquaters;
    }
}

package com.teranet.rps.training;

import java.util.function.DoublePredicate;

public class MyWorker {
    void doWorkOnMonday(){
        Doer teraMen = new Doer();
        teraMen.enteringOfficeAfterCovidScreening();
        //Deprecated Method
    }
    void doWorkOnMonday(long id){
        Doer teraMen = new Doer();
        teraMen.enteringOfficeWithAnIdCard();
    }


}

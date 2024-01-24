package com.teranet.rps.training.legal;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Map;

public class LegalStudyReport {
    private final PrintStream printStream;
    private final LegalResearch legalResearchAnalyser;

    public LegalStudyReport(PrintStream printStream, LegalResearch legalResearchAnalyser) {
        this.printStream = printStream;
        this.legalResearchAnalyser = legalResearchAnalyser;
    }
    public void showReport(){
        printStream.printf("\nLegal Report generated on:%s\n%n", LocalDate.now());
        printTable("Cases by Court",legalResearchAnalyser.getCourtNames());
        printTable("Cases by Judges",legalResearchAnalyser.getCourtNames());
    }
    private void printTable(String title, Map<String,Long> values){
        printStream.printf("---------------%s---------------",title);
        printRow(title,"Values");
        values.forEach(
                (key,value)->printRow(key,""+value)
        );
        printStream.println();
        printStream.println();
    }
    private void printRow(String firstValue, String secondValue){
        printStream.printf("- %-15s - %6.6s -%n",firstValue,secondValue);
    }
}

package com.teranet.rps.training.legal;

import java.io.PrintStream;

public class LegalReportRunner {
    public static void main(String[] args) {
        run(args,System.out);

    }
    public static void run(String[] args, PrintStream printStream){
        String fileLocation = args[0];
        ClientDatabase clientDatabase = new ClientDatabase(fileLocation);
        LegalResearch legalResearch = new LegalResearch(clientDatabase);
        LegalStudyReport legalReport = new LegalStudyReport(printStream,legalResearch);
        legalReport.showReport();
    }
}

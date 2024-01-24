package com.teranet.rps.training.legal;

public class Paralegal {
    public static void main(String[] args) {
        if(args.length<1){
            System.err.println("Use a commandline argument to specify the target file for analysis.");
            System.exit(-1);
        }
        ClientDatabase clientDatabase = new ClientDatabase(args[0]);
        clientDatabase.setError(System.err);

        LegalResearch my2024LegalAssignment = new LegalResearch(clientDatabase);
        LegalStudyReport myReport = new LegalStudyReport(System.out,my2024LegalAssignment);
        myReport.showReport();

    }
}

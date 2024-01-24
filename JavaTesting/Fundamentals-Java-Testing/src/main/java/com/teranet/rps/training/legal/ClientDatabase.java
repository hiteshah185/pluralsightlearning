package com.teranet.rps.training.legal;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ClientDatabase implements LegalRepo{
    private final String fileLocation;
    private PrintStream error;
    private List<CaseIntake> cases;

    public ClientDatabase(String fileLocation) {
        this.fileLocation = fileLocation;
        error = System.out;
    }

    public void setError(PrintStream error) {
        this.error = error;
    }

    @Override
    public List<CaseIntake> loadCases() {
        if(cases==null){
            cases = new ArrayList<>();
            final File file = new File(fileLocation);
            if(!file.exists() || !file.canRead() || !file.isFile()){
                System.err.println("Cannot Find readable File:"+file.getAbsolutePath());
            }
            try(CSVReader reader = new CSVReader(new FileReader(fileLocation))) {
                String[] nextLine;
                while((nextLine=reader.readNext())!=null){
                  Integer caseId = parseInt(nextLine[0].trim());
                  String caseName = nextLine[1].trim();
                  String court = nextLine[2].trim();
                  String judge = nextLine[3].trim();
                  String clientName = nextLine[4].trim();
                  String defendant = nextLine[5].trim();
                  cases.add(new CaseIntake(caseId,caseName,court,judge,clientName,defendant));
                }
                return cases;
            }catch (CsvValidationException | IOException e){
                e.printStackTrace();
                return null;
            }
        }
        return cases;
    }
}

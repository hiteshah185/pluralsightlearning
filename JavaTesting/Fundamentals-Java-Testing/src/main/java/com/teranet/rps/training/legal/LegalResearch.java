package com.teranet.rps.training.legal;

import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class LegalResearch {
    private final ClientDatabase repo;

    public LegalResearch(ClientDatabase repo) {
        this.repo = repo;
    }
    public Map<String,Long> getCourtNames(){
        return getCasesBy(CaseIntake::getCourt);
    }
    public Map<String,Long> getJudgeNames(){
        return getCasesBy(CaseIntake::getJudge);
    }
    private Map<String,Long> getCasesBy(Function<CaseIntake,String> classifier){
        return repo.loadCases()
                .stream()
                .collect(groupingBy(classifier,counting()));
    }
}

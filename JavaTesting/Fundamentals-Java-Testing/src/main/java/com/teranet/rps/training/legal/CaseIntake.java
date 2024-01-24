package com.teranet.rps.training.legal;

public class CaseIntake {
    private final int caseId;
    private final String caseName;
    private final String court;
    private final String judge;
    private final String clientName;
    private final String defendant;

    public CaseIntake(int caseId, String caseName, String court, String judge, String clientName, String defendant) {
        this.caseId = caseId;
        this.caseName = caseName;
        this.court = court;
        this.judge = judge;
        this.clientName = clientName;
        this.defendant = defendant;
    }

    public int getCaseId() {
        return caseId;
    }

    public String getCaseName() {
        return caseName;
    }

    public String getCourt() {
        return court;
    }

    public String getJudge() {
        return judge;
    }

    public String getClientName() {
        return clientName;
    }

    public String getDefendant() {
        return defendant;
    }
}

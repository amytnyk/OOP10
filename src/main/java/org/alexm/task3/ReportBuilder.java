package org.alexm.task3;

public class ReportBuilder {
    private final Database db;
    public ReportBuilder(Database db) {
        this.db = db;
    }

    public String buildReport() {
        return "User data: " + db.receiveUserData() + ", statistic data: " + db.receiveStatisticData();
    }
}

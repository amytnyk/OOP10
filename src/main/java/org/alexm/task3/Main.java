package org.alexm.task3;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization authorization = new Authorization();
        if (authorization.authorize(db)) {
            ReportBuilder reportBuilder = new ReportBuilder(db);
            System.out.println(reportBuilder.buildReport());
        }
    }
}

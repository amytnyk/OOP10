package org.alexm.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReportBuilderTest {
    @Test
    void report() {
        Database db = new Database();
        Authorization authorization = new Authorization();
        assertTrue(authorization.authorize(db));
        ReportBuilder reportBuilder = new ReportBuilder(db);
        assertEquals(reportBuilder.buildReport(), "User data: hello, statistic data: hello2");
    }
}
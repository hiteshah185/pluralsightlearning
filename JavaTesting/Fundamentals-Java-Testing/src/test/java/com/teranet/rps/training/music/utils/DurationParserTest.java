package com.teranet.rps.training.music.utils;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

public class DurationParserTest {
    @Disabled("Avoided because of string parsing")
    @ParameterizedTest
    @CsvSource({"2 weeks, 14", "1 month, 30", "5 days, 5", "once, 1"})
    public void parseDurationWithValidUnitAndQuantity(String durationString, int expectedDays) {
        assertEquals(expectedDays, DurationParser.parseDays(durationString));
    }
}

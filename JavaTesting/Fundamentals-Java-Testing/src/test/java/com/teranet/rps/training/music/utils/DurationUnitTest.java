package com.teranet.rps.training.music.utils;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

public class DurationUnitTest {
    @Test
    @DisplayName("Unit by Singular String")
    public void matchUnitBySingularString() {
        assertSame(DurationUnit.WEEK, DurationUnit.getByTextValue("week"));
    }

    @Test
    @DisplayName("Plural String")
    public void matchUnitByPluralString() {
        assertSame(DurationUnit.WEEK, DurationUnit.getByTextValue("weeks"));
    }

    @Test
    @DisplayName("Null test")
    public void returnsNullForUnmatchedUnit() {
        assertNull(DurationUnit.getByTextValue("boop"));
    }

}

package com.teranet.rps.training.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordWrapTest {
    public static final int LINE_LENGTH = 6;
    @Test
    public void lineShouldWrapIfOverLineLength(){
        //Two wrapping points
        final String result = WordWrap.wrap("The modern India",LINE_LENGTH);
        assertEquals("The mo\ndern I\nndia",result);
    }
    @Test
    public void shortLinesNotWrapping(){
        //No wrapping points
        final String result= WordWrap.wrap("TRV",LINE_LENGTH);
        assertEquals("TRV",result);
    }

    @Test
    public void isMultipleWrappingPoints(){
        final String result = WordWrap.wrap("Emerald backwaters, spice-kissed air, beaches serenaded by Arabian whispers",LINE_LENGTH);
        assertEquals("Emeral\nd back\nwaters\n, spic\ne-kiss\ned air\n, beac\nhes se\nrenade\nd by A\nrabian\n whisp\ners",result);
    }

}

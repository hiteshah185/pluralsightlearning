package com.teranet.rps.training.music;

import org.junit.jupiter.api.*;

public class MusicLifeCycleTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll executed");
        printNationalAnthem();
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach executed------------->");
    }

    @Test
    void testOne() {
        System.out.println("Test one executed");
    }

    @Test
    void testTwo() {
        System.out.println("Test two executed");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach executed-------------xxx");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll executed");
    }
    static void printNationalAnthem() {
        System.out.println("Jana Gana Mana Adhinayaka Jaya He");
        System.out.println("Bharata Bhagya Vidhata");
        System.out.println("Punjab Sindh Gujarat Maratha");
        System.out.println("Dravid Utkala Banga");
        System.out.println("Vindhya Himachal Yamuna Ganga");
        System.out.println("Uchchhala Jaladhi Taranga");
        System.out.println("Tava Subha Name Jage");
        System.out.println("Tava Subha Ashisa Mange");
        System.out.println("Gahe Tava Jaya Gatha");
        System.out.println("Jana Gana Mangala Dayaka Jaya He");
        System.out.println("Bharata Bhagya Vidhata");
        System.out.println("Jaya He Jaya He Jaya He");
        System.out.println("Jaya Jaya Jaya Jaya He");
    }

}

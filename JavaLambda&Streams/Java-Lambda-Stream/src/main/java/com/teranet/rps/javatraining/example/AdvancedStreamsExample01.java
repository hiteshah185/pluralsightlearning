package com.teranet.rps.javatraining.example;

import java.math.BigInteger;
import java.util.UUID;
import java.util.stream.Stream;

public class AdvancedStreamsExample01 {
    public static void main(String[] args) {
        Stream<UUID> uuidStream = Stream.generate(UUID::randomUUID);
        uuidStream.limit(10).forEach(System.out::println);

        Stream<BigInteger> powerOfTwo = Stream.iterate(BigInteger.ONE, n->n.multiply(BigInteger.TWO));
        powerOfTwo.limit(20).forEach(System.out::println);

        Stream<Character> alphabet = Stream.iterate('A', letter -> letter <= 'Z', letter -> (char) (letter + 1));
        alphabet.forEach(System.out::print);

        System.out.println();
        Stream.Builder<String> builder = Stream.builder();
        builder.add("A");
        builder.add("Software");
        builder.add("Development");
        builder.add("Team");
        builder.add("@TRV");
        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }
}

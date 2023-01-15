package com.example.module11task4;

import java.util.stream.Stream;

public interface LinearCongruenceGenerator {
    Stream<Long> generateRandomStream(long a, long c, long m);
}

package com.example.module11task5;

import java.util.Iterator;
import java.util.stream.Stream;

public class StreamZipper {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Stream.Builder<T> builder = Stream.builder();

        Iterator<T> it1 = first.iterator();
        Iterator<T> it2 = second.iterator();

        while (it1.hasNext() && it2.hasNext()) {
            builder.add(it1.next());
            builder.add(it2.next());
        }

        return builder.build();
    }
}

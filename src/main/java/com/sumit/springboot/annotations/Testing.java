package com.sumit.springboot.annotations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Created by sumijaiswal on 3/3/17.
 */
public class Testing {
    public static void main(String args []) {
        final List<Long> listing = Arrays.asList(1l, 2l, 3l, 4l, 5l);
        //Arrays.asList(5l, 5l, 5l, 5l, 5l);
        //listing =
        Collections.sort(listing);
        System.out.println(listing.stream().filter(l -> !l.equals(listing.get(listing.size() - 1))).mapToLong(Long::longValue).sum() + " " +
                listing.stream().filter(l -> !l.equals(listing.get(0))).mapToLong(Long::longValue).sum());

        System.out.println(LongStream.range(0,listing.size()-1).map(i->listing.get((int)i)).sum() + " "+
                LongStream.range(1,listing.size()).map(i->listing.get((int)i)).sum());
    }
}

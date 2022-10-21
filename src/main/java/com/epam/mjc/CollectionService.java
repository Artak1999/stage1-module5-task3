package com.epam.mjc;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(integer -> integer % 2 == 0).toList();
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(String::toUpperCase).toList();
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Comparator.comparing(Integer::valueOf)).flatMap(Integer::describeConstable);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(List::stream).min(Integer::compare).flatMap(Integer::describeConstable);
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0,Integer::sum);
    }
}

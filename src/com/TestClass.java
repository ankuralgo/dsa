package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {

    public static void main(String[] args) {
        List<String> arr = Arrays.stream("A,B,B,B".split(",")).collect(Collectors.toList());
        arr.remove("B");
        System.out.println();

        arr.stream().forEach(System.out::println);
    }
}

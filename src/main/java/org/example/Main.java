package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String world = "world";
        System.out.println(StringUtils.prependIfMissing(world, "Hello, "));
        System.out.println(world);
    }
}
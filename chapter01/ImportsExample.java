// When using a wildcard in the import statement it is only applicable to classes
// It doesn't import subpackages
// The package java.lang is imported by default


import java.util.*;

public class ImportsExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
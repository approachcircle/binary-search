package net.approachcircle.demo;

public class Main {
    private static final String[] pets = {"ant", "bat", "cat", "dog", "elk", "fox", "rat"};
    public static void main(String[] args) {
        String target = "ant";
        if (BinarySearch.search(target, pets)) {
            System.out.printf("target '%s' found%n", target);
        } else {
            System.out.println("target not found");
        }
    }
}

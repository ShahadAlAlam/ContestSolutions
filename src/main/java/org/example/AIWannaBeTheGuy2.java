package org.example;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AIWannaBeTheGuy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> xLevels = new HashSet<>();
        Set<Integer> yLevels = new HashSet<>();

        int p = scanner.nextInt();
        for (int i = 0; i < p; i++) {
            xLevels.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            yLevels.add(scanner.nextInt());
        }

        Set<Integer> allPassableLevels = new HashSet<>(xLevels);
        allPassableLevels.addAll(yLevels);

        boolean canPassAllLevels = true;
        for (int i = 1; i <= n; i++) {
            if (!allPassableLevels.contains(i)) {
                canPassAllLevels = false;
                break;
            }
        }
        if (canPassAllLevels) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

        scanner.close();
    }
}


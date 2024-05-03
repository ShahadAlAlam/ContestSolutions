package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class CAntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        HashMap<String, Integer> valuesOfFaces = new HashMap<>();
        valuesOfFaces.put("Tetrahedron", 4);
        valuesOfFaces.put("Cube", 6);
        valuesOfFaces.put("Octahedron", 8);
        valuesOfFaces.put("Dodecahedron", 12);
        valuesOfFaces.put("Icosahedron", 20);
        int res = 0;
        for (int i = 0; i < n; i++) {
            String polyhedron = scanner.nextLine();
            res += valuesOfFaces.get(polyhedron);
        }
        System.out.println(res);
    }
}

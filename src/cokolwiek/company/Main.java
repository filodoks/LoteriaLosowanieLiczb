package cokolwiek.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ile liczb musisz wylosowac?");
        int k = in.nextInt();

        System.out.println("Jaka jest najwieksza liczba?");
        int n = in.nextInt();

        // zapelnienie tablicy liczbami 1 2 3 ... n

        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = 1 + i;

        // losowanie k liczb i zapisanie ich w drugiej tablicy

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            // losowanie indeksu z zakresu od 0 do n-1
            int r = (int) (Math.random() * n);

            // pobranie elementu z losowej lokalizacji
            result[i] = numbers[r];

            // przeniesienie ostatniego elementu z losowej lokalizacji
            numbers[r] = numbers [n-1];
            n--;
        }
        // wydruk zapisanej tablicy
        Arrays.sort(result);
        System.out.println("Postaw na nastepujace liczby:");
        for (int r : result)
            System.out.println(r);
    }
}

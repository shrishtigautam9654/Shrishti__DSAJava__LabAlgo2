package javaLabAlgo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TravelersPaymentApproach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the currency denominations:");
        int size = scanner.nextInt();

        int[] denominations = new int[size];

        System.out.println("Enter the currency denominations value:");
        for (int i = 0; i < size; i++) {
            denominations[i] = scanner.nextInt();
        }

        System.out.println("Enter the amount you want to pay:");
        int amount = scanner.nextInt();

        Map<Integer, Integer> paymentApproach = new HashMap<>();

        for (int i = size - 1; i >= 0; i--) {
            int notes = amount / denominations[i];
            amount %= denominations[i];

            if (notes > 0) {
                paymentApproach.put(denominations[i], notes);
            }
        }

        System.out.println("Your payment approach in order to give the minimum number of notes will be:");
        for (Map.Entry<Integer, Integer> entry : paymentApproach.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        scanner.close();
    }
}

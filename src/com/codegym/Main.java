package com.codegym;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng");
        int size = scanner.nextInt();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập gia trị " + i);
            int value = scanner.nextInt();
            integerArrayList.add(value);
        }
        Collections.sort(integerArrayList);

        System.out.print("Mảng: ");
        integerArrayList.forEach(value -> System.out.print(value + "\t"));
        System.out.println();
        System.out.println("Nhập giá trị cần tìm");
        int value = scanner.nextInt();
        System.out.println(binarySearch(value, integerArrayList, 0, integerArrayList.size()-1));
    }

    public static int binarySearch(int value, ArrayList<Integer> list, int low, int high) {
        int mid = (low + high) / 2;
       if (high > low){
           if (value < list.get(mid)) {
               high = mid - 1;
               return binarySearch(value, list, low, high);
           } else if (value == list.get(mid)) {
               return mid;
           } else {
               low = mid + 1;
               return binarySearch(value, list, low, high);
           }
       }
       return -1;
    }
}

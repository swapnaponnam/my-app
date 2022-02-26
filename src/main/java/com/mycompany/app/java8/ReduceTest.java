package com.mycompany.app.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceTest {
    //In Java 8, the Stream.reduce() combine elements of a stream and produces a single value.

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 1st argument, init value = 0
        int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);

        System.out.println("sum : " + sum); // 55
        int sum1 = Arrays.stream(numbers).reduce(0, Integer::sum); // 55


        int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);  // 10
        int max1 = Arrays.stream(numbers).reduce(0, Integer::max);            // 10

        int min = Arrays.stream(numbers).reduce(0, (a, b) -> a < b ? a : b);  // 0
        int min1 = Arrays.stream(numbers).reduce(0, Integer::min);


        Customer c1 = new Customer("swapna","New",1234);
        Customer c2 = new Customer("Test","Regular",2323);
        Customer c3 = new Customer("Dummy","Regular",2345);
        List<Customer> customerList = new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.stream().reduce((0,(x1,x2)->x1.customerId+ x2.customerId))
    }
}
class Customer{
    String name;
    String cutomerType;
    Integer customerId;
    public Customer(String name, String cutomerType,Integer customerId){
        this.name=name;
        this.customerId=customerId;
        this.cutomerType= cutomerType;
    }
}
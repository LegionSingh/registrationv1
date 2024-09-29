package com.api;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A {
    public static void main(String[] args) {

        //even no.
//        List<Integer> data = Arrays.asList(10, 20, 30, 40, 24, 32, 36, 59, 13, 14, 11);
//        List<Integer> newData = data.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//        System.out.println(newData);

        //odd no.
//        List<Integer> mydata = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19);
//        List<Integer> myNewData = mydata.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
//        System.out.println(myNewData);

        //starts with a
//        List<String> data = Arrays.asList("swaraj", "arya", "atish", "raj", "nobita");
//        List<String> newData = data.stream().filter(n -> n.startsWith("a")).collect(Collectors.toList());
//        System.out.println(newData);

        //funtional interface
//        Function<String, Integer> x = s -> s.length();
//        Integer val = x.apply("swaraj");
//        System.out.println(val);

//        Function<Integer, Integer> x = s -> s*s;
//        Integer val = x.apply(25);
//        System.out.println(val);

        //print the square of an array
//        List<Integer> data = Arrays.asList(10, 20, 30, 40, 50, 60, 70);
//        List<Integer> newData = data.stream().map(x -> x * x).collect(Collectors.toList());
//        System.out.println(newData);

        //add 5 to each no. of an array
//        List<Integer> data = Arrays.asList(1, 25, 32, 12, 20, 10);
//        List<Integer> newData = data.stream().map(x -> x + 5).collect(Collectors.toList());
//        System.out.println(newData);

        //convert a list of an array into uppercase
//        List<String> data = Arrays.asList("swaraj", "arya", "kajal", "abhishek", "komal");
//        List<String> newData = data.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newData);

        //CONVERT A LIST OF AN ARRAY INTO LOWERCASE
//        List<String> data = Arrays.asList("NAAM", "KAAM", "SHAAM", "DAAM", "JHAAM");
//        List<String> newData = data.stream().map(x -> x.toLowerCase()).collect(Collectors.toList());
//        System.out.println(newData);

        //sort a list of an array
//        List<String> data = Arrays.asList("arya", "zebra", "girrafe", "mango", "xtreme");
//        List<String> newData = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newData);

        //remove the duplicate element from a list of an array
//        List<String> data = Arrays.asList("dog", "cat", "piegon", "crow", "bull", "cow", "dog", "cat");
//        List<String> newData = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newData);

        //show those name which have less than 4 letters from the list
//        List<String> data = Arrays.asList("doremon", "pokemon", "lalaboy", "kishan", "sam", "tim");
//        List<String> newData = data.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
//        System.out.println(newData);

//        List<Employee> employees = Arrays.asList(
//                new Employee(1, "mike"),
//                new Employee(2, "stallin"),
//                new Employee(3, "adam")
//        );
//
//        List<EmployeeDto> dtos = employees.stream().map(e -> mapToDto(e)).collect(Collectors.toList());
//
//
//    }
//    static EmployeeDto mapToDto(Employee employee){
//        EmployeeDto dto = new EmployeeDto();
//        dto.setId(employee.getId());
//        dto.setName(employee.getName());
//
//        return dto;
//    }
        List<Employee> data = Arrays.asList(
                new Employee(1, "swaraj", 25000),
                new Employee(2, "mona", 12000),
                new Employee(3, "karan", 11000)
        );

        Optional<Employee> newData = data.stream().min(Comparator.comparing(Employee::getSal));
        newData.ifPresent(emp -> {
            System.out.println(emp.getName());
            System.out.println(emp.getSal());
        } );



    }

}

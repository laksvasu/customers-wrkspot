package org.example;

import org.example.entity.Address;
import org.example.entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Class Main - To check names containing only in ListA, only in ListB, In both ListA and ListB
 */
public class Main {
    public static void main(String[] args) {

        List<Customer> customersA = new ArrayList<>();
        List<Customer> customersB = new ArrayList<>();

        //Gets the Input values for list A and list B
        fetchInput(customersA, customersB);

        //Customers only in List A
        List<String> customerNamesInA = customersA.stream().map(customer -> customer.getFirstName() +" " + customer.getLastName()).collect(Collectors.toList());
        System.out.println("Customers in List A : "+ customerNamesInA);

        //Ouput: Customers in List A : [Gokul Raman, Siva Krishnan]



        //Customers only in List B
        List<String> customerNamesInB = customersB.stream().map(customer -> customer.getFirstName() +" " + customer.getLastName()).collect(Collectors.toList());
        System.out.println("Customers in List B : "+ customerNamesInB);

        //Ouput: Customers in List B : [Akshay Vignesh, Siva Krishnan]



        //Customers in both A and B(Only Unique List)
        List<String> customerNamesInBoth = Stream.concat(customersA.stream(),customersB.stream()).map(customer -> customer.getFirstName() +" " + customer.getLastName()).distinct().collect(Collectors.toList());
                customersB.stream().map(customer -> customer.getFirstName() +" " + customer.getLastName()).collect(Collectors.toList());
        System.out.println("Unique Customers in Both List A and B : "+ customerNamesInBoth);

        //Ouput: Unique Customers in Both List A and B : [Gokul Raman, Siva Krishnan, Akshay Vignesh]
    }

    private static void fetchInput(List<Customer> customersA, List<Customer> customersB) {
        Customer customer1 = new Customer();
        customer1.setFirstName("Gokul");
        customer1.setLastName("Raman");
        customer1.setMobileNumber("9876543210");
        customer1.setAge(30);
        Address address1 = new Address();
        address1.setAddress1("440,third main road");
        address1.setCity("Bangalore");
        address1.setState("Karnataka");
        address1.setCountry("India");
        customer1.setAddress(List.of(address1));
        customersA.add(customer1);

        Customer customer2 = new Customer();
        customer2.setFirstName("Siva");
        customer2.setLastName("Krishnan");
        customer2.setMobileNumber("987653232");
        customer2.setAge(34);
        Address address2 = new Address();
        address2.setAddress1("221,first main road");
        address2.setCity("Bangalore");
        address2.setState("Karnataka");
        address2.setCountry("India");
        customer2.setAddress(List.of(address2));
        customersA.add(customer2);

        Customer customer3 = new Customer();
        customer3.setFirstName("Akshay");
        customer3.setLastName("Vignesh");
        customer3.setMobileNumber("9892121132");
        customer3.setAge(34);
        Address address3 = new Address();
        address3.setAddress1("210,second main road");
        address3.setCity("Chennai");
        address3.setState("Tamilnadu");
        address3.setCountry("India");
        customer3.setAddress(List.of(address3));
        customersB.add(customer3);

        Customer customer4 = new Customer();
        customer4.setFirstName("Siva");
        customer4.setLastName("Krishnan");
        customer4.setMobileNumber("987653232");
        customer4.setAge(34);
        Address address4 = new Address();
        address4.setAddress1("221,first main road");
        address4.setCity("Bangalore");
        address4.setState("Karnataka");
        address4.setCountry("India");
        customer4.setAddress(List.of(address4));
        customersB.add(customer4);
    }
}
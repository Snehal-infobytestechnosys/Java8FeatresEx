import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class Main {



        @FunctionalInterface
                interface MathOperation{
            int apply(int a, int b);
        }

    public static void main(String[] args) {

            MathOperation add = (a, b) -> a + b;
            MathOperation multiply = (a, b) -> a * b;

            System.out.println("Addition : " +add.apply(5, 3));
        System.out.println("Multiplication : " +multiply.apply(5, 3));

        List<String> names = Arrays.asList("Snehal", "Puja", "Rahul", "Jay", "Shital");

        List<String> filteredNames = names.stream()
                .filter(name-> name.startsWith("S"))
                        .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Filtered and Uppercase Names :" +filteredNames);

        List<String> sordedNames = names.stream()
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());
        System.out.println("Sorted Names: " +sordedNames);

        Optional<String> opName = Optional.ofNullable("Snehal");
        System.out.println("Optional value: "+opName);

        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1999, 2, 26);
        Period age = Period.between(birthDate, today);
        System.out.println("Age" +age.getYears() + "years");

        interface MyInterface{
            default String getDefaultMessage(){
                return "default method !";
            }
        }


    }
}
package com.serhat.examples.java9;

public class Examples {
    public static void main(String[] args) {

        //Reduction - summary statistics
//        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
//                .summaryStatistics();
//        System.out.println(summary); // output : IntSummaryStatistics{count=7, sum=203, min=2, average=29.000000, max=88}

        // Reduction - sum
//        double total =
//                Stream.of(7.3, 1.5, 4.8) //0.0 is our starting point. a is our running total. b is the new element that we passing in(new element).
//                        .reduce(0.0, (Double a, Double b) -> a + b);
//        System.out.println("Total: " + total);

        //Stream rows from CSV file and store fields in HashMap
//        Stream<String> rows = Files.lines(Paths.get("temp2.txt"));
//        Map<String, Integer> map =
//                rows
//                .map(x -> x.split(","))
//                .filter(x -> x.length == 3)
//                .filter(x -> Integer.parseInt(x[1]) > 15)
//                .collect(Collectors.toMap(
//                        x -> x[0],
//                        x -> Integer.parseInt(x[1])
//                ));
//        rows.close();
//        for (String key : map.keySet()) {
//            System.out.println(key + " " + map.get(key));
//        }


//        //Stream rows from CSV file, parse data from rows
//        Stream<String> rows = Files.lines(Paths.get("temp2.txt"));
//        rows
//                .map(x -> x.split(",")) // split the string value to a string arrays by giving "," reg. ex.
//                .filter(x -> x.length == 3)    // get all the arrays which has size as 3
//                .filter(x -> Integer.parseInt(x[1]) > 15) // get second value of the array (which is an integer) and check if it is bigger than 15. if so, return all values which is bigger than 15.
//                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2])); // Print first, second and third element of the arrays which has second element bigger than 15.
//        rows.close();

        //Stream rows from CSV file and count
//        Stream<String> rows = Files.lines(Paths.get("temp2.txt"));
//        int rowCount =
//                (int)rows
//                .map(x -> x.split(",")) // split the string value to a string arrays by giving "," reg. ex.
//                .filter(x -> x.length == 3)   // Get each array and check its size.
//                .count(); // return how many arrays do we have which consists of 3 elements.
//        System.out.println(rowCount + " valid rows.");
//        rows.close();

        //Stream rows from text file and save to List
//        List<String> bands =
//                Files.lines(Paths.get("temp.txt"))
//                .filter(x -> x.contains("at"))
//                .collect(Collectors.toList());
//        bands.forEach(x -> System.out.println(x));


        //Stream rows from text file, sort, filter and print
//        Stream<String> bands = Files.lines(Paths.get("temp.txt"));
//        bands
//                .sorted()
//                .filter(x -> x.length() > 12)
//                .forEach(System.out::println);
//        bands.close();

//        List<String> people = Arrays.asList("Al", "Ankit", "Kadir", "Johanne", "Serhat", "Zuhal", "Christian", "Bakir", "Sami");
//        people
//                .stream()
//                .map(String::toLowerCase)
//                .filter(x -> x.startsWith("a"))
//                .forEach(System.out::println);

//        Arrays.stream(new int[] {2,4,6,8,10})
//                .map(x -> x*x)
//                .average()
//                .ifPresent(System.out::println);

//        String[] names = {"Al","Ankit","Kadir","Johanne","Serhat","Zuhal","Christian","Bakir","Sami"};
//        Arrays.stream(names)
//                .filter(x -> x.startsWith("S"))
//                .sorted()
//                .forEach(System.out::println);

//        Stream.of("Ava", "Serhat", "Ali")
//                .sorted()
//                .findFirst()
//                .ifPresent(System.out::println);

//        System.out.println(
//                IntStream
//                .range(1,10)
//                .sum()
//        );

        //temp.txt
        /*
        * Maroon 5
        Lady gaga
        Beatles
        Sia
        Avril Lavigne
        Miley Cyrus
        Serhat Ataman
        Brat Pitt
        * */

        //temp2.txt
        /*
        * A,12,3.7
        B,17,2.8
        C,23,2.7
        E
        F,18,3.4
        * */
    }
}

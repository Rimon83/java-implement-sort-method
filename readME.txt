Title: implementing type of sort methods on array of objects


====================================================================================

What the program does:

This program performs an experimental analysis on six sorting algorithms: Bubble sort, 
Selection sort, Insertion sort, Merge sort, Quick sort, and heap sort. This program 
accepts input as argument:
   -f indicates file name.
   -s indicates the sorting implementation to be used: 
       B for Bubble 
       I for insertion 
       S for Selection 
       M for Merge 
       Q for Quick 
       Z for Heap
   -t indecates property to be used in comparisons:     
       A for baseArea
       H for height
       V for Volume
This program also uses Comparator and Comparable interfaces to sort the objects. 

======================================================================================

How to run the program

There are two ways to run this progarm:
  * add arguments in main method:
    - right click on class that has main method and select "Run Configuration"
    -select "Arguments" and type arguments of any sort or any type you need to
     implement.
    - make sure to put space between arguments and (-) before each argument
      EX.
       -fres\polyfor1.txt -Tv -Sb 
    - run driver class 

  * use command line to run jar file.
    - there is JAR file name "sort.jar"
    - open command line and run  "sort.jar" with arguments in the same way 
      as mentioned above.
    - EX.
       java -jar Sort.jar -fres\polyfor1.txt -Tb -Sm

=====================================================================================
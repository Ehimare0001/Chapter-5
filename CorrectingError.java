5.9. Find and correct the error(s) in each of the following segments of code:
a) while (i = 1; i <= 10, i+)
System.out.println(i);

ANSWER
ERROR: i = 1 is incorrect inside the while condition.
CORRECTION: Initialize i before the loop:
int i = 1;

ERROR: The colon ; is incorrect.
CORRECTION: 
while only takes one condition:
while (i <= 10) 

THE CORRECTED CODE: 

public class Correction {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}



b) The following code should print whether an integer value is negative or zero:
switch (value) {
 Case value < 0:
 System.out.println("Negative");
 case 0:
 System.out.println("Zero");
 } 
 
 ANSWER
 i. Case must be lowercase case. 
 ii. break would normally be needed. 
 
 CORRECTED CODE
 public class NegativeZero{
  public static void main(String[]args){
 
 if (value < 0) {
    System.out.println("Negative");
} else if (value == 0) {
    System.out.println("Zero");
}
}
}

c) The following code should output the odd integers from 19 to 1:
for (int i = 19; i > 1; i =+ 1)
 System.out.println(i);
 
 ANSWER
 ERROR: i =+ 1 is incorrect.
 CORRECTION: i is to be decrease by 2 each time.
i -= 2


d) The following code should output the even integers from 1 to 50:
counter = 0;
do {
 System.out.println(counter + 1);
 counter += 2;
} while (counter <= 51);

ANSWER
counter = 0, should be int counter = 2.
The code should print even integers, so start at 2, not 0.

System.out.println(counter + 1) should be System.out.println(counter);
The condition counter <= 51 should be counter <= 50.

CORRECTED CODE
public class EvenNumbers{
  public static void main(String[]args){ }
  
 int counter = 2;

do {
    System.out.println(counter);
    counter += 2;
} while (counter <= 50); 
  
}


5.10. What does the following program do?
public class Counting {
 public static void main( String[] args ) {
 Scanner s = new Scanner(System.in);

 for (int i = 1; i < 3; i++) {
 for (int j = 1; j < 5; j++)
 System.out.print('*');
System.out.println("\n#####");

ANSWER

It prints 4 asterisks (*) and 5 hash symbols (#) twice.

Output:

****
#####

****
#####

Why?

The outer loop runs 2 times.
The inner loop prints * 4 times.
##### prints 5 # symbols after each group.






 

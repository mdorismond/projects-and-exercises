public class main {

    public static void main(String[] args) {

        // 0. Write a method to accept two integers  and check whether they are equal
        System.out.println("Step 0: parameters are equal:  " + acceptTwoIntegers(2,2));

        // 1. Write a method to check whether a given number is even or odd
        System.out.println("Step 1: value is even 1 :" + evenOrOdd(1));
        System.out.println("Step 1: value is even 2 :" + evenOrOdd(2));

        // 2. Write a method to check whether a given number is positive or negative
        System.out.println("Step 2: value is NegativeOrPositive 1 :" + NegativeOrPositive(1));
        System.out.println("Step 2: value is NegativeOrPositive -2 :" + NegativeOrPositive(-2));

        // 3. Write a method to find whether a given year is a leap year or not


        // 4. Write a method to read the age of a candidate and determine whether it is eligible for casting his/her own vote.
        int age = 18;
        System.out.println("Step 4: voting age " + age + " can Vote:" + canCandidateVote(age));
        age = 17;
        System.out.println("Step 4: voting age " + age + " can Vote:" + canCandidateVote(age));
        // 5. Write a method to find the largest of three numbers

        System.out.println("Step 5: Find Largest number 21,43,10: " + findLargest(21,43,10));


        // 6. Write a method to read the value of an integer m and display the value of n is 1
        //      when m is larger than 0, 0 when m is 0 and -1 when m is less than 0.

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates, 
	    and then divide the total number of rooms to be painted by the combined rate.
	    */

        // 1. Calculate the rate at which each painter can complete a room (rooms / hour),
        // 2. combine those rates,
        // 3.  then divide the total number of rooms to be painted by the combined rate.

        double bill = 1 / 2.15;
        double jill = 1/ 1.90;
        int roomsToBePainted = 5;


        System.out.println("Exercise 53: total time: " +   roomPaintTimes(jill, bill, roomsToBePainted));

         bill = 1 / 1.15;
         jill = 1/ 1.90;
         roomsToBePainted = 10;
        System.out.println("Exercise 53 part 2: total time: " +   roomPaintTimes(jill, bill, roomsToBePainted));


    }

    public static double roomPaintTimes(double painter1Time, double painter2Time, int numberOfRooms){
        double totalTime = 0.0;
        double totalRoomsPerHour = painter1Time + painter2Time;

        totalTime = numberOfRooms / totalRoomsPerHour;
        return totalTime;
    }
    public static boolean acceptTwoIntegers(int value1, int value2){
        boolean result = false;

        if (value1 == value2){
            result = true;
        }
        else {
            result= false;
        }
        return result;

    }

    public static boolean evenOrOdd(int value1){
        return (value1 % 2 == 0);
    }

    public static boolean NegativeOrPositive(int value1){
        return (value1 >= 0 );
    }

    public static boolean canCandidateVote(int age){
        int votingAge = 18;
        return (age >= votingAge);
    }

    public static int findLargest(int a, int b, int c){
        int result = 0;

        if ((a > b) && (a > c)) {
           result = a;
        }
        else if (b > a && b > c){
            result = b;
        }
        else {
            result = c;
        }

       return result;

       // return ((a > b) && (a > c)) ? a :  (b > a && b > c) ? b : c;
    }
}

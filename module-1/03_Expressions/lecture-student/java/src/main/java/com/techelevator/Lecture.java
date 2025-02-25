package com.techelevator;

public class Lecture {
    /*
    1. This method is named returnNotOne and it returns an int. Change
    it so that it returns something other than a 1.
    */
    public int returnNotOne() {
        return 10;
    }

    /*
    2. This method is named returnNotHalf and it returns a double. Change
    it so that it returns something other than a 0.5.
    */
    public double returnNotHalf() {
        return 0.7;
    }

    /*
    3. This method needs to return a String. Fix it to return a valid String.
    */
    public String returnName() {
        return "Jaclyn";
    }

    /*
    4. This method currently returns an int. Change it so that it returns a double.
    */
    public double returnDoubleOfTwo() {
        return 2;
    }

    /*
    5. This method should return the language that you're learning. Change
    it so that it does that.
    */
    public String returnNameOfLanguage() {
        return "Java";
    }

    /*
    6. This method uses an if statement to define what to return. Have it
    return true if the if statement passes.
    */
    public boolean returnTrueFromIf() {
        boolean result = false;
        if (true) {
            result = true;
        }

        return result;
    }

    /*
    7. This method uses an if to check to make sure that one is equal
    to one. Make sure it returns true when one equals one.
    */
    public boolean returnTrueWhenOneEqualsOne() {

            return (1==1);

    }

    /*
    8. This method checks a parameter passed to the method to see if it's
    greater than 5 and returns true if it is.
    */
    public boolean returnTrueWhenGreaterThanFive(int number) {
        if (number > 5) {
            return true;

        } else {

        }
        return false;
    }

    /*
    9. If you think about it, we really don't need the if statement above.
    How can we rewrite exercise 8 to have only one line of code?
    */
    public boolean returnTrueWhenGreaterThanFiveInOneLine(int number) {
        return (number > 5); // What can we put here that returns a boolean that we want?
    }

    /*
    10. This method will take a number and do the following things to it:
    * If addThree is true, we'll add three to that number
    * If addFive is true, we'll add five to that number
    * We'll then return the result
    */
    public int returnNumberAfterAddThreeAndAddFive(int number, boolean addThree, boolean addFive) {
        if (addThree) {
            number = number + 3;
        }

        // We can't use an else here. They could both be true, so we have to check each one.

        if (addFive) {
            number += 5;
        }

        return number;
    }

    /*
    11. Write an if statement that returns "Fizz" if the parameter is 3 and returns an empty String for anything else.
    */
    public String returnFizzIfThree(int number) {
        String result = "";
        if (number == 3) {
            result = "Fizz";
        }
        return result;
    }

    /*
    12. Now write the above using the Ternary operator ?:. If you're not sure what this is, you can Google it.
    */
    public String returnFizzIfThreeUsingTernary(int number) {
        return number == 3? "Fizz": "";
    }

    /*
    13. Write an if/else statement that returns "Fizz" if the parameter is 3, "Buzz" if the parameter is 5 and an empty String for anything else.
    */
    public String returnFizzOrBuzzOrNothing(int number) {


        if (number == 3) {
            return "Fizz";
        } else if (number == 5) {
            return "Buzz";
        } else {
            return "";
        }

    /*
    14. Write an if statement that checks if the parameter number is either equal to or greater than 18. Return "Adult" if it is or "Minor" if it's not.
    */
        public String returnAdultOrMinor ( int number){
            if (number >= 18) {
                return "Adult";
            } else {
                return "Minor";
            }
        }

    /*
    15. Now, do it again with a different boolean operation.
    */
        public String returnAdultOrMinorAgain ( int number){
            if (number > 17) {
                return "Adult";
            } else {
                return "Minor";
            }
        }

    /*
    16. Return as above, but also return "Teen" if the number is between 13 and 17 inclusive.
    */
        public String returnAdultOrMinorOrTeen ( int number){
            if (number >= 18) {
                return "Adult";
            } else if (number >= 13) {
                return "Teen";
            } else {
                return "Minor";
            }
        }

    /*
	 17. You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,
	 the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the
	 result is 10.
	 greenTicket(1, 2, 3) → 0
	 greenTicket(2, 2, 2) → 20
	 greenTicket(1, 1, 2) → 10
	 */
        public int greenTicket(int a, int b, int c){
            int winnings = 0;
            boolean allTheSame = (a == b && b == c);

            if (allTheSame) {
                winnings = 20;
            } else {
                boolean aMatchesB = (a == b);
                boolean bMatchesC = (b == c);
                boolean aMatchesC = (a == c);
                if (aMatchesB || bMatchesC || aMatchesC) {
                    winnings = 10;
                }
            }
            return winnings;
        }


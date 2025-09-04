//Nested if => it means an if statement inside another if
//example:

class Nested_if{
    public static void main(String args[])
    {
        int number = 15;

        if (number > 0) {   // outer if
            if (number % 2 == 0) {   // inner if
                System.out.println("Positive Even Number");
            } else {
                System.out.println("Positive Odd Number");
            }
        } else {
            System.out.println("Not Positive");
        }
    }
}

Output => Positive Odd Number

import java.util.Scanner;

public class CalculateG {

        public static double MULTIPLICATION(){
            Scanner MULTIPLICATION= new Scanner(System.in);
             int number1=11;
            int number2=11;
            int Multiplication;
          Multiplication=number1*number2;



// method for multiplication


            return 0;
        }
        // add 2 more methods for powering to square and summation (similar to multiplication)
        // method for square
        public static double square(){
            Scanner square= new Scanner(System.in);
            int width1=8;
            int width2=8;
int squarePower=width1*width2;



            return 0;
        }
        public static double summation(){
            Scanner Summation= new Scanner(System.in);
            int value1=3;
            int value2=3;
            int sum;
            sum=value1+value2;

            return 0;
        }
        public static void Outline() {

// method for printing out a result
            //multiplication Results of static values
            int number1=11;
            int number2=11;
            int Multiplication;
            Multiplication=number1*number2;
            //How to get Results of power Square values;
            int width1=8;
            int width2=8;
            int squarePower=width1*width2;
            //How to get the summation Results values from the Formulae
            int value1=3;
            int value2=3;
            int sum;
            sum=value1+value2;
            System.out.println("Multiplication after multiplying ''11'' is: "+number1*number2);
            System.out.println("Square value after powering ''8'' is: "+ width1*width2);
            System.out.println("Summation value after adding ''3'' is: "+ sum);




        }
        public static void main(String[] arguments) {
            double gravity = -9.81; // Earth's gravity in m/s^2
            int fallingTime = 30;
            double initialVelocity = 0.0;
            double finalVelocity;
            double initialPosition = 0.0;
            double finalPosition;
/*
a=gravity
t=fallingTime
v=finalVelocity
x=finalPosition
xi=initialPosition
vi=initialVelocity


    𝑥(𝑡) = 0.5 ∗𝑎𝑡2 + 𝑣𝑖𝑡 + 𝑥𝑖
        𝑣(𝑡) = 𝑎𝑡 + 𝑣𝑖
*/
// initialization

            finalPosition = ((0.5 * gravity * (fallingTime * fallingTime) + (initialVelocity * fallingTime) + initialPosition) / fallingTime);

            finalVelocity = ((gravity * fallingTime) + initialVelocity) / fallingTime;


// Add the formulas for position and velocity
            System.out.println("The object's position after; " + fallingTime + " seconds is "
                    + finalPosition + " m");
// Add output line for velocity (similar to position)
            System.out.println("The Velocity after" + fallingTime + "second is;" + finalVelocity + "m/s");

           MULTIPLICATION();
            square();
            summation();
            Outline();
        }

    }





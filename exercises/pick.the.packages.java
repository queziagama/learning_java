/*

# Objective: Pick the packages from the heaviest to the lightest one

# Rules

You work in an automated factory that controls a robotic arm to move packages. The arm can pick packages from the conveyour belts to form a  stack of packages.
The packages are sorted from the heaviest to lightest on each of the conveyor belts. 
Your objective is to pick the heaviest package among the 3 conveyor belts to move it on a stack.

# Implementation

Implement the method Solve(weight0, weight1, weight2) that thakes 3 integer argumentes: weight0, weight and weight2. 
These values represent the weight of the packages available on the conveyour belts with respective index 0, 1 and 2. 
When a conveyor belt is empty, the value is 0.

The method must return the index of the conveyor belt that has the heaviest package. 
For example, if the values for weight0, weight1 and weight2 are 85, 100 and 90, then the expected answer is 1.
In case of equality, any correct answer is accepted.

The method Solve(weight0, weight1, weight2) will be called successively until all the conveyor belts are empty. */

import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static int solve(int weight0, int weight1, int weight2) {
     {
        return weight0 > weight1
            ? weight0 > weight2
                ? 0 : 2
            : weight1 > weight2
                ? 1 : 2;
    }   
}
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int weight0 = in.nextInt();
            int weight1 = in.nextInt();
            int weight2 = in.nextInt();
            PrintStream outStream = System.out;
            System.setOut(System.err);
            int action = solve(weight0, weight1, weight2);
            System.setOut(outStream);
            System.out.println(action);
        }
    }
    // #endregion
}


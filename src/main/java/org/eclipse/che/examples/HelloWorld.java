/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Red Hat, Inc. All rights reserved.
 *  Licensed under the MIT License. See LICENSE in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        String student_a_name = "Mike";
        int student_a_age = 25;
        int student_a_credit_hours = 15;
        double rate_per_credit_hour = 550.75;

        double student_a_fees = student_a_credit_hours * rate_per_credit_hour;
        System.out.println("Student a's name is: " + student_a_name + " and he is " + student_a_age + ".");
        System.out.println("Student a's total cost of attendance is: $" + student_a_fees + ".");

        // Define another student 

        // What is inefficient here?

        // Solve the inefficiency below

    }
}

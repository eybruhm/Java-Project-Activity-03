Activity # 3 Instruction – Programming (Java) NCIII

Good day everyone !  Please follow the instructions for this activity.

1. Study the given Java coding pattern:

import java.util.Scanner;

public class SafeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");

        double num2 = input.nextDouble();

        double sum = num1 + num2;

        double difference = num1 - num2;

        double product = num1 * num2;

        System.out.println("Sum: " + sum);

        System.out.println("Difference: " + difference);

        System.out.println("Product: " + product);

        if (num2 == 0) {

            // If true, show an error message because division by zero is not allowed
            System.out.println("Quotient: Cannot divide by zero.");

        } else {

            // If the second number is not zero, perform the division
            double quotient = num1 / num2;

            System.out.println("Quotient: " + quotient);
        }

        input.close();
    }
}

Task Instructions:
1. Create a Java program that asks the user to input the following values:

----- PAYROLL INPUT -----
Enter Number of Days Worked: 22
Enter Rate per Day: 800
Enter Overtime Hours: 8
Enter Rate per Overtime Hour: 150
Enter Additional Allowance: 1000

2. After that, the program should ask the user to enter the following deductions:

----- DEDUCTIONS -----
Enter SSS/GSIS Contribution: 100
Enter Pagibig Contribution: 100
Enter PhilHealth Contribution: 100
Enter Cash Advance: 100
Enter Cash Bond: 100
Enter Other Deductions: 100

3. Your program should compute and display:

----- PAYROLL SUMMARY -----
Regular Income: 17600.00
Overtime Income: 1200.00
Gross Income: 19800.00
Withholding Tax: 1980.00
Total Deductions: 2580.00
Net Pay: 17220.00
Good! Net pay is within normal range.

4. Process to Follow in Your Program:

daysWorked * ratePerDay = regularIncome 

overtimeHours * overtimeRate = overtimeIncome 

regularIncome + overtimeIncome + allowance = grossIncome

grossIncome * 0.05 = withholdingTax

grossIncome * 0.10;  = withholdingTax

grossIncome * 0.15; = withholdingTax

sss + pagibig + philhealth + cashAdvance + cashBond + others + withholdingTax = totalDeductions

grossIncome - totalDeductions = netPay 

Condition 1 – Validate Input
If Number of Days Worked is less than 0, display:
"Invalid input! Days worked cannot be negative."

Useful code: After the prompt use 
return; 
to finish the process

Condition 2 – Tax Computation

Use conditional statements:

(1) grossIncome less than or equal to 10000
PROCESS: 5% tax

(2) grossIncome less than or equal to 20000
PROCESS: 10% tax

(3) PROCESS: 15% tax

Condition 3 – Net Pay Message

Display a message depending on the net pay result:

(1) netPay less than 0
PROMPT: "Warning: Deductions are greater than income."

(2) netPay less than 5000
PROMPT: "Note: Net pay is relatively low."

(3) PROMPT: "Good! Net pay is within normal range."

Submission Options:

1. Send the Programiz link of your code (just ping it to my Messenger), OR
2. Upload your .java file to GitHub and add xen0byt3 as a collaborator (recommended) OR
3. Create a pull request of this file (most recommended).

Make sure your program runs correctly and follows the conditions before submitting.

Good luck and happy coding! 
# MIDTERM ACT 4 – 1D Array 
### Java Programming 
 
 
## Create an application containing an array that stores 10 integers. The application should call five methods that in turn (1) display all the integers, (2) display all the integers in reverse order, (3) display the sum of the integers, (4) display all values less than a limiting argument, and (5) display all values that are higher than the calculated average value. Save the file as ArrayMethod.java. 
-	Create an array of 10 integers.
-	Create a loop that asks the user to enter 10 integers.
-	Ask user to enter a limiting value.
-	Create a loop that displays all the integers.
-	Create a loop that displays all the integers in reverse order. By initializing the counter to the Last Index through the decrementing loop.
-	Create a loop that calculates the sum of the integers by looping it and summing all the integers pass.
-	Create a loop that displays all values less than a limiting argument.
-	Create a loop that calculates the average value.
-	Create a loop that displays all values that are higher than the calculated average value.
                
## Write an application that accepts up to 10 Strings, or fewer if the user enters a terminating value. Divide the entered Strings into two lists—one for short Strings that are 10 characters or fewer and the other for long Strings. After data entry is complete, prompt the user to enter which type of String to display, and then output the correct list. For this exercise, you can assume that if the user does not request the list of short strings, the user wants the list of long strings. If there are no Strings in a requested list, output an appropriate message. Prompt the user continuously until a sentinel value is entered. Save the file as CategorizeStrings.java. 
 
-	initialize all the variables, Max, cutoff, when to quit, short, lo
-	Create a while loop that asks the user to enter a string. but only if the string is not equal to "ZZZ" and when reach the max, it will quit the loop
-	use if statement to check if the string is longer than the cutoff or shorter than the cutoff
-	then add the string to the appropriate array
-	if user exits or reaches the max
-	ask the use what output they want to see, short or long
-	then create a loop that displays the strings in the appropriate array


##	(Printing four patterns using loops) Use nested loops that print the following patterns in four separate programs: 
  
PATERN IV


-	create the first loop that iterates through the numbers 1 to 6, this iteration it decreases by 1
-	inside the loop, create a loop that iterates through the numbers 1 to 6 minus to the first current number, this iteration in increments of 1 then print a two spaces
-	inside the loop, create a second loop that iterates through 1 to first loop current number, it increases by 1 then print the number with a single space
-	after the looping of the first loop, print a new line

PATTERN III


-	create the first loop that iterates through the numbers 1 to 6, this iteration it increases by 1 
-	inside the loop, create a loop that iterates through the numbers 6 to 1, this iteration in decrements by 1 then print a number with a single space if the number is less than the current number
-	else print a two spaces
-	after the looping of the first loop, print a new line

PATTERN II


-	create the first loop that iterates through the numbers 6 to 1, this iteration it decreases by 1
-	inside the loop, create a loop that iterates through the numbers 1 to the first current number, this iteration in increments of 1 then print a  number with a space then print new line after the first loop

PATTERN I


-	create the first loop that iterates through the numbers 1 to 6, this iteration it increases by 1
-	inside the loop, create a loop that iterates 1 to 6 increasing by 1 then print a number with a single space 
-	after the looping of the first loop, print a new line  


##	Write a program that uses nested for loops to print a multiplication table, as shown in the following sample run: 
 
  
-	Create a loop that iterates through the numbers 1 to 9
-	Inside the loop, create a loop that iterates through the numbers 1 to 9
-	Inside the inner loop, multiply the two numbers and display the result
-	Display like a multiplication table by formatting the output to be nicely aligned using the String.format method
 	 
##	Write an application that displays the factorial for every integer value from 1 to 16. A factorial of a number is the product of that number multiplied by each positive integer lower than it. For example, 4 factorial is 4 * 3 * 2 * 1, or 24. Save the file as Factorials.java. 
-	Create a loop that displays the factorial for every integer value from 1 to 16.
-	Create a loop that calculates the factorial of a number by looping it and multiplying all the integers pass.
-	Create a loop that displays all values that are higher than the calculated average value.
 
##	Write an application that prompts a user for two integers and displays every integer between them. Display a message if there are no integers between the entered values. Make sure the program works regardless of which entered value is larger. Save the file as Inbetween.java. 
-	Create a Scanner object for user input such as the first and second integers
-	get the difference between the two integers and get the absolute value of the difference
-	find which is the larger integer and use that as the ending points and the smaller (with + 1) as starting point by using Min and Max methods 
-	if the difference is 0 or 1, display a message saying there are no integers between the two numbers
-	else print all the integers between the two numbers by using a for loop
 
##	The Huntington High School basketball team has five players named Art, Bob, Cal, Dan, and Eli. Accept the number of points scored by each player in a game and create a bar chart that illustrates the points scored, similar to the chart below. Save the file as BarChart.java. 
-	Create an array for name of players 
-	Create an array for the number of goals they scored
-	assign the values to the arrays by inputting the values from the user
-	the points index is corresponding to the name of player index
-	create a loop that multiplies the "*" by the number of points the player scored

# Learn Java Course

Inroduction to Java for biggeners

## Introduction About me and the matrial selection
- iterative approach building our knoledge incrementally
- focus on the used features and, learn what you need when you need
- Goal is to be familiar with java and be more comfortable using it
- understand when to use java when not to use it.


## How To Study?
- Set Goal
- Practice
- Take Feed back

- How To Do The Previous Steps
  - Parato principle:
  80% of effects comes form 20% of causes
  ex: 80% of wealth comes from 20% of population
  used to (Optimize our Decisions To Acheive the Max Results)

  - Spaced Repetion: (As Practicing Techinique)
  revise the material on regular time

- Use practicing apps:
  Code Gym   -> https://codegym.cc/
  hackerrank ->
  code wars  -> https://www.codewars.com/

- Ref sites:
  - https://geeksforgeeks.com/
  - https://docs.oracle.com/javase/tutorial/java/index.html
  
## Content
 - CH0 Programming Fundamentals
    - Algorithms and Computational Thinking "Every Thing Is A Number"
    - Programming Languages "From Algorithm to Code"
 - CH1 Our First Java Program
    - Data types
    - Operations on Data
    - Control Flow
    - Important classes
    - Projects
        - temperature converter
        - number guessing game
 
## CH1 Our First Java Program

Set up software
- installing JDK, IDE
- create a new project
- running our code
Notes:
- file name must be the same as class name
- every java program must have main method
- package and public will be discussed later

### Java Basics
- Variable Declaration (creating it)
- Variable Initialization (creating + adding initial value)

	- Primitive Data types
		are basic types and can be thought as building blocks of other types!
		integrals { byte, short, int, long }
		- Java uses twos complement as number representation to express _veand +ve numbers.
		floats{ float, double } // dont use for money or any precise calculation
		character // 16 bit utf-16 to support internationalization 
		boolean {true. false}

	- Reference Data types (Just inroduce String)
		they are initialized, and operated on differently
		String in daily use

	- literals !

	-- take a break

	- Mathematical Operations
		+, -, *, /, %
		++, --
		precedence

	- Assignment (change value of alreasy existing variable)
		=, +=, *=, /*

	- type conversion
		- widening  (automatic)
		- narrowing (manual)
		Type promotion occurs in arithmetic expressions, small intergrals are converted to
		the widest numeric type.

	-- take a break

	- boolean expressions
	- if else conditional flow
	- Comparison operators
		 <, >, <=, >= , ==, !=
	- Logical Operators
		and &&, or|| (short circuit operators)
		xor ^, not !

	- Ternary operator

	- switch statement
	
	-- take a break

	- for loops
		for (initialExpression; testExpression; updateExpression) {
    			// body of the loop
		}
	
	- while loop
		while(boolean expression){
			// body
		}
	- do while loop
	
	Recap
	- Key words learned
	- how to declare a variable
	- how to write if, and loops
	- how to use var key word 

	Useful links:
	 floating point: https://en.wikipedia.org/wiki/Floating-point_arithmetic
	
	Simple Project:
		Temprature converter
		Covert seconds to time(hour: minutes: seconds) 
		Print ASCII
		take username from input and print hello + name

		Number Guessing Game
		// generate random number
        	// ask user for input
        	// check if input is correct
        	// if its correct end game
        	// if not give him a hint too far or too high
        	// maximum number of attempts is 3
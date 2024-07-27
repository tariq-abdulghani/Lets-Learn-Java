

## Control Flow
motivation
```
// useful links https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html
// imagine adding 178 + 546
// we learned to do so

   [1]  [1]       
    1    7    8
    5    4    6   +
    ______________
              4
         2
    7 
    
//  so 178 + 456 = 724
// but for computers how to add big numbers?
// can we write the adding algorithm?

    take the first digits fo each numbers 
    add them if they exceed 10 put the reminder into d1
    and carry one
    
    take the next digits
    if there is a carry add one to their sum
    if the sum is > 10 then put the reminder  into d2
    and carry one
    
    do it again untill you finish them all
    
    the final  result is ......+d3*100 +d2*10 +d1

// What we did?

// defining varaibles to hold intermediate results
// and reusing them 
// we want to iterate every digit
// we also make a conditional 
// so these are the primary building blocks of any programming lanuguage
// remebere prgramming languages exited to make algorithms run.

Two important classes needed for today excercise
1- array
2- scanner
```
## How Does the Computer Represent Negative Numbers?
    Tow's Complement

## Arithmetic Operations
```
    // +, - , *, /, %
    // precedence  (), * /, + -
    // ++, --
    // +=, -=, *=, /=
```
## Comparison Operations
```
    // <, <, <=, >=, ==, !=
```
## Logical Operations [X]
```
    // &&, ||, ! 
```
### If Statement
```
    if(condition){
    
    }if else (condition 2){
    
    }else{
    
    }
```

### Switch Statement[X]
```
    switch(var){
        case: value1
        break;
        
        default:
        
    }
```

### For Loop
```
    for (initialExpression; testExpression; updateExpression) {
    // body of the loop
}
```
- The initialExpression initializes and/or declares variables and executes only once.
- The condition is evaluated. If the condition is true, the body of the for loop is executed.
- The updateExpression updates the value of initialExpression.
- The condition is evaluated again. The process continues until the condition is false.
practice :
- print numbers from 1 to 10
- print ascii from a to z
- calculate average value of an array
-  search for value in array
### While Loop
```
    while(condition){
     // do some thing
    }
```

### Do While
```
    do{ // something
    }while(condition)
```

```
buffer[0100101010110011010101001010111111111111010101010]
std input ;

Scanner 
acess the buffer and parse binary data
```
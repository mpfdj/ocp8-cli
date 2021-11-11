# Understanding Java Operators
- operator
- operand
- result

## Types of operators
- unary
- binary
- ternary

operator precedence

table on page 81/82

# Increment and decrement operators (page 84)
- pre-increment / pre-decrement, the new value is returned
- post-increment / post-increment, the original value is returned, the operator is applied after the value is returned

- division, 11 / 3 ==> 3
- modulus, 11 % 3 ==> 2  (rest na deling)


## Primitive numeric promotion (page 88)
important topic!!!

## Casting
- is required when converting to a smaller data type (not to a larger data type)
- by casting a larger value into a smaller data type, you are instructing the compiler to ignore its default behavior
- you are telling the compiler that you have taken additional steps to prevent overflow or underflow

## Comparing values
== returns true if 2 values represent the same value and when 2 values reference the same object

## Relational operators
a instanceof b Returns true if the reference that a points to is an instance of a class, subclass, or class that implements a particular interface as named in b

it is considered a good practise to use instanceof operator prior to casting from one object to a narrower type

the compound operator applies casting automaticallyr4
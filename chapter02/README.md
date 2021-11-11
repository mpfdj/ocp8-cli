# Creating objects

The purpose of a constructor is to initialize fields
The default constructor is created by the compiler when no constructor is specified

# Initializer blocks
- Code between braces is called a code block { ... }
- Instance initializer block
- Fields and initializer blocks run in the order they appear

# Understanding data types
Java applications contain 2 types of data:
- primitive types
- reference types

Java has 8 built-in data types (blz 40)
A primitive is just a single value in memory

Table with primitive types see blz 41

boolean     true or false
byte        8-bit           -128 to 127
short       16-bit
int         32-bit
long        64-bit          123L
float       32-bit          123.45f         floating-point value
double      64 bit          123.45          floating-point value
char        16-bit          'a'             Unicode value

short and char see page 42
- a short is signed so it can have positive and negative values
- a char is unsigned which means it can only have 0+ values
- a char can hold a higher positive number than a short
- a char can't hold any negative numbers

when a number is presented in code, it is called a literal

Java allows you to specify digits in several formats:
- Octal (0-7), uses a 0 as prefix, for example 017
- Hexadecimal (0-9 A-F), uses 0x as prefix, for example 0xFF
- Binary (0-1), uses 0b as prefix, for example 0b101

Identifiers (blz 46, 47):
- must begin with a letter, $ or a _
- can include numbers but not start with them
- single _ is not allowed

Declaring multiple variables blz 49

# Initializing variables blz 51
- differences between default values for local, instance and class variables
- local variables should be initialized by the programmer
- the compiler is only concerned if you try to USE uninitialized local variables
- it doesn't mind the ones you never use

# Variables
- local variable
- instance variable
- class variable, value is shared among all instances of the class

instance and class variables do not require to be initialized, they have a default value

# Default values (instance and class variables) blz 53
- boolean                   false
- byte, short, int, long    0
- float, double             0.0
- char                      '\u0000' (NUL)
- object reference          null

# var blz 58
- is only applicable to local variables, not used in constructor params, method params, instance vars or class vars
- local variable type inference
- for loops, lambda's, exceptions try-with-resources
- when using var, you tell the compiler to determine the type for you
- once defined the type can't change only the value
- when using var the variable has to be initialized on the same line
- var can't be used as class, interface or enum identifier
- but can be used as variable name


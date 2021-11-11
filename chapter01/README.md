Java Development Kit JDK
- javac (compiler) > bytecode > .class
- java (launcher) > JVM
- jar (archiver)
- javadoc

In Java 11, the JRE is no longer available as a stand-alone download (or as a subdirectory of the JDK)

Java key benefits
- object oriented (organization of code)
- encapsulation (access modifiers)
- platform independent (interpreted language, write once run everywhere)
- robust (garbage collection)
- secure (Java code runs inside a JVM. This creates a sandbox that makes it hard for Java code to do evil things to the computer it is running on.)
- multithreaded
- backward compatibility

# Understanding the Java class structure
- classes are the building blocks
- object is a runtime instance of a class in memory
- reference is a variable that points to an object

## Fields and methods
- members (fields and methods together)
- method signature (method name and parameter types)
- method declaration consists of additional information like return type

## Comments
// single line comment

/* multiple
* line comment
*/

/**
* Javadoc multiple line comment
* @author Miel de Jaeger
*/

# Packages
- PIC (Package Import Class)
- if the package starts with java. or javax it means it is shipped with the JDK
- imports using wildcards
- naming conflicts
- the package java.lang is imported by default

## Naming conflicts
- when a class is found in multiple packages, Java gives you a compiler error
- error: reference to Date is ambiguous
- if you explicitly import a class name, it takes precedence over any wildcard present (blz 17)

# Creating a JAR file
jar -cvf miel.jar .                       // Don't forget the .
jar --create --verbose --file miel.jar .
jar -cfv miel.jar -C classes .            // Specify a directory

java -cp miel.jar packageb.ClassB         // packageb.ClassB contains a main method

# Ordering elements in a class
- PIC (package, import, class)
// blz 21

// By default the javac command places the compiled class files in the same directory as the source code

// Using an alternate directory for your .class files
// javac -d classes packagea/ClassA.java packageb/ClassB.java

// You can use wildcards for including all .java files, wildcards are only applicable to .java files NOT subdirectories
// javac -d classes packagea/*.java packageb/*.java

// java -cp classes packagea.classB
// java -classpath classes packagea.classB
// java --class-path classes packagea.classB

// The package structure is preserved  under the requested target directory!!!

// Use wildcard to include all jar files in a directory
// packageb.ClassB is the main class
// java -cp miel.jar packageb.ClassB
// java -cp ".;c:\temp\directoryWithJars\*" packageb.ClassB

package packageb;

import packagea.ClassA;

public class ClassB {
    public static void main(String[] args) {
        ClassA a;
        System.out.println("Got it!");
    }
}
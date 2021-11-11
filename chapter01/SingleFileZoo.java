// In Java 11 you can run a program without compiling it first
// This is only applicable to single-file source-code programs
// java SingleFileZoo.java Cleveland  (don't forget to specify the .java postfix)
// Produces a .class file in memory not on disk!
// You can use single-file source-code programs when the program only depends on classes supplied by the JDK (import java.... or javax....) (blz 24)

public class SingleFileZoo {
    public static void main(String[] args){
        System.out.println("Single file: " + args[0]);
    }

}
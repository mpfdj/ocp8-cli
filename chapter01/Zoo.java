// javac Zoo.java  (result is bytecode .class file)
// java Zoo "San Diego" Zoo  (arguments containing whitespaces should use double quotes)

// String[] args
// String args[]
// String... args  varargs, variable argument list

public class Zoo {

    public static void main(String[] args){
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
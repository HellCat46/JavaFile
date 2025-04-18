import java.io.*;
import java.util.*;

class NoMatchException extends Exception {
    @Override
    public String toString() {
        return "The String is not \"India\"";
    }
}


class Program3
{
    public static void main(String[] args) throws NoMatchException {
        Scanner sc = new Scanner(System.in);

        String in = sc.next();

        if(!in.equals("India")) throw  new NoMatchException();

        System.out.println("Input String does say India");
    }
}
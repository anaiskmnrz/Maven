package dev;

/**
 * Hello world!
 *
 */
import com.github.lalyos.jfiglet.FigletFont;

public class App 
{
    public static void main( String[] args )
    {
    	String asciiArt = FigletFont.convertOneLine("hello");
        System.out.println(asciiArt);
    }
    
    
}

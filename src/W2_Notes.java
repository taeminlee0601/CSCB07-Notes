import W2.*;
import java.io.BufferedReader;
import java.io.FileReader;
public class W2_Notes {

	public static void change(Point q) {
		q.x += 1;
		q.y += 1;
	}

	public static void change(int num){
		num += 1;
	}

	public static void main(String [] args) throws Exception{
		Point p1 = new Point();
		System.out.println("x = " + p1.getX() + ", y= " + p1.getY()); //the default values will be printed

		change(p1); //this will change the contents of p1 as the type is non-primitive
		System.out.println("x = " + p1.getX() + ", y= " + p1.getY()); //the default values will be printed

		int n = 5;
		change(n); //this will not change the value of n as the type is primitive
		System.out.println("n = " + n);


		Point p2 = p1;
		p2.setX(100); //this will change the x of p1 as well given that p1 and p2 refer to the same object
		System.out.println("x = " + p1.getX());

		Point.displayCount(); //calling a static method using the class name
		p1.displayCount(); //calling a static method using an instance of the class

		//printing the contents of a file, line by line
		BufferedReader input = new BufferedReader(new FileReader("../myfile.txt"));
		String line = input.readLine();
		while(line != null) {
			System.out.println(line);
			line = input.readLine();
		}
	}
}



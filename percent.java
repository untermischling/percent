import java.util.Scanner;

public class percent{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int adj;
	int base;
	double percent;
	boolean isRunning = true;
	String p_query;

	while(isRunning){
	System.out.print("Enter your adjacent relative percenatage: ");
	adj = scanner.nextInt();
  catch()
	scanner.nextLine();
	System.out.print("Enter your base relative percenatage: ");
	base = scanner.nextInt();
	scanner.nextLine();

	percent = engine(adj, base);

	System.out.printf("The relative percentage is: %.1f%%%n", percent);
	System.out.print("do you want to continue? yes/no: ");
	p_query = scanner.nextLine().toLowerCase();
	if(p_query.equals("no")){
	isRunning = false;
	}
	else{
	isRunning = true;
	}
	}
	scanner.close();
	}
	public static double engine(int adj, int base){
	double percent = (double) adj / base * 100;
	return percent;
	}
}

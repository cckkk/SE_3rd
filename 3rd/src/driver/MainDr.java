package driver;

public class MainDr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		printGUGUDAN();
	}
	
	
	static void printGUGUDAN(){
		
		for(int i = 2; i < 10; i++){
			for(int j = 1; j < 10; j++){
				
				System.out.print(i + " * " + j + " = " + i*j + "  ");
			}
			System.out.println();
		}
		return ;
	}
}

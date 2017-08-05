package Xue;

public class XueWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1 ;
		while(i<10){
			System.out.println("i小于10，i等于"+i);
			i++;
		}
		
		
		i= 0;
		do{
			i++;
			System.out.println("i的值（dowhile）"+i);
		}while(i<10);
	}

}

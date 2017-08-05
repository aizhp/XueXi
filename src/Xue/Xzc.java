package Xue;
/**
 * 1-100  被3整除
 * @author Gcyyn
 *
 */
public class Xzc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xzc dy = new Xzc();
		c99();
		chu3();
		
	}
	
	public static void c99(){
		int num = 0;
		int i = 1;
		for(i = 1;i<=100;i++){
			num += i;
			
		}
		System.out.println(num);
		System.out.println(i);
	}
	public static void chu3(){
		int num= 0,i=1;
		while(i <= 100){
			if(i % 3 == 0){
				
				num++;
				
			}
			System.out.println("第几次："+num);
			System.out.println("被三整除得数"+i+" ");
//			if(num==50){
//				break;
//			}
			i++;
			
	}
	
	}
	
}

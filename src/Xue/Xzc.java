package Xue;
/**
 * 1-100  被3整除
 * @author Gcyyn
 *
 */
public class Xzc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 0,i=1;
		while(i <= 100){
			if(i % 3 == 0){
				System.out.println("被三整除得数"+i+" ");
				num++;
				System.out.println("第几次："+num);
			}
//			if(num==50){
//				break;
//			}
			i++;
			
		}
	}

}

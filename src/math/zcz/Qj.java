package math.zcz;

import java.util.Map;

/*T35J94*/
public class Qj {
	public static void cal(int t,int j){
		int ji,tu;
		for(ji=0; ji<t;ji++){
			tu=t-ji;
			int num=tu*4+ji*2;
			if(num == 94){
				System.out.println("ji"+ji+"tu"+tu);
			}
		}
	}
	public static void main(String[] args) {
		cal(35,94);
	}
}


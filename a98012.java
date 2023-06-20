import java.util.Scanner;

class Dates {
	String[] weeks = new String[7];
	public Dates(){
		weeks[0] = "Sun";
		weeks[1] = "Mon";
		weeks[2] = "Thu";
		weeks[3] = "Wed";
		weeks[4] = "Tus";
		weeks[5] = "Fri";
		weeks[6] = "Sat";
		
	}
	public String askDate(int day){
		if(day >=1 && day <=7)
			return weeks[day % 7];
		return "Wrong day";
	}
}
public class ch9_a98012_02 {

	public static void main(String[] argv) {
		Dates aDate = new Dates();
		System.out.println("請輸入星期幾?");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println(aDate.askDate(i));
		// TODO 自動產生的方法 Stub

	}

}
class IcCard{
	long id;
	int money;
	
	void showInfo(){
		System.out.print("卡片卡號"+id);
		System.out.print(",餘額"+money+"元");
		
	}
	
	Boolean add(int value){
		if(value>0&&value+money<=10000){
		money+=value;
		return true;
		}
		return false;
	}
	Boolean substract(int value){
		if(value>0&&money-value>=0){
			money-=value;
			return true;
			}
			return false;
		}
		
	}


public class ch8_A98C012_01 {

	public static void main(String[] args) {
		IcCard myCard=new IcCard();
		myCard.id=0x336789AB;
		myCard.money=0;
		
		System.out.println("加值300元"+
					(myCard.add(300)?"成功":"失敗"));
		myCard.showInfo();
		System.out.println("扣款109元"+
				(myCard.substract(109)?"成功":"失敗"));
		myCard.showInfo();
		System.out.println("扣款209元"+
			(myCard.substract(209)?"成功":"失敗"));
		myCard.showInfo();
		// TODO 自動產生的方法 Stub

	}

}

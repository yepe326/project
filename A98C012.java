class IcCard{
	long id;
	int money;
	
	void showInfo(){
		System.out.print("�d���d��"+id);
		System.out.print(",�l�B"+money+"��");
		
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
		
		System.out.println("�[��300��"+
					(myCard.add(300)?"���\":"����"));
		myCard.showInfo();
		System.out.println("����109��"+
				(myCard.substract(109)?"���\":"����"));
		myCard.showInfo();
		System.out.println("����209��"+
			(myCard.substract(209)?"���\":"����"));
		myCard.showInfo();
		// TODO �۰ʲ��ͪ���k Stub

	}

}

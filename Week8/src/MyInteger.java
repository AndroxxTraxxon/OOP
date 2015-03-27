
public class MyInteger {
	
	private int data;
	
	public MyInteger(int value){
		data = value;
	}
	
	public MyInteger(){
		data = 0;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public static boolean isEven(int num){
		return (num%2==0);	
	}
	
	public static boolean isEven(MyInteger num){
		return (num.getData()%2==0);	
	}
	
	public boolean isEven(){
		return (data%2==0);	
	}
	
	public static boolean isOdd(int num){
		return (num%2==1);
	}
	
	public static boolean isOdd(MyInteger num){
		return (num.getData()%2==1);
	}
	
	public boolean isOdd(){
		return (data%2==1);
	}
	
	public static boolean isPrime(int num){
		if (num < 2) return false;
		for(long j = 2; j<(int)(Math.sqrt(num)+1); j++){
			if (num%j==0)return false;
		}
		return true;
	}
	
	public boolean isPrime(){
		if (data < 2) return false;
		for(long j = 2; j<(int)(Math.sqrt(data)+1); j++){
			if (data%j==0)return false;
		}
		return true;
	}
	
	public static boolean isPrime(MyInteger number){
		int num = number.getData();
		if (num < 2) return false;
		for(long j = 2; j<(int)(Math.sqrt(num)+1); j++){
			if (num%j==0)return false;
		}
		return true;
	}
	
	public boolean equals(int a){
		return (data==a);
	}
	
	public boolean equals(MyInteger a){
		return(data==a.getData());
	}
	
	public static int parseInt(String a){
		int num;
		java.util.Scanner scan= new java.util.Scanner(a);
		num = scan.nextInt();
		scan.close();
		return num;
		
	}
	
	public String toString(){
		return "MyInteger [data = "+data+"]" +((isEven())?"[EVEN]":"[ODD]")+((isPrime())?"[PRIME]":"");
		
	}
}

package misc;

public class SumPrimeNumbers {
	public boolean isPrime(int number){
		int nextnumber=(number/2);//we simply do this as now we have to do only 1/2 calcs , math to the rescue.
		while(true){
			if(nextnumber==1){
				break;
			}
			if(number%nextnumber==0){
				return false;
			}
			nextnumber--;
			
		}
		return true;
	}
	
	
	public static void main(String[] args){
		int maxnum=10000;
		SumPrimeNumbers prime=new SumPrimeNumbers();
		StringBuffer buff=new StringBuffer();
		int sum=0;
		for(int i=2;i<maxnum;i++){
			if(prime.isPrime(i)){
				buff.append(i+",");
				sum=sum+i;
			}
		}
		System.out.println("Primes:"+buff+"\n***SUM***"+sum);
	}
}

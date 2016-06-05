package misc;


//git comment test //test #2
public class Pallindrome {
	public String reverse(String inp,int pointer){
		if(pointer<0){
			return "";
		}
		String finalString=inp.charAt(pointer)+this.reverse(inp.substring(0, pointer), --pointer);
		return finalString;
	}
	
	public static void main(String[] args){
		String string1="a man a plan a canal panama";
		string1=string1.replace(" ", "");
		Pallindrome str=new Pallindrome();
		
		String string2=str.reverse(string1, string1.length()-1);
		
		if(string1.equals(string2)){
			System.out.println("IS A PALLINDROME");
		}else{
			System.out.println("NOT A PALLINDROME");
		}
		
		
	}
}

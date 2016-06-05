package misc;

public class ReverseAString {
//c2
	public String reverse(String inp,int pointer){
		if(pointer<0){
			return "";
		}
		String finalString=inp.charAt(pointer)+this.reverse(inp.substring(0, pointer), --pointer);
		return finalString;
	}
	
	public static void main(String[] args){
		String test="never odd or even";
		ReverseAString str=new ReverseAString();
		System.out.println(str.reverse(test, test.length()-1));
	}
}

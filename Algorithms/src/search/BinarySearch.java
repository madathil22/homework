package search;


// primary requirement is that the array is sorted.	
public class BinarySearch {
	private Integer[] list;
	public void populateList(int numofelems){
		this.list=new Integer[numofelems];
		for(int i=0;i<numofelems;i++){
			this.list[i]=i+1;
		}
	}
	
	public void displayList(String msg){
		StringBuffer buff=new StringBuffer();
		for(int i=0;i<this.list.length;i++){
			buff.append(this.list[i]+"|");
		}
		System.out.println(msg+":"+buff);
	}
	
	public int findNumber(int numbertofind,int start, int end){
		int median=((end-start)/2) + start;
		System.out.println("median**"+median);
		if(numbertofind>this.list[end] || numbertofind <this.list[start]){
			return -1;//as the list is sorted, if its not between the lowest and highter number, its not there at all
		}
		if(numbertofind<this.list[median]){
			return this.findNumber(numbertofind, start,median-1);
		}else if(numbertofind>this.list[median]){
			return this.findNumber(numbertofind, median+1, end);
		}else{//equal condition;
			return median;
		}
	}
	
	public static void main(String[] args){
		BinarySearch bs=new BinarySearch();
		//bs.populateList(100);
		bs.list=new Integer[]{22,44,67,73,92,112,333,456,567,678};
		int idx= bs.findNumber(333, 0, bs.list.length-1);
		if(idx==-1){
			System.out.println("ITEM NOT FOUND");
		}else{
			System.out.println("Found item:"+bs.list[idx]+" at idx:"+idx+"***");
		}
	}
}

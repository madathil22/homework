package sorting;

public class BubbleSort {
	private Integer[] list;
	public void populateList(){
		this.list=new Integer[10];
		for(int i=0;i<this.list.length;i++){
			this.list[i]=new Double(Math.random()*100).intValue();
		}
	}
	
	public void displayList(String msg){
		StringBuffer buff=new StringBuffer();
		for(int i=0;i<this.list.length;i++){
			buff.append(this.list[i]+"|");
		}
		System.out.println(msg+":"+buff);
	}
	
	
	public void swap(int num1idx, int num2idx){
		int temp=this.list[num1idx];
		this.list[num1idx]=this.list[num2idx];
		this.list[num2idx]=temp;
	}
	
	public void reqSort(){
		for(int j=this.list.length;j>0;j--){
			for(int i=0;i<j;i++){
				if((i+1)<j && this.list[i]>this.list[i+1]){
					this.swap(i, i+1);
				}
			}
		}
	}
	public static void main(String[] args){
		BubbleSort sorter=new BubbleSort();
		
		sorter.populateList();
		sorter.displayList("Un-sorted");
		sorter.reqSort();
		
		
		sorter.displayList("Sorted");
	}
}

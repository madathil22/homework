package sorting;

public class InsertionSort {

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
		int inner,outer;
		
		for(outer=1;outer<this.list.length;outer++){
			inner=outer;
			int temp=this.list[inner];
			
			while(inner>0 && this.list[inner-1]>temp){
				if(this.list[inner-1]>temp){
					this.list[inner]=this.list[inner-1];
				}
				
				inner--;
				this.displayList("in while");
			}
			this.list[inner]=temp;
			this.displayList("during swap");
		}
		
		
	}
	
	public static void main(String[] args){
		InsertionSort sorter=new InsertionSort();
		
		sorter.populateList();
		sorter.displayList("Un-sorted");
		sorter.reqSort();
		
		
		sorter.displayList("Sorted");
	}
}

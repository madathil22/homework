package sorting;

public class QuickSort {
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
	
	public void reqQuickSort(int left,int right){
		if(right-left<=0){
			return;
		}
		int pivot=this.list[right]; //rightmost guy in the array is the pivot
		int partitionNumber=this.partitionIt(left, right, pivot);
		
		this.reqQuickSort(left, partitionNumber-1);
		this.reqQuickSort(partitionNumber+1, right);
	}
	
	public int partitionIt(int left, int right, int pivot){
		System.out.println("Pivot:"+pivot+"*left*"+left+"*right*"+right);
		int leftpointer=left-1;
		int rightpointer=right;
		while(true){
			while(this.list[++leftpointer]<pivot){
				//nop
			}
			while(this.list[--rightpointer]>pivot && rightpointer>0){
				//nop
			}
			if(leftpointer>=rightpointer){
				break;
			}else{
				System.out.println("leftptr:"+leftpointer+"*rightptr:"+rightpointer);
				swap(leftpointer,rightpointer);
				this.displayList("swapping");
			}
		}
		System.out.println("leftptr:"+leftpointer+"*right:"+right);
		swap(leftpointer,right);
		this.displayList("pivotChange");
		return leftpointer;
	}
	
	public void swap(int num1idx, int num2idx){
		int temp=this.list[num1idx];
		this.list[num1idx]=this.list[num2idx];
		this.list[num2idx]=temp;
	}
	
	public static void main(String[] args){
		QuickSort sorter=new QuickSort();
		
		sorter.populateList();
		sorter.displayList("Un-sorted");
		
		sorter.reqQuickSort(0, sorter.list.length-1);
		
		sorter.displayList("Sorted");
	}
}

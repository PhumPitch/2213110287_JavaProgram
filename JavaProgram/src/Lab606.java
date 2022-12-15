import javax.swing.*;

public class Lab606 {

	public static void main(String[] args) {
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		int indexOfArr = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while(checkIndex(nums,indexOfArr)) {
			indexOfArr = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again:"));
		}
		int  curData = currentData(nums,indexOfArr);
		int prevData = prevData(nums,indexOfArr);
		int nextData = nextData(nums,indexOfArr);
		JOptionPane.showMessageDialog(null,
				"Current data, nums"+"["+ indexOfArr +"]" + " is "+ curData+
				"\n"+((prevData==0)?"No previos data":"Previous data, nums "+"["+ (indexOfArr-1) +"]" + " is "+ prevData)+
				"\n"+((nextData==0)?"No next data":"Next data, nums "+"["+(indexOfArr+1) +"]" + " is "+ nextData));
	}
	public static boolean checkIndex(int[] nums,int index) {
		return(index < 0 || index > nums.length-1)?true:false ;
	}
	public static int currentData(int[] nums,int index) {
		return nums[index];
		
	}
	public static int prevData(int[] nums,int index) {
		return (index-1<0)?0: nums[index-1] ;
		
	}
	public static int nextData(int[] nums,int index) {
		return (index+1>nums.length-1)?0: nums[index+1] ;
		
	}


}

package Array;
import java.util.*;

public class Bai_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Nhập số lượng phần tử có trong mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Nhập giá trị phần tử");
		for (int i = 0; i < n; i++) {
			System.out.print("Phần tử thứ " + (i + 1) + " : ");
			a[i] = sc.nextInt();
		}
		
		if (checkSymmetry(a)) 
			System.out.print("Mảng đối xứng");
		else 
			System.out.print("Mảng không đối xứng");
	}
	
	public static boolean checkSymmetry(int a[]) {
		boolean check = true;
		for (int i = 0; i < a.length; i++) {
			if(a[i] != a[a.length - i -1]) {
				check = false;
			}
		}
		return check;
	}
}

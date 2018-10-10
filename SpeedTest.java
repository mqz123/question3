package 第二次java作业;

/**
 * 测试ArrayList,LinkedList,HashSet和TreeSet各自的随机查找速度
 * @author 毛全中
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SpeedTest {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();

		int len = 1000;
		for(int i=1;len<1000000;len=len+200000,i++) {
			test(arrayList,len);
			test(linkedList,len);
			test1(hashSet,len);
			test1(treeSet,len);
			System.out.print("   "+"\t");
			if(i%5 == 0)
				System.out.println();
		}
	}	
	
	/**
	 * 
	 * @param list
	 * @param len
	 */
	private static void test(List<Integer> list,int len) {
		
		int i=len;
		while(i>=0) {
			list.add(i);
			i--;
		}
		
		long t1 = System.currentTimeMillis();
		for(int j=0; j<len;j++) 
		{
			int num = (int)(Math.random()*len);
			list.get(num);
		}
		long t2 = System.currentTimeMillis();
		System.out.print(t2-t1+" ");
	}

	
	/**
	 * 
	 * @param set
	 * @param len
	 */
	private static void test1(Set<Integer> set,int len) {
		
		int i=len;
		while(i>=0) {
			set.add(i);
			i--;
		}

		long t1 = System.currentTimeMillis();
		for(int j=0; j<len;j++) 
		{
			int num = (int)(Math.random()*len);
			set.contains(num);
		}
		long t2 = System.currentTimeMillis();
		System.out.print(t2-t1+" ");
	}
}

package �ڶ���java��ҵ;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
public class Player{
	private int score;
	private int guess;
	static Scanner sc = new Scanner(System.in);
	
	Player(){
		score =0;guess =0;
	}
	
	public static void isEqual(Player p, int a, int b) {
		if(a==b) p.score ++;		
	}
	
	private static void max(int i, int j, int k) {
	if(i ==j && j==k) {System.out.println("ƽ��"); return;}
	if(i>j) {
		if(i == k) {
			System.out.println("���һ�������������ͬ");
		}else if(i>k){
			System.out.println("���һʤ��");
		}else if(i<k) {
			System.out.println("�����ʤ��");
		}
	}else if(i<j){
		if(j ==k) {
			System.out.println("��Ҷ��������������ͬ");
		}else if(j>k) {
			System.out.println("��Ҷ�ʤ��");
		}else if(j<k) {
			System.out.println("�����ʤ��");
		}
	}else if(i==j) {
		if(i>k) {
			System.out.println("���һ����Ҷ�������ͬ");
		}else {
			System.out.println("�����ʤ��");
		}
		
	}
}
	
	public static void main(String args[]) {
		Player []p = new Player[3];
		p[0] = new Player();
		p[1] = new Player();
		p[2] = new Player();
		
		System.out.print("��������Ϸ�Ĵ�����");
		int n = sc.nextInt();
		
		for(int j=0; j<n; j++) {
			int num = (int)(Math.random()*10);
//			System.out.println(num);
			
			for(int i=0;i<3;i++) {
				System.out.print("���"+(i+1)+":");
				p[i].guess = sc.nextInt();
				isEqual( p[i],num,p[i].guess);  //�ж����ʱ������������������з����ͼ�һ
			}
			
			System.out.println(p[0].score +" "+p[1].score +" "+p[2].score);
		}
		max(p[0].score,p[1].score,p[2].score);  //�ж��ĸ���ҵķ�����
	}
}




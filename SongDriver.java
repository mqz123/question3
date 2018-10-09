package 第二次java作业;
import java.util.HashSet;
import java.util.Scanner;

import 第二次java作业.master;


import 第二次java作业.Song;;
public class SongDriver {
	private static Song[] s = null;
	private String sName0,sName1,sName2,sName3,sName4;
	private String sSinger0,sSinger1,sSinger2,sSinger3,sSinger4;
	public static HashSet<Song> hashSet = new HashSet<Song>();
	public SongDriver() {
		s[0] = new Song(sName0,sSinger0,100);
		s[1] = new Song(sName1,sSinger1,101);
		s[2] = new Song(sName2,sSinger2,102);
		s[3] = new Song(sName3,sSinger3,103);
		s[4] = new Song(sName4,sSinger4,104);
		for(int i=0; i<5; i++) {
			hashSet.add(s[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		master m = new master();
		int n=0;
		while(n!=2) {
			System.out.println();
			System.out.print("1:点歌"+" ");
			System.out.println("2:退出");
			System.out.print("请输入：");
			n = sc.nextInt();
			switch(n) {
			case 1:m.appointSong();m.player();;break;
			default:
				break;
			}
		}
		
	}
}

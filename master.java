package �ڶ���java��ҵ;
/**
 * @author mqz
 */
import �ڶ���java��ҵ.User;
import �ڶ���java��ҵ.SongDriver;
import java.util.LinkedList;
import �ڶ���java��ҵ.Song;

public class master {
	private static Song song = null;
	private static LinkedList<Song> songList = new LinkedList<Song>(); //�����赥
	public master() {
	}
	
	//�û����
	public static void appointSong() {
		
		song = new Song(User.preSongName(),User.preSongSinger(),User.preSongTime());
		if(SongDriver.hashSet.contains(song)) {
			songList.add(song);
		}else {
			System.out.println("�˸���������");
		}
	}
	
	//���Ÿ���
	public static void player() {
		if(!songList.isEmpty()) {
			LinkedList<Song> q = songList;
			Song s = q.getFirst();
			System.out.println(s.getsName()+" "+s.getsSinger()+" "+s.getsTime());
		}else {
			System.out.println("û�и�����");
		}
		
	}
	
}

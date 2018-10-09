package 第二次java作业;
/**
 * @author mqz
 */
import 第二次java作业.User;
import 第二次java作业.SongDriver;
import java.util.LinkedList;
import 第二次java作业.Song;

public class master {
	private static Song song = null;
	private static LinkedList<Song> songList = new LinkedList<Song>(); //创建歌单
	public master() {
	}
	
	//用户点歌
	public static void appointSong() {
		
		song = new Song(User.preSongName(),User.preSongSinger(),User.preSongTime());
		if(SongDriver.hashSet.contains(song)) {
			songList.add(song);
		}else {
			System.out.println("此歌曲不存在");
		}
	}
	
	//播放歌曲
	public static void player() {
		if(!songList.isEmpty()) {
			LinkedList<Song> q = songList;
			Song s = q.getFirst();
			System.out.println(s.getsName()+" "+s.getsSinger()+" "+s.getsTime());
		}else {
			System.out.println("没有歌曲了");
		}
		
	}
	
}

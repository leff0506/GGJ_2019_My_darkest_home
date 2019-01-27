package level;

import java.awt.Point;
import java.util.ArrayList;

import imageWork.AO;
import imageWork.RO;
import objects.Battery;
import objects.Coll;
import player.Player;
import trig.AudioTrigger;
import trig.CodeTrig;

public class Level {
	public ArrayList<RO> map = new ArrayList<>();
	public ArrayList<AO> aos = new ArrayList<>();
	public ArrayList<RO> tens = new ArrayList<>();
	public ArrayList<RO> bag = new ArrayList<>();
	public ArrayList<Coll> col = new ArrayList<>();
	public ArrayList<AudioTrigger> aud = new ArrayList<>();
	public ArrayList<Battery> bat = new ArrayList<>();
	public CodeTrig co;
	public Coll taqnaya;
	public Player player;
	public void update(long time) {
		for(AO a: aos) {
			a.update(time);
		}
		player.update(time);
	}
}

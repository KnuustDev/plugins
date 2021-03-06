package net.eduard.api.server.factions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;

import net.eduard.api.API;
import net.eduard.api.setup.StorageAPI.Reference;
import net.eduard.api.setup.StorageAPI.Storable;

public class Faction implements Storable {
	@Reference
	private FactionManager manager;
	private String name;
	private String prefix;
	private String suffix;
	private Location base;
	@Reference
	private FactionPlayer leader;
	@Reference
	private List<FactionClaim> claims = new ArrayList<>();
	@Reference
	private List<FactionPlayer> members = new ArrayList<>();
	@Reference
	private List<FactionPlayer> invites = new ArrayList<>();
	@Reference
	private List<Faction> allies = new ArrayList<>();
	@Reference
	private List<Faction> rivals = new ArrayList<>();

	public int getKills() {
		int kills = 0;
		for (FactionPlayer member : members) {
			kills += member.getKills();
		}

		return kills;
	}
	public int getDeaths() {
		int deaths = 0;
		for (FactionPlayer member : members) {
			deaths += member.getDeaths();
		}
		return deaths;
	}

	public int getPower() {
		int power = 0;
		for (FactionPlayer member : members) {
			power += member.getPower();
		}
		return power;
	}
	public int getMaxPower() {
		int power = 0;
		for (FactionPlayer member : members) {
			power += member.getMaxPower();
		}
		return power;
	}
	public double getKDR() {
		int kdr = 0;
		int amount = members.size();
		for (FactionPlayer member : members) {
			kdr += member.getKDR();
		}
		if (kdr == 0) {
			return 0;
		}
		return kdr / amount;
	}

	public List<FactionPlayer> getMembersOnline() {
		List<FactionPlayer> list = new ArrayList<>();
		for (FactionPlayer member : getMembers()) {
			if (member.isOnline()) {
				list.add(member);;
			}

		}
		return list;
	}

	public Faction(String name, String prefix) {
		this.name = name;
		this.prefix = prefix;
	}
	public Faction() {
		// TODO Auto-generated constructor stub
	}
	public List<FactionClaim> getClaims() {
		return claims;
	}
	public void sendMessage(String message) {
		for (FactionPlayer member : getMembers()) {
			member.sendMessage(message);
		}
	}
	public void send(CommandSender sender, String message) {
		API.chat(sender,
				message.replace("$tag", prefix).replace("$name", name));
	}

	public List<FactionPlayer> getInvites() {
		return invites;
	}

	public FactionPlayer getLeader() {
		return leader;
	}
	public List<FactionPlayer> getMembers() {
		return members;
	}
	public String getName() {
		return name;
	}
	public String getPrefix() {
		return prefix;
	}
	public String getSuffix() {
		return suffix;
	}

	public void setClaims(List<FactionClaim> claims) {
		this.claims = claims;
	}

	public void setInvites(List<FactionPlayer> invites) {
		this.invites = invites;
	}

	public void setLeader(FactionPlayer leader) {
		this.leader = leader;
	}

	public void setMembers(List<FactionPlayer> members) {
		this.members = members;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public FactionRel getRel(FactionClaim claim) {
		Faction faction = claim.getFaction();
		if (faction == null) {
			return FactionRel.FREE_ZONE;
		}
		if (equals(faction)) {
			if (claim.isOnAttack()) {
				return FactionRel.WAR;
			}
			return FactionRel.MEMBER;
		}
		return getRel(claim.getFaction());

	}
	public FactionRel getRel(Faction faction) {
		if (faction == null) {
			return FactionRel.FREE_ZONE;
		}
		if (getAllies().contains(faction)) {
			return FactionRel.ALLY;
		}
		if (getRivals().contains(faction)) {
			return FactionRel.RIVAL;
		}
		if (faction.equals(manager.getWarZone())) {
			return FactionRel.WAR_ZONE;
		}
		if (faction.equals(manager.getProtectedZone())) {
			return FactionRel.PROTECTED_ZONE;
		}
		return FactionRel.NEUTRAL;

	}

	public List<Faction> getRivals() {
		return rivals;
	}

	public void setRivals(List<Faction> rivals) {
		this.rivals = rivals;
	}

	public List<Faction> getAllies() {
		return allies;
	}

	public void setAllies(List<Faction> allies) {
		this.allies = allies;
	}

	public boolean hasBase() {
		return getBase() != null;
	}
	public boolean isOnAttack() {
		for (FactionClaim claim : claims) {
			if (claim.isOnAttack()) {
				return true;
			}
		}
		return false;
	}
	public double getKillPerDeath() {
		int kill = 0;
		int death = 0;
		for (FactionPlayer member : members) {
			kill += member.getKills();
			death += member.getDeaths();
		}
		if (kill == 0 | death == 0) {
			return 0;
		}
		return kill / death;
	}
	public Location getBase() {
		return base;
	}
	public void setBase(Location base) {
		this.base = base;
	}
	@Override
	public Object restore(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void store(Map<String, Object> map, Object object) {
		// TODO Auto-generated method stub

	}

}

package net.eduard.api;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.EntityEffect;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.Statistic;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityTargetEvent.TargetReason;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import com.gmail.nossr50.datatypes.player.McMMOPlayer;
import com.gmail.nossr50.util.player.UserManager;

import net.eduard.api.click.ClickComparationType;
import net.eduard.api.command.antihack.AntiHackCommand;
import net.eduard.api.command.api.ApiCommand;
import net.eduard.api.command.config.ConfigCommand;
import net.eduard.api.command.economy.EconomyCommand;
import net.eduard.api.command.essentials.AdminCommand;
import net.eduard.api.command.essentials.EnchantCommand;
import net.eduard.api.command.essentials.GotoCommand;
import net.eduard.api.command.essentials.SoundCommand;
import net.eduard.api.command.lag.LagCommand;
import net.eduard.api.command.map.MapCommand;
import net.eduard.api.command.permission.PermissionCommand;
import net.eduard.api.config.Config;
import net.eduard.api.config.ConfigSection;
import net.eduard.api.game.Ability;
import net.eduard.api.game.Drop;
import net.eduard.api.kits.Achilles;
import net.eduard.api.manager.CommandManager;
import net.eduard.api.minigame.Game;
import net.eduard.api.minigame.Schematic;
import net.eduard.api.server.chat.ChatAPI;
import net.eduard.api.server.chat.ChatAPI.ChatChannel;
import net.eduard.api.setup.BungeeAPI;
import net.eduard.api.setup.Mine;
import net.eduard.api.setup.Mine.Replacer;
import net.eduard.api.setup.Mine.TimeManager;
import net.eduard.api.setup.StorageAPI;
import net.eduard.api.setup.VaultAPI;
/**
 * @author Eduard-PC
 *
 */
public class EduardAPI extends JavaPlugin implements Listener {
	public static void simpleClans() {
//		ExtraAPI.addReplacer("$clan_label", new Replacer() {
//
//			@Override
//			public Object getText(Player p) {
//
//				ClanPlayer clan = SimpleClans.getInstance().getClanManager()
//						.getClanPlayer(p);
//				if (clan == null) {
//					return "";
//				}
//				if (clan.getClan() == null) {
//					return "";
//				}
//
//				return clan.getClan().getTagLabel();
//			}
//		});
//		ExtraAPI.addReplacer("$clan_name", new Replacer() {
//
//			@Override
//			public Object getText(Player p) {
//
//				ClanPlayer clan = SimpleClans.getInstance().getClanManager()
//						.getClanPlayer(p);
//				if (clan == null) {
//					return "";
//				}
//				if (clan.getClan() == null) {
//					return "";
//				}
//
//				return clan.getClan().getName();
//			}
//		});
//		ExtraAPI.addReplacer("$clan_tag", new Replacer() {
//
//			@Override
//			public Object getText(Player p) {
//
//				ClanPlayer clan = SimpleClans.getInstance().getClanManager()
//						.getClanPlayer(p);
//				if (clan == null) {
//					return "";
//				}
//				if (clan.getClan() == null) {
//					return "";
//				}
//
//				return  clan.getClan().getTag();
//			}
//		});
//		ExtraAPI.addReplacer("$clan_color", new Replacer() {
//
//			@Override
//			public Object getText(Player p) {
//
//				ClanPlayer clan = SimpleClans.getInstance().getClanManager()
//						.getClanPlayer(p);
//				if (clan == null) {
//					return "";
//				}
//				if (clan.getClan() == null) {
//					return "";
//				}
//
//				return  clan.getClan().getColorTag();
//			}
//		});
//		ExtraAPI.addReplacer("$clan_name", new Replacer() {
//
//			@Override
//			public Object getText(Player p) {
//
//				ClanPlayer clan = SimpleClans.getInstance().getClanManager()
//						.getClanPlayer(p);
//				if (clan == null) {
//					return "";
//				}
//				if (clan.getClan() == null) {
//					return "";
//				}
//
//				return  clan.getClan().getName();
//			}
//		});
	}
	public static void hardFacs() {
//		if (API.hasPlugin("HardFacs")) {
//			ExtraAPI.addReplacer("$fac_money", new Replacer() {
//
//				@Override
//				public Object getText(Player p) {
//					DecimalFormat decimal = new DecimalFormat("#,##0.00");
//					return decimal.format(FPlayers.i.get(p).getFaction().money);
//				}
//			});
//			ExtraAPI.addReplacer("$fac_p_chat", new Replacer() {
//
//				@Override
//				public Object getText(Player p) {
//					return FPlayers.i.get(p).getChatTag();
//				}
//			});
//			ExtraAPI.addReplacer("$fac_zone", new Replacer() {
//
//				@Override
//				public Object getText(Player p) {
//					FPlayer player = FPlayers.i.get(p);
//					Faction zone = Board.getFactionAt(player.getLastStoodAt());
//
//					return zone.getColorTo(player) + zone.getTag();
//					// return Board.getTerritoryAccessAt(new FLocation(fp)).
//				}
//			});
//			ExtraAPI.addReplacer("$fac_p_power", new Replacer() {
//
//				@Override
//				public Object getText(Player p) {
//
//					return FPlayers.i.get(p).getPowerRounded();
//				}
//			});
//			ExtraAPI.addReplacer("$fac_p_maxpower", new Replacer() {
//
//				@Override
//				public Object getText(Player p) {
//
//					return FPlayers.i.get(p).getPowerMaxRounded();
//				}
//			});
//			ExtraAPI.addReplacer("$fac_power", new Replacer() {
//
//				@Override
//				public Object getText(Player p) {
//
//					return FPlayers.i.get(p).getFaction().getPowerRounded();
//				}
//			});
//			ExtraAPI.addReplacer("$fac_maxpower", new Replacer() {
//
//				@Override
//				public Object getText(Player p) {
//
//					return FPlayers.i.get(p).getFaction().getPowerMaxRounded();
//				}
//			});
//
//			ExtraAPI.addReplacer("$fac_tag", new Replacer() {
//
//				@Override
//				public Object getText(Player p) {
//					Faction f = FPlayers.i.get(p).getFaction();
//					if (f != null & !f.getComparisonTag().equals("ZonaLivre"))
//						return f.getTag();
//					return "�7Sem Fac��o";
//				}
//			});
//			ExtraAPI.addReplacer("$fac_comptag", new Replacer() {
//
//				@Override
//				public Object getText(Player p) {
//
//					return FPlayers.i.get(p).getFaction().getComparisonTag();
//				}
//			});
//			ExtraAPI.addReplacer("$fac_desc", new Replacer() {
//
//				@Override
//				public Object getText(Player p) {
//					Faction f = FPlayers.i.get(p).getFaction();
//					if (f != null)
//						return f.getDescription();
//					return "";
//				}
//			});
//			ExtraAPI.addReplacer("$fac_online", new Replacer() {
//
//				@Override
//				public Object getText(Player p) {
//
//					return FPlayers.i.get(p).getFaction()
//							.getFPlayersWhereOnline(true).size();
//				}
//			});
//			ExtraAPI.addReplacer("$fac_players", new Replacer() {
//
//				@Override
//				public Object getText(Player p) {
//
//					return FPlayers.i.get(p).getFaction().getFPlayers().size();
//				}
//			});
//			ExtraAPI.addReplacer("$fac_claims", new Replacer() {
//
//				@Override
//				public Object getText(Player p) {
//
//					return FPlayers.i.get(p).getFaction().getClaims().size();
//				}
//			});
	}
	private static JavaPlugin plugin;
	private TimeManager time;

	private Config messages;

	private Config config;
	public static JavaPlugin getInstance() {
		return plugin;
	}

	public boolean getBoolean(String path) {
		return config.getBoolean(path);
	}
	public String message(String path) {
		return messages.message(path);
	}
	public List<String> getMessages(String path) {
		return messages.getMessages(path);
	}

	public TimeManager getTime() {
		return time;
	}
	public Config getMessages() {
		return messages;
	}
	public Config getConfigs() {
		return config;
	}
	// @EventHandler
	// public void event(PlayerTargetEvent e) {
	// Player p = e.getPlayer();
	// LivingEntity target = e.getEntity();
	// if (target != null)
	// Mine.sendActionBar(p, "�c" + target.getName());
	// }
	@Override
	public void onEnable() {
		plugin = this;
		StorageAPI.init();
		config = new Config(this, "config.yml");
		messages = new Config(this, "messages.yml");
		time = new TimeManager(this);
		StorageAPI.registerPackage(ClickComparationType.class);
		StorageAPI.registerPackage(AntiHackCommand.class);
		StorageAPI.registerPackage(ApiCommand.class);
		StorageAPI.registerPackage(ApiCommand.class);
		StorageAPI.registerPackage(EconomyCommand.class);
		StorageAPI.registerPackage(ConfigCommand.class);
		StorageAPI.registerPackage(LagCommand.class);
		StorageAPI.registerPackage(MapCommand.class);
		StorageAPI.registerPackage(PermissionCommand.class);
		StorageAPI.registerPackage(AdminCommand.class);
		StorageAPI.registerPackage(Achilles.class);
		StorageAPI.registerPackage(Ability.class);
		StorageAPI.registerPackage(CommandManager.class);
		StorageAPI.registerPackage(Game.class);
		StorageAPI.registerClasses(ChatAPI.class);
		StorageAPI.registerClasses(Mine.class);
		StorageAPI.register(Schematic.class);
		BungeeAPI.register(this);
		Mine.resetScoreboards();
		Mine.console("�bEduardAPI �fScoreboard resetadas!");
		replacers();
		time.timer(20, new Runnable() {

			@Override
			public void run() {
				API.updateTargets();
			}
		});
		Mine.register(this);
		new GotoCommand().register();
		new ApiCommand().register();
		new SoundCommand().register();
		new EnchantCommand().register();
		new PermissionCommand().register();
		new MapCommand().register();
		new ConfigCommand().register();
		new AntiHackCommand().register();
		new LagCommand().register();

		Mine.console("�bEduardAPI �fCustom Tag e Score ativado!");
		saveObjects();
		Mine.console("�bEduardAPI �fDataBase �agerada!");
		new Drop().register(this);
		Mine.console("�bEduardAPI �fCustom drops ativado!");
		Mine.event(this, this);
		Mine.console("�bEduardAPI �fBase ativado!");
		API.loadMaps();
		Mine.console("�bEduardAPI �fMapas �acarregados!");
		ChatAPI.setEnabled(config.getBoolean("custom-chat"));
		if (ChatAPI.isEnabled())
			ChatAPI.enable(this);
		config.add("chat-default", "local");

		config.add("sound-teleport", API.SOUND_TELEPORT);
		config.add("sound-error", API.SOUND_ERROR);
		config.add("sound-success", API.SOUND_SUCCESS);
		ChatChannel local = new ChatChannel("local",
				"$chat_prefix $player $chat_suffix: $message", "&e(L)&f", "",
				"l");
		ChatChannel global = new ChatChannel("global",
				"$chat_prefix $player $chat_suffix: $message", "&e(L)&f", "",
				"g");
		config.add("chats.local", local);
		config.add("chats.global", global);
		config.saveConfig();
		API.AUTO_RESPAWN = config.getBoolean("auto-respawn");
		API.NO_JOIN_MESSAGE = config.getBoolean("no-join-message");
		API.NO_QUIT_MESSAGE = config.getBoolean("no-quit-message");
		API.NO_DEATH_MESSAGE = config.getBoolean("no-death-message");

		API.ON_JOIN = config.message("on-join-message");
		API.ON_QUIT = config.message("on-quit-message");
		API.SOUND_TELEPORT = config.getSound("sound-teleport");
		API.SOUND_ERROR = config.getSound("sound-error");
		API.SOUND_SUCCESS = config.getSound("sound-success");
		Mine.setTagsEnabled(config.getBoolean("auto-tag"));
		Mine.setTagsGroups(config.getStringList("tags-rank"));
		Mine.register(this);
		for (ConfigSection sec : config.getValues("chats")) {
			ChatChannel chat = (ChatChannel) sec.getValue();
			ChatAPI.getChannels().put(chat.getName(), chat);
		}
		ChatAPI.setChatDefault(ChatAPI.getChannels()
				.getOrDefault(config.getString("chat-default"), local));
		if (config.getBoolean("auto-rejoin")) {
			for (Player p : API.getPlayers()) {
				Mine.callEvent(new PlayerJoinEvent(p, null));
			}
		}

		Mine.console("�bEduardAPI �acarregado!");
	}
	@Override
	public void onDisable() {
		API.saveMaps();
		Mine.console("�bEduardAPI �aMapas salvados!");
		Mine.console("�bEduardAPI �cdesativado!");
	}
	@EventHandler
	public void onEnable(PluginEnableEvent e) {
		if (e.getPlugin() instanceof EduardPlugin) {
			Mine.broadcast("�aEduard Developer: �b" + e.getPlugin().getName()
					+ " �fv" + e.getPlugin().getDescription().getVersion());

		}
		for (Config config : Config.CONFIGS) {
			if (e.getPlugin().equals(config.getPlugin())) {
				config.reloadConfig();
			}
		}
	}
	@EventHandler
	public void onDisable(PluginDisableEvent e) {
		for (Config config : Config.CONFIGS) {
			if (e.getPlugin().equals(config.getPlugin())) {
				if (config.isAutoSave()) {
					config.saveConfig();
				}
			}
		}
	}

	@EventHandler
	public void onDeath(PlayerDeathEvent e) {
		Player p = e.getEntity();
		if (API.AUTO_RESPAWN) {
			if (p.hasPermission("eduardapi.autorespawn")) {
				API.TIME.delay(1L, new Runnable() {

					@Override
					public void run() {
						if (p.isDead()) {
							p.setFireTicks(0);
							try {
								Mine.makeRespawn(p);
							} catch (Exception ex) {
								ex.printStackTrace();
							}
						}
					}
				});
			}

		}
		if (API.NO_DEATH_MESSAGE) {
			e.setDeathMessage(null);
		}
	}

	@EventHandler
	public void onPingServer(ServerListPingEvent e) {
		Integer amount = config.getInt("custom-motd-amount");
		if (amount > -1) {
			e.setMaxPlayers(amount);
		}

		if (config.getBoolean("custom-motd")) {
			StringBuilder builder = new StringBuilder();
			for (String line : config.getMessages("motd")) {
				builder.append(line + "\n");
			}
			e.setMotd(builder.toString());
		}

	}
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		if (config.getBoolean("custom-quit-message"))
			e.setQuitMessage(API.ON_QUIT.replace("$player", p.getName()));
		if (API.NO_QUIT_MESSAGE) {
			e.setQuitMessage("");
		}
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if (config.getBoolean("save-players")) {
			saveObject("Players/" + p.getName() + " " + p.getUniqueId(), p);
		}
		if (config.getBoolean("custom-join-message")) {
			e.setJoinMessage(API.ON_JOIN.replace("$player", p.getName()));
		}

		if (API.NO_JOIN_MESSAGE) {
			e.setJoinMessage(null);
			return;
		}

	}

	public static void saveEnum(Class<?> value) {
		saveEnum(value, false);
	}
	public static void saveClassLikeEnum(Class<?> value) {
		try {
			Config config = new Config(
					"DataBase/" + value.getSimpleName() + ".yml");
			for (Field field : value.getFields()) {
				if (field.getType().equals(value)) {
					Object obj = field.get(value);
					ConfigSection section = config.getSection(field.getName());
					for (Method method : obj.getClass().getDeclaredMethods()) {
						String name = method.getName();
						if ((method.getParameterCount() == 0)
								&& name.startsWith("get")
										| name.startsWith("is")
										| name.startsWith("can")) {
							method.setAccessible(true);
							Object test = method.invoke(obj);
							if (test instanceof Class)
								continue;
							section.add(method.getName(), test);
						}
					}
				}
			}
			config.saveConfig();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void saveObject(String local, Object value) {
		try {
			Config config = new Config("DataBase/" + local + ".yml");
			ConfigSection section = config.getConfig();
			for (Method method : value.getClass().getDeclaredMethods()) {
				String name = method.getName();
				if ((method.getParameterCount() == 0) && name.startsWith("get")
						| name.startsWith("is") | name.startsWith("can")) {
					method.setAccessible(true);
					Object test = method.invoke(value);
					if (test == null)
						continue;
					if (test instanceof Class)
						continue;
					section.set(method.getName(), test);
				}
			}
			config.saveConfig();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void saveEnum(Class<?> value, boolean perConfig) {
		try {
			if (perConfig) {

				for (Object part : value.getEnumConstants()) {

					try {
						Enum<?> obj = (Enum<?>) part;
						Config config = new Config(
								"DataBase/" + value.getSimpleName() + "/"
										+ obj.name() + ".yml");
						ConfigSection section = config.getConfig();
						section.set("number", obj.ordinal());
						for (Method method : obj.getClass()
								.getDeclaredMethods()) {
							String name = method.getName();
							if ((method.getParameterCount() == 0)
									&& name.startsWith("get")
											| name.startsWith("is")
											| name.startsWith("can")) {
								method.setAccessible(true);
								Object test = method.invoke(obj);
								if (test instanceof Class)
									continue;
								section.add(method.getName(), test);
							}
						}
						config.saveConfig();
					} catch (Exception ex) {
						ex.printStackTrace();
						continue;
					}
				}

			} else {
				Config config = new Config(
						"DataBase/" + value.getSimpleName() + ".yml");
				boolean used = false;
				for (Object part : value.getEnumConstants()) {
					try {
						Enum<?> obj = (Enum<?>) part;
						ConfigSection section = config.add(obj.name(),
								obj.ordinal());

						for (Method method : obj.getClass()
								.getDeclaredMethods()) {
							String name = method.getName();
							if ((method.getParameterCount() == 0)
									&& name.startsWith("get")
											| name.startsWith("is")
											| name.startsWith("can")) {
								try {
									method.setAccessible(true);
									Object test = method.invoke(obj);
									if (test == null)
										continue;
									if (test instanceof Class)
										continue;
									section.add(method.getName(), test);
									used = true;
								} catch (Exception ex) {
									Mine.console("�bDataBase �fO metodo �c"
											+ name + "�f causou erro!");
									ex.printStackTrace();
									continue;
								}

							}
						}

					} catch (Exception ex) {
						ex.printStackTrace();
						continue;
					}
				}
				if (!used)
					config.setIndent(0);
				config.saveConfig();
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	private void replacers() {
		if (Mine.hasPlugin("Vault")) {
			Mine.addReplacer("$player_group", new Replacer() {

				@Override
				public Object getText(Player p) {
					return VaultAPI.getPermission().getPrimaryGroup(p);
				}
			});
			Mine.addReplacer("$player_prefix", new Replacer() {

				@Override
				public Object getText(Player p) {
					return Mine.toChatMessage(
							VaultAPI.getChat().getPlayerPrefix(p));
				}
			});
			Mine.addReplacer("$player_suffix", new Replacer() {

				@Override
				public Object getText(Player p) {
					return Mine.toChatMessage(Mine.toChatMessage(
							VaultAPI.getChat().getPlayerPrefix(p)));
				}
			});
			Mine.addReplacer("$group_prefix", new Replacer() {

				@Override
				public Object getText(Player p) {
					return Mine.toChatMessage(VaultAPI.getChat().getGroupPrefix(
							"null",
							VaultAPI.getPermission().getPrimaryGroup(p)));
				}
			});
			Mine.addReplacer("$group_suffix", new Replacer() {

				@Override
				public Object getText(Player p) {
					return Mine.toChatMessage(VaultAPI.getChat().getGroupSuffix(
							"null",
							VaultAPI.getPermission().getPrimaryGroup(p)));
				}
			});
			Mine.addReplacer("$player_money", new Replacer() {

				@Override
				public Object getText(Player p) {
					if (VaultAPI.hasVault() && VaultAPI.hasEconomy()) {

						DecimalFormat decimal = new DecimalFormat("#,##0.00");
						return decimal
								.format(VaultAPI.getEconomy().getBalance(p));

					}
					return "0.00";
				}
			});
		}

		Mine.addReplacer("$players_online", new Replacer() {

			@Override
			public Object getText(Player p) {
				return API.getPlayers().size();
			}
		});
		Mine.addReplacer("$player_world", new Replacer() {

			@Override
			public Object getText(Player p) {
				return p.getWorld().getName();
			}
		});
		Mine.addReplacer("$player_displayname", new Replacer() {

			@Override
			public Object getText(Player p) {
				return p.getDisplayName();
			}
		});
		Mine.addReplacer("$player_name", new Replacer() {

			@Override
			public Object getText(Player p) {
				return p.getName();
			}
		});
		Mine.addReplacer("$player_health", new Replacer() {

			@Override
			public Object getText(Player p) {
				return p.getHealth();
			}
		});
		Mine.addReplacer("$player_maxhealth", new Replacer() {

			@Override
			public Object getText(Player p) {
				return p.getMaxHealth();
			}
		});
		Mine.addReplacer("$player_level", new Replacer() {

			@Override
			public Object getText(Player p) {
				return p.getLevel();
			}
		});
		Mine.addReplacer("$player_xp", new Replacer() {

			@Override
			public Object getText(Player p) {
				return p.getTotalExperience();
			}
		});
		Mine.addReplacer("$player_kills", new Replacer() {

			@Override
			public Object getText(Player p) {
				return p.getStatistic(Statistic.PLAYER_KILLS);
			}
		});
		Mine.addReplacer("$player_deaths", new Replacer() {

			@Override
			public Object getText(Player p) {
				return p.getStatistic(Statistic.DEATHS);
			}
		});
		Mine.addReplacer("$player_kdr", new Replacer() {

			@Override
			public Object getText(Player p) {
				int kill = p.getStatistic(Statistic.PLAYER_KILLS);
				int death = p.getStatistic(Statistic.DEATHS);
				if (kill == 0)
					return 0;
				if (death == 0)
					return 0;
				return kill / death;
			}
		});
		Mine.addReplacer("$player_kill/death", new Replacer() {

			@Override
			public Object getText(Player p) {
				int kill = p.getStatistic(Statistic.PLAYER_KILLS);
				int death = p.getStatistic(Statistic.DEATHS);
				if (kill == 0)
					return 0;
				if (death == 0)
					return 0;
				return kill / death;
			}
		});

		Mine.addReplacer("$player_x", new Replacer() {

			@Override
			public Object getText(Player p) {
				return p.getLocation().getX();
			}
		});
		Mine.addReplacer("$player_y", new Replacer() {

			@Override
			public Object getText(Player p) {
				return p.getLocation().getY();
			}
		});
		Mine.addReplacer("$player_z", new Replacer() {

			@Override
			public Object getText(Player p) {
				return p.getLocation().getZ();
			}
		});
		if (Mine.hasPlugin("mcMMO")) {
			Mine.addReplacer("$mcmmo_level", new Replacer() {

				@Override
				public Object getText(Player p) {
					McMMOPlayer usuario = UserManager.getPlayer(p);
					int nivel = usuario.getPowerLevel();
					return nivel;
				}
			});

		}

	}

	private void saveObjects() {

		if (!new File(getDataFolder(), "DataBase").exists()) {
			saveEnum(DamageCause.class);
			saveEnum(Material.class);
			saveEnum(Effect.class);
			saveEnum(EntityType.class);
			saveEnum(TargetReason.class);
			saveEnum(Sound.class);
			saveEnum(EntityEffect.class);
			saveEnum(Environment.class);
			saveEnum(PotionType.class);
			saveClassLikeEnum(PotionEffectType.class);
		}

		if (getConfigs().getBoolean("save-worlds")) {
			for (World world : Bukkit.getWorlds()) {
				saveObject("Worlds/" + world.getName(), world);
			}
		}
		if (getConfigs().getBoolean("save-players")) {
			for (OfflinePlayer player : Bukkit.getOfflinePlayers()) {
				String name = player.getName();
				saveObject("Players/" + name + " " + player.getUniqueId(),
						player);
			}
		}
		saveObject("Server", Bukkit.getServer());
	}

}

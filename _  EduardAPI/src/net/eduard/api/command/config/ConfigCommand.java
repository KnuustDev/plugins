
package net.eduard.api.command.config;

import net.eduard.api.manager.CommandManager;

public class ConfigCommand extends CommandManager {

	public ConfigCommand() {
		super("config");
		
		register(new ConfigSaveCommand());
		register(new ConfigReloadCommand());
		register(new ConfigHelpCommand());
	}

}

package com.icanstudios.teamsplugin;

import java.util.UUID;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static JavaPlugin plugin;
	
	@Override
	public void onEnable() {
		plugin = this;
		System.out.println("this shitt starting");
		this.getCommand("debug").setExecutor(new Command_Debug());
		this.getCommand("join").setExecutor(new Command_JoinPlayerTeam());
		this.getCommand("create").setExecutor(new Command_CreateTeam());
		this.getCommand("calltoarms").setExecutor(new Command_CallToArms());
		this.getCommand("accept").setExecutor(new Command_Accept());
	}
	
	@Override
	public void onDisable() {
		System.out.println("who the fuck turning me off fuck you buddy");
	}
}

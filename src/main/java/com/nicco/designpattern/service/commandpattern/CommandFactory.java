package com.nicco.designpattern.service.commandpattern;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

	private Map<String, Command> map = new HashMap<>();
	
	public CommandFactory() {
		map.put("01", new CommandCode01());
		map.put("02", new CommandCode02());
		map.put("03", new CommandCode03());
		map.put("04", new CommandCode04());
		map.put("", new CommandCodeNullable());
	}
	
	public Command getCommand(String code) {
		return map.get(code);
	}
}

package com.javaplus.app.transport.security.constants;

public enum RoleType {
	
	ROLE_USER(0, "ROLE_USER"),
	ROLE_ADMIN(1, "ROLE_ADMIN")
	
	;
	
	private final int id;
	private final String name;
	
	private RoleType(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public static RoleType fromId(final int fromId) {
		for (RoleType type : values()) {
			if (type.getId() == fromId) {
				return type;
			}
		}
		return null;
	}
}

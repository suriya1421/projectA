package com.chainsys.springproject.beans;

public class Desert {
	public String name;
}

class Icecream extends Desert {
	public Icecream() {
		name="chocolate";
	}
}

class Sweets extends Desert {
	public Sweets() {
		name="rasagulla";
	}
}

class Cakes extends Desert {
	public Cakes() {
		name="RussianVelvet";
	}

	public Cakes(String name) {
		this.name=name;
}
}
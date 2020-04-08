class Item {
	int id;
	String name;
	double price;
	char ddv;

	public Item(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	double getTaxReturn() {
		double ddvPercentage = getPercentageFromDdvClass(this.ddv);
		double withDdv = price * ddvPercentage;

		return 0.15 * withDdv;
	}

	double getPercentageFromDdvClass(char ddv) {
		if (ddv == 'A') return 0.18;
		if (ddv == 'B') return 0.05;
		if (ddv == 'V') return 0.0;
	}

	//TODO add variable.

	//TODO setters and getters

	double taxReturn () {
		//TODO
	}
}
class Point {
	String id;
	double x,y;
	String boja= new String("xd");
	//TODO add new variable

	//TODO constructor

	public Point(String id, double x, double y, String boja) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.boja = boja;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
//TODO setters and getters

	public void move (char xDirection, char yDirection) {
		//TODO
		setX(getX()+xDirection);
		setY(getY()+yDirection);

	}

	public void draw () {
		//TODO
		System.out.println(getX() + getY())
	}



}
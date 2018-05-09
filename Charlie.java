class Charlie {
	//private int a = 5;
	protected int a=5;
	protected int b = 7;
	
	public void infoCharlie () {
		System.out.println("Dipanggi l pada " + this.getClass().getName());
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
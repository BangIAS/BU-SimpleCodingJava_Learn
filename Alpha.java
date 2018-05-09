class Alpha{
	private int a = 5;
	
	public void info(){
		System.out.println("a="+a);
		System.out.println("Dipanggil pada"+ this.getClass().getName());
		}
}
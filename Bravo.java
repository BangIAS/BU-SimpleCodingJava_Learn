class Bravo extends Alpha{
	private int b=7;
	
	public void print(){
		System.out.println("b="+b);
		}
	
	public static void main(String[]args){
		Bravo obj = new Bravo();
		obj.info();
		obj.print();
	}
}
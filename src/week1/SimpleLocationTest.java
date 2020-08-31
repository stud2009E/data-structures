package week1;

class SimpleLocationTest{
	
	public static void main(String[] args){
		
		SimpleLocation loc1 = new SimpleLocation();
		SimpleLocation loc2 = new SimpleLocation(33.33, 44.44);
		
		System.out.println(loc1);
		System.out.println(loc2);
		
		System.out.println(loc1.getDistance(loc2));
	}
	
}
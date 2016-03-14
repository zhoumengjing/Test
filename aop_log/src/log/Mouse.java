package log;

public class Mouse {
	public String click(){
		System.out.println("click");
		return "click me";
	}
	public void move(){
		System.out.println("move");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

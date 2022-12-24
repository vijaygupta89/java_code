package mypack;

interface Printable {
	void display();
}
interface Calculate{
	int cal(int v);
}
class Calsquare implements Printable,Calculate
{
	public void display() {
		System.out.println("square is :");
	}
	public int cal(int a) {
		return a*a;
	}
	}
class Calcube implements Printable,Calculate
{
	public void display() {
		System.out.println("cube of given number is :");
	}
	public int cal(int a) {
		return a*a*a;
	}
}



 class UseData {
	 public static void main(String args[]) {
			Calsquare cs = new Calsquare();
			cs.display();
			System.out.println(cs.cal(8));
			
			Calcube cc = new Calcube();
			cc.display();
			System.out.println(cc.cal(9));
		}
		}


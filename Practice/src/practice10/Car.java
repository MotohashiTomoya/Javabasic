package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;

	public int run() {
		this.gasoline--;
		int i=new java.util.Random().nextInt(15);
		i=i+1;
		if(this.gasoline>=0) {
			return i;
		}else {
			return -1;
		}

	}



	}





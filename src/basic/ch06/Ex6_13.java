package basic.ch06;

class Car3 {
	String color;    // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door;        // 문의 개수
	
	Car3() {
		this("white", "auto", 4);
	}
	
	Car3(String color) {
		this(color, "auto", 4);
	}
	
	Car3(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}


public class Ex6_13 {
    public static void main(String[] args) {
    	Car2 c1 = new Car2();
    	c1.color = "white";
    	c1.gearType = "auto";
    	c1.door = 4;
    	
    	Car2 c2 = new Car2("white", "auto", 4);
    	
    	System.out.println("c1의 color=" + c1.color + ", gearType= " + c1.gearType + ", door= " + c1.door);
    	System.out.println("c2의 color=" + c2.color + ", gearType= " + c2.gearType + ", door= " + c2.door);
    }
}

/*
	결과
	c1의 color=white, gearType= auto, door= 4
	c2의 color=white, gearType= auto, door= 4
*/
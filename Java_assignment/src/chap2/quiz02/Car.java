package chap2.quiz02;

public class Car {

	private String model;
	private int speed;
	private char mode;
	private boolean start;

	public Car(String model) {
		this.model = model;
		mode = 'P';
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0||speed>=200) return; //속도는 0 미만, 200 이상일 수 없습니다.
		if(isStart()==false) return; //시동이 걸려있지 않은 상태라면 속도를 지정할 수 없습니다.
		if(getMode()!='D'&&getMode()!='R') return; //D나 R모드가 아니라면 속도를 지정할 수 없습니다.
		if(getMode()=='R'&&speed>40) return; //R모드는 속도를 40 초과해서 지정할 수 없습니다.
		this.speed = speed;
	}


	public char getMode() {
		return mode;
	}
	public void setMode(char mode) {
		switch(mode) { //전달받은 변속 모드에 따라 상태를 변경합니다.
		case 'R': case 'r':
			this.mode = 'R';
			return;
		case 'N': case 'n':
			this.mode = 'N';
			return;
		case 'D': case 'd':
			this.mode = 'D';
			return;
		default: //지정된 값 이외의 매개값은 P 모드로 통일합니다.
			this.mode = 'P';
		}
	}

	public boolean isStart() {
		return start;
	}
	public void setStart(boolean start) {
		this.start = start;
	}

	public void engineStart() {
		System.out.println("시동버튼을 눌렀습니다."); //"시동버튼을 눌렀습니다." 는 출력문 실행.
		injectGasoline(); //엔진오일이 주입되는 기능 실행.
		injectOil(); //엔진에 연료가 주입되는 기능 실행.
		setStart(true); //시동 온/오프 상태 변수의 값을 변경.
		moveCylinder(); //실린더가 움직이는 기능 실행.
		System.out.println("시동이 걸렸습니다."); //"시동이 걸렸습니다." 는 출력문 실행.
	}
	
	private void injectGasoline() { //엔진오일이 주입되는 기능 실행.
		System.out.println("연료가 엔진에 주입됩니다.");
	}
	private void injectOil() { //엔진에 연료가 주입되는 기능 실행.
		System.out.println("엔진오일이 순환합니다.");
	}
	
	private void moveCylinder() { //실린더가 움직이는 기능 실행.
		//시동 여부에 따라 실린더의 상태를 출력합니다.
		System.out.println(isStart()?"실린더가 움직입니다.":"실린더가 움직이지 않습니다.");
	}
	
	void engineStop() { //시동을 끄는 기능입니다.
		if(getSpeed()>0) { //객체의 현재 속도를 확인해서 0 이상이라면 시동을 끌 수 없습니다.
			System.out.println("주행 중에는 시동을 끌 수 없습니다.");
			return;
		}
		if(getMode()!='P') { //속도가 0 이라면 변속기의 모드를 확인합니다.
			System.out.println("P모드로 먼저 변속기를 변경하세요");
			return;
		}
		setStart(false); //변속 모드까지 이상이 없다면 시동 온/오프 여부를 조작한 후 
//		"시동이 꺼졌습니다." 출력문 실행.
		System.out.println("시동이 꺼졌습니다.");
	}

}

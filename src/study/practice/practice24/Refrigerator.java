package study.practice.practice24;

import java.util.ArrayList;

public class Refrigerator {

	String brand;
	int liter;
	int doorCount;
	boolean isPowerOn;
	int temperature;
	
	Icetray iceTray;
	ArrayList<Icetray> iceTrayList;
	
	int maxTemperature;
	int minTemperature;
	public Refrigerator() {
		maxTemperature	= 5;
		minTemperature	= -4;
	}
	
	public void powerOn() {
		isPowerOn=true;
	}
	public int tempUp(int tempValue){	//tempUp(5);
		return this.temperature += tempValue;
	}
	public void tempUp(){	//1도 올리기
		this.temperature += 1;
	}
	public int tempDown(){	//1도 내리고 최종온도 반환
		this.temperature -= 1;
		return temperature;
	}
	public void modifyTemp(int tempValue){	//온도조절
		this.temperature += tempValue;
	}
	public void modifyTemp(boolean isUp){	//
		if(isUp){
		this.temperature += 1;
		}else {
			this.temperature -= 1;
		}
	}
}

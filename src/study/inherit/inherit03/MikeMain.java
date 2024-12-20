package study.inherit.inherit03;

import java.util.ArrayList;
import java.util.List;

public class MikeMain {

	public static void main(String[] args) {

		BluetoothMike m1 = new BluetoothMike();
		m1.volumeUp();
		m1.volumeUp("sdfa");
		
		WirelessMike m2 = new WirelessMike();
		m2.volumeUp();
		
		Mike m3 = new Mike();
		m3.volumeUp();
		
		System.out.println(m1.toString());	//스트링으로써 리턴하는 역할 선언하지 않아도 적용은 됨
		
		System.out.println(m2.toString());
		
		WirelessMike m4 = m2;
		Mike m5 = m1;
		Mike m6 = m2;
		
		Mike m7 =new BluetoothMike();
		Mike m8 = new WirelessMike();
		
		int[] arri = {1,2,3,4,6};
		Mike[] arr = {new Mike(), new BluetoothMike(),new WirelessMike()};
		
//		BluetoothMike[] m1
//		WirelessMike[] m2
//		Mike[] m3
		
//		ArrayList<Mike> list = new ArrayList<Mike>();
//		list.add(new Mike());
//		list.add(new BluetoothMike());
//		list.add(new WirelessMike());
		
		//ArrayList는 List의 하위
		
		List<Mike> list = new ArrayList<Mike>();
		list.add(new Mike());
		list.add(new BluetoothMike());
		list.add(new WirelessMike());
	}
}

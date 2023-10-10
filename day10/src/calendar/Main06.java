package calendar;

import java.util.Calendar;

public class Main06 {

	public static void main(String[] args) {
		// 밀리세컨드
		// 현재 시각에 대한 TimeStamp를 밀리세컨드 단위로 얻기
		Calendar cal = Calendar.getInstance();
		long ms1 = cal.getTimeInMillis();
		System.out.println("파일복사 시작 >> " + ms1);
		
		// 프로그램이 주어진 시간동안 대기하도록 하는 처리
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 처리에 대한 종료 시각 얻기. 타임스탬프를 얻는 또 다른 방법
		long ms2 = System.currentTimeMillis();
		System.out.println("파일복사 끝 >> " + ms2);
		
		// 두 시간의 차이 얻기
		long x = ms2 - ms1;
		System.out.println(x);
		
		// 1/1000초 이므로, 1000으로 나누면 소요 시간을 얻을 수 있음
		long y = x / 1000;
		System.out.println(y + " 초 지났음");
		
		
	}

}


















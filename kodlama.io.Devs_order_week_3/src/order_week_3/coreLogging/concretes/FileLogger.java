package order_week_3.coreLogging.concretes;

import order_week_3.coreLogging.abstracts.Ilogger;

public class FileLogger implements Ilogger{

	@Override
	public void log(String data) {
		System.out.println("File a loglandı " + data);
		
	}

}

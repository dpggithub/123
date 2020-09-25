package cn.itcast.bankqueue;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

/**
 * û�а�VIP���ںͿ��ٴ����������࣬����Ϊʵ��ҵ���е���ͨ���ڿ�����ʱ������ΪVIP���ںͿ��ٴ��ڡ�
 * */
public class ServiceWindow {
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getLogger("cn.itcast.bankqueue");
	private CustomerType type = CustomerType.COMMON;
	private int number = 1;

	public CustomerType getType() {
		return type;
	}

	public void setType(CustomerType type) {
		this.type = type;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public void start(){
		Executors.newSingleThreadExecutor().execute(
				new Runnable(){
					public void run(){
						//��������д��������Ч�ʵͣ�����ǰ�while����case����
						while(true){
							switch(type){
								case COMMON:
									commonService();
									break;
								case EXPRESS:
									expressService();
									break;
								case VIP:
									vipService();
									break;
							}
						}
					}
				}
		);
	}
	
	private void commonService(){
		String windowName = "��" + number + "��" + type + "����";		
		System.out.println(windowName + "��ʼ��ȡ��ͨ����!");
		Integer serviceNumber = NumberMachine.getInstance().getCommonManager().fetchNumber();		
		if(serviceNumber != null ){
			System.out.println(windowName + "��ʼΪ��" + serviceNumber + "����ͨ�ͻ�����");		
			int maxRandom = Constants.MAX_SERVICE_TIME - Constants.MIN_SERVICE_TIME;
			int serviceTime = new Random().nextInt(maxRandom)+1 + Constants.MIN_SERVICE_TIME;
	
			try {
				Thread.sleep(serviceTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			System.out.println(windowName + "���Ϊ��" + serviceNumber + "����ͨ�ͻ������ܹ���ʱ" + serviceTime/1000 + "��");		
		}else{
			System.out.println(windowName + "û��ȡ����ͨ�������ڿ���һ��");		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}				
		}
	}
	
	private void expressService(){
		Integer serviceNumber = NumberMachine.getInstance().getExpressManager().fetchNumber();
		String windowName = "��" + number + "��" + type + "����";	
		System.out.println(windowName + "��ʼ��ȡ��������!");		
		if(serviceNumber !=null){
			System.out.println(windowName + "��ʼΪ��" + serviceNumber + "�ſ��ٿͻ�����");			
			int serviceTime = Constants.MIN_SERVICE_TIME;
			try {
				Thread.sleep(serviceTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
			System.out.println(windowName + "���Ϊ��" + serviceNumber + "�ſ��ٿͻ������ܹ���ʱ" + serviceTime/1000 + "��");		
		}else{
			System.out.println(windowName + "û��ȡ����������");				
			commonService();
		}
	}
	
	private void vipService(){

		Integer serviceNumber = NumberMachine.getInstance().getVipManager().fetchNumber();
		String windowName = "��" + number + "��" + type + "����";	
		System.out.println(windowName + "��ʼ��ȡVIP����!");			
		if(serviceNumber !=null){
			System.out.println(windowName + "��ʼΪ��" + serviceNumber + "��VIP�ͻ�����");			
			int maxRandom = Constants.MAX_SERVICE_TIME - Constants.MIN_SERVICE_TIME;
			int serviceTime = new Random().nextInt(maxRandom)+1 + Constants.MIN_SERVICE_TIME;
			try {
				Thread.sleep(serviceTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
			System.out.println(windowName + "���Ϊ��" + serviceNumber + "��VIP�ͻ������ܹ���ʱ" + serviceTime/1000 + "��");		
		}else{
			System.out.println(windowName + "û��ȡ��VIP����");				
			commonService();
		}	
	}
}

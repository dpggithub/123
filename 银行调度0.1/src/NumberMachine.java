package cn.itcast.bankqueue;

/**һ������ģʽ���壺

����ģʽȷ��ĳ����ֻ��һ��ʵ������������ʵ������������ϵͳ�ṩ���ʵ�����ڼ����ϵͳ�У��̳߳ء����桢��־���󡢶Ի��򡢴�ӡ�����Կ�������������󳣱���Ƴɵ�������ЩӦ�ö������پ�����Դ�������Ĺ��ܡ�ÿ̨��������������ɸ���ӡ������ֻ����һ��Printer Spooler���Ա���������ӡ��ҵͬʱ�������ӡ���С�ÿ̨���������������ͨ�Ŷ˿ڣ�ϵͳӦ�����й�����Щͨ�Ŷ˿ڣ��Ա���һ��ͨ�Ŷ˿�ͬʱ����������ͬʱ���á���֮��ѡ����ģʽ����Ϊ�˱��ⲻһ��״̬������������ͷ��

��������ģʽ�ص㣺
����1��������ֻ����һ��ʵ����
����2������������Լ������Լ���Ψһʵ����
����3�������������������������ṩ��һʵ����

����ģʽ��֤��ȫ�ֶ����Ψһ�ԣ�����ϵͳ������ȡ�����ļ�����Ҫ������֤���õ�һ���ԡ�

�����̰߳�ȫ������

һ�����ڻ�ȡ������ʱ��Ҫ��֤���ܲ������ʵ�����󣬺������ϸ��������ʵ�ַ�ʽ��

��һ���棬��ʹ�õ��������ʱ��Ҫע�ⵥ�������ڵ�ʵ�������ǻᱻ���̹߳���ģ��Ƽ�ʹ����״̬�Ķ��󣬲�����Ϊ����̵߳Ľ�����ȶ��ƻ�����״̬�����̰߳�ȫ���⣬�������ǳ��õ�VO��DTO�ȣ��ֲ����������û�ջ�еģ������û�ջ��������߳�˽�е��ڴ��������Բ������̰߳�ȫ���⣩��
*/
//����ʽ����ģʽ
public class NumberMachine {
	
	private NumberMachine(){}
	private static NumberMachine instance = new NumberMachine();
	public static NumberMachine getInstance(){
		return instance;
	}
	
	private NumberManager commonManager = new NumberManager();
	private NumberManager expressManager = new NumberManager();
	private NumberManager vipManager = new NumberManager();
	public NumberManager getCommonManager() {
		return commonManager;
	}
	public NumberManager getExpressManager() {
		return expressManager;
	}
	public NumberManager getVipManager() {
		return vipManager;
	}
	
}

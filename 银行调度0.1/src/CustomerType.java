package cn.itcast.bankqueue;

public enum CustomerType {
	COMMON,EXPRESS,VIP;
	public String toString(){
		String name = null;
		switch(this){
		case COMMON:
			name = "��ͨ";
			break;
		case EXPRESS:
			name = "����";
			break;
		case VIP:
			name = name();
			break;
		}
		return name;
	}
}

package cn.itcast.bankqueue;

public enum CustomerType {
	COMMON,EXPRESS,VIP;
	public String toString(){
		String name = null;
		switch(this){
		case COMMON:
			name = "ÆÕÍ¨";
			break;
		case EXPRESS:
			name = "¿ìËÙ";
			break;
		case VIP:
			name = name();
			break;
		}
		return name;
	}
}

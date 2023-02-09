
public class Drink {
	private int type;
	private char size;
	
	public Drink (int type, char size){
		this.type = type;
		this.size = size;
	}
	public  Drink() {
		this.type = 0;
		this.size = ' ';
	}
	public String getTypeName() {
		return type==1?"Hot":type==2?"Cold":"";
	}
	public int getTypePrice() {
		return type==1?10:type==2?20:0;
	}
	public String getSizeName() {
		return type=='s'?"Small":type=='m'?"Medium":type=='s'?"Large":"";
	}
	public int getSizePrice() {
		return type=='s'?15:type=='m'?20:type=='s'?25:0;
	}
	public int getTotalPrice() {
		return getTypePrice()+getSizePrice();
	}
}



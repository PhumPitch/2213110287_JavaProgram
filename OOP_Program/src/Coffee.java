
public class Coffee extends Drink {
 private int typeCoffee ;
 private char sizeCoffee;
 private Barista barista;
 
 public Coffee(int type, char sizeCoffee, int typeCoffee,Barista barista) {
	 super(type,sizeCoffee);
	 this.sizeCoffee = sizeCoffee;
	 this.typeCoffee = typeCoffee;
	 this.barista = barista;
	 
 }
 public Coffee(int type, char sizeCoffee) {
	 super(type,sizeCoffee);
	 this.sizeCoffee = sizeCoffee;
	 typeCoffee = 0;
	 barista = null;
 }
 
	public String getTypeName() {
		return typeCoffee==1?"Americano":typeCoffee==2?"Espresso":typeCoffee==3?"Cappuccino":"";
	}
	public int getTypePrice() {
		return typeCoffee==1?50:typeCoffee==2?55:typeCoffee==3?65:0;
	}
	public String getSizeName() {
		return typeCoffee=='s'?"Short":typeCoffee=='t'?"Tall":typeCoffee=='g'?"Grande":typeCoffee=='v'?"Venti":"";
	}
	public int getSizePrice() {
		return typeCoffee=='s'?100:typeCoffee=='t'?150:typeCoffee=='g'?200:typeCoffee=='v'?250:0;
	}
	public int getTotalPrice() {
		return getTypePrice()+getSizePrice()+super.getTotalPrice();
	}
	public String toString() {
		return super.getTypeName()+" "+getTypeName()+ "(" +
	}
}


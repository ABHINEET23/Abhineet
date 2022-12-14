package test;

public class Category {
	
	int catId;
	String catName;
	Category(int a,String cName){
		catId=a;
		catName=cName;
	}

}

 class Items extends Category
{
	int itemId;
	String itemName;
	double price;
	
	Items(int a,String s,int i,String name,double rate)
	{
		super(a,s);
		itemId=i;
		itemName=name;
		price=rate;
		
	}
	
	void displayItems() {
		System.out.println("Item Category Id :-"+super.catId+"  "+"Category Name:-"+super.catName+"  "+ " ItemId:-"+itemId+" "+"Item Name:-"+itemName+"  "+"Item Price:-"+price);
	}
}



package test;

 class Item {

	public static void main(String s[])
	{
		Items itemClass = new Items(123,"Mobile",1111,"Samsung",25456.00);
		itemClass.displayItems();
	}
}
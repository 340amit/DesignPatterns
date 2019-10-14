
package designpatterns.creational.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder builder=new LunchOrder.Builder();
		builder.bread("bread").bread("bread1").condiments("condiments").dressing("dressing").meat("meat");
		
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
		

	}

}

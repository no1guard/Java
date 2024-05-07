package object.oriented.programming;
/*
 * - kind : String		// 종류
- name : String		// 이름
- flavor : String		// 맛
- numOf : int            // 개수
- price : int              // 가격

*/
public class Snack {

	private String kind;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getNumof() {
		return numof;
	}
	public void setNumof(int numof) {
		this.numof = numof;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String name;
	private String flavor;
	private int numof;
	private int price;
//메서드
	//생성자 기본
	public Snack() {
		
	}
	//생성자 필수 
	public Snack(String kind,String name,String flavor,int numOf,int price) {
		this.kind=kind;
		this.name=name;
		this.flavor=flavor;
		this.numof=numof;
		this.price=price;
	}
	//void 반환x 출력만해주는 애들 전달해주는애들 
	/*public void information() {
		System.out.println("종류 : "+kind);
		System.out.println("이름 : "+name);
		System.out.println("맛 :"+flavor);
		System.out.println("개수 :"+numof);
		System.out.println("가격 :"+price);
	}*/
	
	//retrun : String 값 전달 
	public String information() {
		return "종류 : "+kind+", 이름: "+name+",맛 : "+flavor+", 개수 :"+numof+",가격 : "
	+price;
		}
}
 
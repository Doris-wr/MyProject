package 图书排序;
import java.util.Comparator;
public class PriceComparator implements Comparator<Book>{
	boolean asc;
	public PriceComparator(boolean asc) {
		this.asc=asc;
	}
	@Override
	public int compare(Book o1, Book o2) {
		// TODO 自动生成的方法存根
		if(asc) {
			return o1.price-o2.price;
		}else {
			return o2.price-o1.price;
		}
	}
}

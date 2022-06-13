package anuj;

public class PlatinumAccount extends GoldAccount {
	@Override
	public void checkBook() {
		System.out.println("unlimited/year");
	}
	@Override
	public void rateOfInterest() {
		System.out.println("6% P.A");
	}
	public static void main() {
		GoldAccount g = new GoldAccount();
		g.onlinebanking();
		g.checkBook();
		g.rateOfInterest();
		PlatinumAccount p = new PlatinumAccount();
		p.onlinebanking();
		p.checkBook();
		p.rateOfInterest();
		
	}
}

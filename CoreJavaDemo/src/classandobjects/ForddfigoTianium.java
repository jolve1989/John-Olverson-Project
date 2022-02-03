package classandobjects;

public class ForddfigoTianium extends fordfigo {
	String popAirBags( ) {
		return "airbags are popped";
	}
	@Override
	String applyBreak() {
		//have to be the first line
		super.applyBreak();
		return "ABS break applied";
	}

}

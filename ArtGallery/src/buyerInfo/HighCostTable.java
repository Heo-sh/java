package buyerInfo;

import java.util.ArrayList;

public class HighCostTable {
	ArrayList<Integer> costs = new ArrayList<Integer>();
	int highcost;
	public HighCostTable(String cost) {
		costs.add(Integer.parseInt(cost));
		
//		for(int m : costs) {
//			System.out.println(m + " " + costs.size());
//		}
		
		highcost = Integer.parseInt(cost);
		
		for (int i = 0; i < costs.size(); i++) {
			if (highcost > costs.get(i)) {
				highcost = costs.get(i);
			}
			System.out.println(highcost);
		}
		
		for (int m : costs) {
			System.out.println(m + " " + costs.size());
		}
	}
}

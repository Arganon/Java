package hw.stones.necklace.entity;

import java.util.ArrayList;

import hw.stones.chain.entity.Chain;
import hw.stones.entity.Material;

public class Necklace {
	Chain chain;
	ArrayList<Material> stones = new ArrayList<Material>();
	
	public void addStone(Material stone) {
		stones.add(stone);
	}
	
	public void setChain(Chain chain) {
		this.chain = chain;
	}
	
	public Chain getChain() {
		return chain;
	}

	public ArrayList<Material> getStones() {
		return stones;
	}

	public void setStones(ArrayList<Material> stones) {
		this.stones = stones;
	}
	@Override
	public String toString() {
		String info = getChain().toString();
		double totalPrice = getChain().getTotalPrice();
		double totalStonesWeight = 0L;
		
		for (int i = 0; i < getStones().size(); ++i) {
			info += getStones().get(i).toString();
			totalPrice += getStones().get(i).getTotalPrice();
			totalStonesWeight += getStones().get(i).getWeight();
		}
		return "Necklace consists of:\n" + info + "\nNecklace total price = " + totalPrice + 
				"\nChain total weight = " + getChain().getWeight() + "\nStones total weight = " + totalStonesWeight;
	}
}

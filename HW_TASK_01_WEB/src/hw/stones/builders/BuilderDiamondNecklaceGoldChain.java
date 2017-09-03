package hw.stones.builders;

import hw.stones.chain.entity.Chain;
import hw.stones.entity.Precious;
import hw.stones.entity.SemiPrecious;
import hw.stones.enums.Color;
import hw.stones.enums.Cut;
import hw.stones.enums.MaterialTypeChain;
import hw.stones.enums.MaterialTypePreciousStones;
import hw.stones.enums.MaterialTypeSemiPreciousStones;
import hw.stones.enums.ProbeMetric;
import hw.stones.enums.Transparency;
import hw.stones.enums.Сlarity;
import hw.stones.interfaces.PreciousAndSemiPreciousStones;

public class BuilderDiamondNecklaceGoldChain extends NecklaceBuilder implements PreciousAndSemiPreciousStones {	
	@Override
	public void makeChain() {
		necklace.setChain(new Chain(50, 10, Transparency.OPAQUE, MaterialTypeChain.GOLD,
				ProbeMetric.M585));
	}
	
	public void setStones() {
		makePreciousStone();
		makeSemiPreciousStone();
	}

	@Override
	public void makePreciousStone() {
		necklace.addStone(new Precious(4, 150, Color.BLUE, Transparency.TRANSPARENT, 
				MaterialTypePreciousStones.BRILLIANT, Сlarity.FL, Cut.ROUND));
		necklace.addStone(new Precious(5, 150, Color.BLUE, Transparency.TRANSPARENT, 
				MaterialTypePreciousStones.BRILLIANT, Сlarity.FL, Cut.BAGUETTE));
		necklace.addStone(new Precious(4, 150, Color.BLUE, Transparency.TRANSPARENT, 
				MaterialTypePreciousStones.BRILLIANT, Сlarity.FL, Cut.ROUND));
		necklace.addStone(new Precious(2, 70, Color.RED, Transparency.TRANSPARENT, 
				MaterialTypePreciousStones.RUBY, Сlarity.FL, Cut.ROUND));
		necklace.addStone(new Precious(2, 70, Color.RED, Transparency.TRANSPARENT, 
				MaterialTypePreciousStones.RUBY, Сlarity.VVS1, Cut.ROUND));
		necklace.addStone(new Precious(2, 70, Color.RED, Transparency.TRANSPARENT, 
				MaterialTypePreciousStones.RUBY, Сlarity.VVS1, Cut.ROUND));
	}

	@Override
	public void makeSemiPreciousStone() {
		necklace.addStone(new SemiPrecious(4, 20, Color.SAPPHIRINE, Transparency.OPAQUE, 
				MaterialTypeSemiPreciousStones.AGATE, Cut.ROUND));
		necklace.addStone(new SemiPrecious(3, 20, Color.SAPPHIRINE, Transparency.OPAQUE, 
				MaterialTypeSemiPreciousStones.AGATE, Cut.MARKIZ));
		necklace.addStone(new SemiPrecious(3, 20, Color.SAPPHIRINE, Transparency.OPAQUE, 
				MaterialTypeSemiPreciousStones.AGATE, Cut.MARKIZ));
		necklace.addStone(new SemiPrecious(4, 20, Color.SAPPHIRINE, Transparency.OPAQUE, 
				MaterialTypeSemiPreciousStones.AGATE, Cut.ROUND));
	}
}

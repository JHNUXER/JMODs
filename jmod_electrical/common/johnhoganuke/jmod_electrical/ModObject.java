package johnhoganuke.jmod_electrical;

import static net.minecraftforge.common.Configuration.CATEGORY_BLOCK;
import static net.minecraftforge.common.Configuration.CATEGORY_ITEM;
import net.minecraftforge.common.Configuration;
// import johnhoganuke.util.lang

public enum ModObject {
  // Machines
  blockCoalGenerator(++Config.BID, CATEGORY_BLOCK),
  blockPoweredFurnace(++Config.BID, CATEGORY_BLOCK),
  
  // Wires
  blockCopperWire(++Config.BID, CATEGORY_BLOCK),
  
  // Ores
  blockCopperOre(++Config.BID, CATEGORY_BLOCK),
  
  // Blocks
  blockCopper(++Config.BID, CATEGORY_BLOCK),
  
  // Tools
  itemWrench(++Config.IID, CATEGORY_ITEM),
  
  // Items
  itemCopperIngot(++Config.IID, CATEGORY_ITEM),
  
    public final String unlocalisedName;
  public final String name;
  public final int defaultId;
  public final String category;
  public int id;
  public int actualId;

  private ModObject(int defaultId, String category) {
    this.unlocalisedName = "jmod_electrical:" + toString();
    this.defaultId = defaultId;
    this.name = Lang.localize(name());
    this.category = category;
    id = -1;
    actualId = -1;
  }

  void load(Configuration config) {
    if(CATEGORY_ITEM.equals(category)) {
      id = config.getItem(unlocalisedName, defaultId).getInt();
    } else if(CATEGORY_BLOCK.equals(category)) {
      id = config.getBlock(unlocalisedName, defaultId).getInt();
    } else {
      throw new RuntimeException("Unknown category " + category);
    }
    actualId = id;
    if(CATEGORY_ITEM.equals(category)) {
      actualId += 256;
    }
  }


}

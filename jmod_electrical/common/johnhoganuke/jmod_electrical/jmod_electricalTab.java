package johnhoganuke.jmod_electrical;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class jmod_electricalTab extends CreativeTabs {
  public static final CreativeTabs tabjmod_electrical = new jmod_electricalTab();
  
  public jmod_electricalTab() {
    super("Jmod Electrical");
  }
  
  /*
    the item ID for the item to be displayed on the tab.
  */
  @Override
  public int getTabIconItemIndex() {
    return jmod_electrical.itemWrench.itemID;
  }
  
  @Override
  @SideOnly(Side.CLIENT)
  public String getTabLabel() {
    return "Jmod Electrical";
  }
  
  @Override
  @SideOnly(Side.CLIENT)
  public String getTranslatedTabLabel() {
    return "Jmod Electrical";
  }
}

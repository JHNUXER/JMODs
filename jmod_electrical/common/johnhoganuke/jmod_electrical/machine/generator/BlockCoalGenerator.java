package johnhoganuke.jmod_electrical.machine.generator;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import johnhoganuke.jmod_electrical.GuiHandler;
import johnhoganuke.jmod_electrical.ModObject;
import johnhoganuke.jmod_electrical.machine.AbstractMachineBlock;

public class BlockCoalGenerator extends AbstractMachineBlock<TileEntityCoalGenerator> {

  public static BlockCoalGenerator create() {
    BlockCoalGenerator gen = new BlockCoalGenerator();
    gen.init();
    return gen;

  protected BlockCoalGenerator() {
    super(ModObject.blockCoalGenerator, TileEntityCoalGenerator.class);
  }

  @Override
  public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    return new CoalGeneratorContainer(player.inventory, (TileEntityCoalGenerator) world.getBlockTileEntity(x, y, z));
  }

  @Override
  public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    return new GuiCoalGenerator(player.inventory, (TileEntityCoalGenerator) world.getBlockTileEntity(x, y, z));
  }

  @Override
  protected int getGuiId() {
    return GuiHandler.GUI_ID_COAL_GEN;
  }

  @Override
  protected String getMachineFrontIconKey(boolean active) {
    if(active) {
      return "jmod_electrical:coalGenFrontOn";
    }
    return "jmod_electrical:coalGenFrontOff";
  }

  @Override
  protected String getSideIconKey(boolean active) {
    return "jmod_electrical:coalGenSide";
  }

}

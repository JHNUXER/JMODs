package johnhoganuke.jmod_electrical.machine.generator;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import johnhoganuke.jmod_electrical.machine.AbstractMachineContainer;
import johnhoganuke.enderio.machine.AbstractMachineEntity;

public class CoalGeneratorContainer extends AbstractMachineContainer {

  public CoalGeneratorContainer(InventoryPlayer playerInv, AbstractMachineEntity te) {
    super(playerInv, te);
  }

  @Override
  protected void addMachineSlots(InventoryPlayer playerInv) {
    addSlotToContainer(new Slot(tileEntity, 0, 80, 34) {
      @Override
      public boolean isItemValid(ItemStack itemStack) {
        return tileEntity.isItemValidForSlot(0, itemStack);
      }
    });
  }

}

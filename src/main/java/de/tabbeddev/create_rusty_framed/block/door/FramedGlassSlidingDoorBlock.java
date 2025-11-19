package de.tabbeddev.create_rusty_framed.block.door;

import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock;
import de.tabbeddev.create_rusty_framed.registry.CreateFramedEntityTypes;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class FramedGlassSlidingDoorBlock extends SlidingDoorBlock {
    public FramedGlassSlidingDoorBlock(Properties properties) {
        super(properties, GLASS_SET_TYPE.get(), false);
    }

    @Override
    public BlockEntityType<? extends FramedGlassSlidingDoorBlockEntity> getBlockEntityType() {
        return CreateFramedEntityTypes.SLIDING_DOOR.get();
    }
}

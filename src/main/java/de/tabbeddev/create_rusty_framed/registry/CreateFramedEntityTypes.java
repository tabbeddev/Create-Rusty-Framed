package de.tabbeddev.create_rusty_framed.registry;

import com.tterrag.registrate.util.entry.BlockEntityEntry;
import de.tabbeddev.create_rusty_framed.block.door.FramedGlassSlidingDoorBlockEntity;
import de.tabbeddev.create_rusty_framed.block.door.FramedGlassSlidingDoorRenderer;

import static de.tabbeddev.create_rusty_framed.CreateFramedMod.REGISTRATE;

public class CreateFramedEntityTypes {

    public static final BlockEntityEntry<FramedGlassSlidingDoorBlockEntity> SLIDING_DOOR =
            REGISTRATE.blockEntity("sliding_door", FramedGlassSlidingDoorBlockEntity::new)
                    .renderer(() -> FramedGlassSlidingDoorRenderer::new)
                    .validBlocks(
                            CreateFramedBlocks.RED.getGlassDoorBlock(), CreateFramedBlocks.ORANGE.getGlassDoorBlock(), CreateFramedBlocks.YELLOW.getGlassDoorBlock(),
                            CreateFramedBlocks.GREEN.getGlassDoorBlock(), CreateFramedBlocks.LIME.getGlassDoorBlock(), CreateFramedBlocks.BLUE.getGlassDoorBlock(),
                            CreateFramedBlocks.LIGHT_BLUE.getGlassDoorBlock(), CreateFramedBlocks.CYAN.getGlassDoorBlock(), CreateFramedBlocks.PURPLE.getGlassDoorBlock(),
                            CreateFramedBlocks.MAGENTA.getGlassDoorBlock(), CreateFramedBlocks.PINK.getGlassDoorBlock(), CreateFramedBlocks.BLACK.getGlassDoorBlock(),
                            CreateFramedBlocks.GRAY.getGlassDoorBlock(), CreateFramedBlocks.LIGHT_GRAY.getGlassDoorBlock(), CreateFramedBlocks.WHITE.getGlassDoorBlock(),
                            CreateFramedBlocks.BROWN.getGlassDoorBlock(), CreateFramedBlocks.TINTED.getTintedGlassDoor()
                    )
                    .register();

    public static void register() {}
}

package net.canadiangamer.randommod.item;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.Random;

public class AirpodsArmorItem extends ArmorItem {

    private static final SoundEvent[] SONGS = new SoundEvent[]{
            SoundEvents.MUSIC_DISC_13.value(),
            SoundEvents.MUSIC_DISC_CAT.value(),
            SoundEvents.MUSIC_DISC_BLOCKS.value(),
            SoundEvents.MUSIC_DISC_CHIRP.value(),
            SoundEvents.MUSIC_DISC_MALL.value(),
            SoundEvents.MUSIC_DISC_MELLOHI.value(),
            SoundEvents.MUSIC_DISC_PIGSTEP.value()
    };

    private final Random random = new Random();
    private int currentSongIndex = -1;

    public AirpodsArmorItem(RegistryEntry<ArmorMaterial> materialEntry, Type type, Settings settings) {
        super(materialEntry, type, settings);
    }


    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        if (!world.isClient) return;

        ItemStack head = player.getEquippedStack(EquipmentSlot.HEAD);
        if (head.getItem() != this) return;

        currentSongIndex = (currentSongIndex + 1) % SONGS.length;
        SoundEvent nextSong = SONGS[currentSongIndex];

        // Play music disc
        MinecraftClient.getInstance().getSoundManager()
                .play(PositionedSoundInstance.music(nextSong));

        player.sendMessage(Text.literal("🎵 Now playing: " + nextSong.getId()), true);
    }
}

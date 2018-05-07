package com.hbm.items.tool;

import com.hbm.inventory.gui.GUIScreenSatInterface;
import com.hbm.items.ModItems;
import com.hbm.main.MainRegistry;
import com.hbm.saveddata.SatelliteSavedData;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSatInterface extends ItemSatChip {

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		
		
		if(world.isRemote)
			player.openGui(MainRegistry.instance, ModItems.guiID_item_sat_interface, world, 0, 0, 0);
		
		return stack;
	}
	
    public void onUpdate(ItemStack stack, World world, Entity entity, int i, boolean b) {

		if(!world.isRemote) {
		    SatelliteSavedData data = (SatelliteSavedData)entity.worldObj.perWorldStorage.loadData(SatelliteSavedData.class, "satellites");
			GUIScreenSatInterface.satData = data;
		}
    }

}
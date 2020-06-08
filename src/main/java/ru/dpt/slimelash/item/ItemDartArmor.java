
package ru.dpt.slimelash.item;

import ru.dpt.slimelash.ElementsSlimeLash;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsSlimeLash.ModElement.Tag
public class ItemDartArmor extends ElementsSlimeLash.ModElement {
	@GameRegistry.ObjectHolder("slimelash:dartarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("slimelash:dartarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("slimelash:dartarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("slimelash:dartarmorboots")
	public static final Item boots = null;
	public ItemDartArmor(ElementsSlimeLash instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DARTARMOR", "slimelash:diamond_", 25, new int[]{2, 5, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("dartarmorhelmet")
				.setRegistryName("dartarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("dartarmorbody")
				.setRegistryName("dartarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("dartarmorlegs")
				.setRegistryName("dartarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("dartarmorboots")
				.setRegistryName("dartarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("slimelash:dartarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("slimelash:dartarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("slimelash:dartarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("slimelash:dartarmorboots", "inventory"));
	}
}

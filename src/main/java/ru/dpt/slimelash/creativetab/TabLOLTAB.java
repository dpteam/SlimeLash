
package ru.dpt.slimelash.creativetab;

import ru.dpt.slimelash.ElementsSlimeLash;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

@ElementsSlimeLash.ModElement.Tag
public class TabLOLTAB extends ElementsSlimeLash.ModElement {
	public TabLOLTAB(ElementsSlimeLash instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabloltab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.FIRE, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}

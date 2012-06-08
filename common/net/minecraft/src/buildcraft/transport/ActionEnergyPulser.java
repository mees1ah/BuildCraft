package net.minecraft.src.buildcraft.transport;

import net.minecraft.src.BuildCraftCore;
import net.minecraft.src.buildcraft.api.Action;
import net.minecraft.src.buildcraft.core.DefaultProps;

public class ActionEnergyPulser extends Action {

	public ActionEnergyPulser(int id) {
		super(id);
	}

	@Override
	public int getIndexInTexture() {
		return 4 * 16 + 0;
	}

	@Override
	public String getTexture() {
		return DefaultProps.TEXTURE_TRIGGERS;
	}

	@Override
	public String getDescription() {
		return "Energy Pulser";
	}

}

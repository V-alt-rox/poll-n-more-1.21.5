package com.pnm.valtrox.items.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.UseAction;

public class new_milk
{
    public UseAction getUseAction(ItemStack stack)
    {
        return UseAction.DRINK;
    }
}

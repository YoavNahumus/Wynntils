/*
 * Copyright © Wynntils 2022.
 * This file is released under AGPLv3. See LICENSE for full license details.
 */
package com.wynntils.wc.objects.item.render;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.world.inventory.Slot;

public interface TextOverlayItem {
    String getTextOverlay(Screen screen, Slot slot);

    int getTextColor(Screen screen, Slot slot);

    int getTextXOffset(Screen screen, Slot slot);

    int getTextYOffset(Screen screen, Slot slot);
}

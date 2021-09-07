/*
 * This file is part of adventure-platform, licensed under the MIT License.
 *
 * Copyright (c) 2018-2020 KyoriPowered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.kyori.adventure.text.serializer.craftbukkit;

import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.jetbrains.annotations.NotNull;

/**
 * A pair of component serializers for {@link org.bukkit.Bukkit}.
 *
 * @since 4.0.0
 * @deprecated for removal, use {@link net.kyori.adventure.platform.bukkit.BukkitComponentSerializer} instead
 */
@Deprecated
public final class BukkitComponentSerializer {
  private BukkitComponentSerializer() {
  }

  /**
   * Gets the legacy component serializer.
   *
   * @return a legacy component serializer
   * @since 4.0.0
   */
  public static @NotNull LegacyComponentSerializer legacy() {
    return net.kyori.adventure.platform.bukkit.BukkitComponentSerializer.legacy();
  }

  /**
   * Gets the gson component serializer.
   *
   * <p>Not available on servers before 1.8, will be {@code null}.</p>
   *
   * @return a gson component serializer
   * @since 4.0.0
   */
  public static @NotNull GsonComponentSerializer gson() {
    return net.kyori.adventure.platform.bukkit.BukkitComponentSerializer.gson();
  }
}

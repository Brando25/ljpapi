/*
 * ljpapi - Libre Java Pathfinding API
 * Copyright (C) 2015 Delwink, LLC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, version 3 only.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.delwink.ljp;

/**
 * The size of an entity.
 * @author David McMackins II
 */
public enum Size {
    FINE(8, -1, 8, 16, 0.5f),
    DIMINUTIVE(4, -4, 6, 12, 1.0f),
    TINY(2, -2, 4, 8, 2.5f),
    SMALL(1, -1, 2, 4, 5.0f),
    MEDIUM(0, 0, 0, 0, 5.0f),
    LARGE(-1, 1, -2, -4, 10.0f),
    HUGE(-2, 2, -4, -8, 15.0f),
    GARGANTUAN(-4, 4, -6, -12, 20.0f),
    COLOSSAL(-8, 8, -8, -16, 30.0f);
    
    public final int SIZE, SPECIAL, FLY, STEALTH;
    public final float SPACE;
    
    private Size(int size, int special, int fly, int stealth, float space) {
        SIZE = size;
        SPECIAL = special;
        FLY = fly;
        STEALTH = stealth;
        SPACE = space;
    }
}

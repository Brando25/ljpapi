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
 * An alignment of a character.
 * @author David McMackins II
 */
public enum Alignment {
    LAWFUL_GOOD(Alignment.LAWFUL, Alignment.GOOD),
    LAWFUL_NEUTRAL(Alignment.LAWFUL, Alignment.NEUTRAL),
    LAWFUL_EVIL(Alignment.LAWFUL, Alignment.EVIL),
    NEUTRAL_GOOD(Alignment.NEUTRAL, Alignment.GOOD),
    TRUE_NEUTRAL(Alignment.NEUTRAL, Alignment.NEUTRAL),
    NEUTRAL_EVIL(Alignment.NEUTRAL, Alignment.EVIL),
    CHAOTIC_GOOD(Alignment.CHAOTIC, Alignment.GOOD),
    CHAOTIC_NEUTRAL(Alignment.CHAOTIC, Alignment.NEUTRAL),
    CHAOTIC_EVIL(Alignment.CHAOTIC, Alignment.EVIL);
    
    public static final int LAWFUL = 1, CHAOTIC = 2, GOOD = 3, EVIL = 4;
    public static final int NEUTRAL = 0;
    
    public final int LC, GE;

    private Alignment(int lc, int ge) {
        LC = lc;
        GE = ge;
    }
}

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
 * Metadata about this library.
 * @author David McMackins II
 */
public class Meta {
    /**
     * Primary version of the library, incremented after an incompatible
     * interface change.
     */
    public static final int MAJOR_VERSION = 0;
    
    /**
     * Secondary version of the library, incremented after an interface change
     * which is compatible with the previous version.
     */
    public static final int MINOR_VERSION = 0;
    
    /**
     * Tertiary version of the library, incremented after a change which does
     * not involve the API itself, such as a bug fix.
     */
    public static final int PATCH = 0;
    
    /**
     * A complete version string based on the version numbers.
     */
    public static final String VERSION = String.format("%d.%d.%d", MAJOR_VERSION, MINOR_VERSION, PATCH);
}

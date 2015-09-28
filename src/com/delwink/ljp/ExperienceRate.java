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
 * Rate of experience gained.
 * @author David McMackins II
 */

public enum ExperienceRate {

    /**
     *
     */
    SLOW,
    MEDIUM,
    FAST;  
    
    private level(enum Rate, int xp){
        int level;
        if(SLOW){
            int[] slow = (3000, 7500, 14000, 23000, 35000, 53000, 77000, 115000, 160000, 
            235000, 330000, 475000, 665000, 955000, 1350000, 2700000, 3850000, 5350000);
            
            for(int i = 0; i<slow.getcomponets;i++){
                if(xp > slow[i] & xp < slow[i+1]){
                    level = i+2;
                }
                else if(xp<slow[0]){
                    level = 1;
                }
                else{
                    level = 20;
                }
            }
        }
        else if(MEDIUM){
            int[] medium = (2000, 5000, 9000, 15000, 23000, 35000, 51000, 75000, 105000,
            155000, 220000, 315000, 445000, 635000, 890000, 1300000, 1800000, 2550000, 3600000);
            
            for(int i = 0; i<medium.getcomponets;i++){
                if(xp > medium[i] & xp < medium[i+1]){
                    level = i+2;
                }
                else if(xp<medium[0]){
                    level = 1;
                }
                else{
                    level = 20;
                }
            }
        }
        else{
            int[] fast = (1300, 3300, 6000, 10000, 15000, 23000, 34000, 50000, 71000, 105000, 
            145000, 210000, 295000, 425000, 600000, 850000, 1200000, 1700000, 2400000);
            
            for(int i = 0; i<fast.getcomponets;i++){
                if(xp > fast[i] & xp < fast[i+1]){
                    level = i+2;
                }
                else if(xp<fast[0]){
                    level = 1;
                }
                else{
                    level = 20;
                }
            }
        }
        return level;
}
}

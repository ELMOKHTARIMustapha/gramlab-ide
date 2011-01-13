/*
 * Unitex
 *
 * Copyright (C) 2001-2011 Université Paris-Est Marne-la-Vallée <unitex@univ-mlv.fr>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA.
 *
 */

package fr.umlv.unitex.cassys;

/**
 * Class defining a row in the table of cassys configuration frame.
 * <p/>
 * A row is made of a <code>String</code> denoting a transducer file name and two <code>Boolean</code> fields
 * indicating whether merge mode and replace mode are selected.
 *
 * @author david nott
 */
class DataList {
    /**
     * Name of the transducer file
     */
    private String name;

    /**
     * Whether the <code>merge</code> option sould be applied
     */
    private boolean merge;

    /**
     * Whether the <code>replace</code> option sould be applied
     */
    private boolean replace;

    /**
     * Three parameters constructor
     *
     * @param n the name
     * @param m whether to merge
     * @param r whether to replace
     */
    public DataList(String n, boolean m, boolean r) {
        name = n;
        merge = m;
        replace = r;
    }

    /**
     * One constructor parameter
     *
     * @param dl datalist object
     */
    public DataList(DataList dl) {
        name = dl.getName();
        merge = dl.isMerge();
        replace = dl.isReplace();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the merge
     */
    public boolean isMerge() {
        return merge;
    }

    /**
     * @param merge the merge to set
     */
    public void setMerge(boolean merge) {
        this.merge = merge;
    }

    /**
     * @return the replace
     */
    public boolean isReplace() {
        return replace;
    }

    /**
     * @param replace the replace to set
     */
    public void setReplace(boolean replace) {
        this.replace = replace;
    }
}
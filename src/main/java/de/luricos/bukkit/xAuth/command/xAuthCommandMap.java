/*
 * xAuth for Bukkit
 * Copyright (C) 2012 Lycano <https://github.com/lycano/xAuth/>
 *
 * Copyright (C) 2011 CypherX <https://github.com/CypherX/xAuth/>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.luricos.bukkit.xAuth.command;

/**
 * @author lycano
 */
public class xAuthCommandMap {

    private String command;
    private xAuthCommandAlias alias;

    public xAuthCommandMap(String command) {
        this(command, null);
    }

    public xAuthCommandMap(String command, xAuthCommandAlias alias) {
        this.command = command.toLowerCase();
        this.alias = alias;
    }

    public String getCommand() {
        return this.command;
    }

    public String getAlias() {
        return this.getCommandAlias().getAlias();
    }

    public xAuthCommandAlias getCommandAlias() {
        return this.alias;
    }


    public boolean hasAlias() {
        return (this.alias != null);
    }
}

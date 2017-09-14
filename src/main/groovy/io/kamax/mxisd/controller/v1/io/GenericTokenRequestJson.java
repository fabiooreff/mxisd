/*
 * mxisd - Matrix Identity Server Daemon
 * Copyright (C) 2017 Maxime Dor
 *
 * https://max.kamax.io/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.kamax.mxisd.controller.v1.io;

import io.kamax.mxisd.mapping.MappingSession;

public abstract class GenericTokenRequestJson implements MappingSession {

    private String client_secret;
    private int send_attempt;
    private String id_server;

    public String getSecret() {
        return client_secret;
    }

    public int getAttempt() {
        return send_attempt;
    }

    public String getServer() {
        return id_server;
    }

}
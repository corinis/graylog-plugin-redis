/**
 * This file is part of Graylog Redis Plugin.
 *
 * Graylog Redis Plugin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog Redis Plugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog Redis Plugin.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.graylog.plugins.redis;

import java.util.Collections;
import java.util.Set;

import org.graylog.plugins.redis.inputs.GELFRedisInput;
import org.graylog.plugins.redis.inputs.RawRedisInput;
import org.graylog.plugins.redis.inputs.SyslogRedisInput;
import org.graylog.plugins.redis.outputs.GELFRedisOutput;
import org.graylog.plugins.redis.transports.RedisTransport;
import org.graylog2.plugin.PluginConfigBean;
import org.graylog2.plugin.PluginModule;

public class RedisModule extends PluginModule {
    @Override
    public Set<? extends PluginConfigBean> getConfigBeans() {
        return Collections.emptySet();
    }

    @Override
    protected void configure() {
        addTransport("redis", RedisTransport.class);

        addMessageInput(GELFRedisInput.class);
        addMessageInput(RawRedisInput.class);
        addMessageInput(SyslogRedisInput.class);

        addMessageOutput(GELFRedisOutput.class);
    }
}

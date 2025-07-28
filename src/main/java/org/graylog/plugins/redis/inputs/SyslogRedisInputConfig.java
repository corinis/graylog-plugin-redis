package org.graylog.plugins.redis.inputs;

import javax.inject.Inject;

import org.graylog.plugins.redis.transports.RedisTransport;
import org.graylog2.inputs.codecs.SyslogCodec;
import org.graylog2.plugin.inputs.MessageInput;
import org.graylog2.plugin.inputs.annotations.ConfigClass;

@ConfigClass
public class SyslogRedisInputConfig extends MessageInput.Config {
    @Inject
    public SyslogRedisInputConfig(RedisTransport.Factory transport, SyslogCodec.Factory codec) {
        super(transport.getConfig(), codec.getConfig());
    }
}
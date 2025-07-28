package org.graylog.plugins.redis.inputs;

import javax.inject.Inject;

import org.graylog.plugins.redis.transports.RedisTransport;
import org.graylog2.inputs.codecs.GelfCodec;
import org.graylog2.plugin.inputs.MessageInput;
import org.graylog2.plugin.inputs.annotations.ConfigClass;

@ConfigClass
public class GELFRedisInputConfig extends MessageInput.Config {
    @Inject
    public GELFRedisInputConfig(RedisTransport.Factory transport, GelfCodec.Factory codec) {
        super(transport.getConfig(), codec.getConfig());
    }
}
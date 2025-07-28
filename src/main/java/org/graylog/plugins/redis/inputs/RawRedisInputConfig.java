package org.graylog.plugins.redis.inputs;

import javax.inject.Inject;

import org.graylog.plugins.redis.transports.RedisTransport;
import org.graylog2.inputs.codecs.RawCodec;
import org.graylog2.plugin.inputs.MessageInput;
import org.graylog2.plugin.inputs.annotations.ConfigClass;

@ConfigClass
public class RawRedisInputConfig extends MessageInput.Config {
    @Inject
    public RawRedisInputConfig(RedisTransport.Factory transport, RawCodec.Factory codec) {
        super(transport.getConfig(), codec.getConfig());
    }
}
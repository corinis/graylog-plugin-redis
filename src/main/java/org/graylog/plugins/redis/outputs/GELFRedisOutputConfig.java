package org.graylog.plugins.redis.outputs;

import org.graylog.plugins.redis.internal.RedisClientConfiguration;
import org.graylog2.plugin.configuration.ConfigurationRequest;
import org.graylog2.plugin.configuration.fields.ConfigurationField;
import org.graylog2.plugin.configuration.fields.TextField;
import org.graylog2.plugin.inputs.annotations.ConfigClass;
import org.graylog2.plugin.outputs.MessageOutput;

@ConfigClass
public class GELFRedisOutputConfig extends MessageOutput.Config {
    @Override
    public ConfigurationRequest getRequestedConfiguration() {
        final RedisClientConfiguration r = new RedisClientConfiguration(super.getRequestedConfiguration());
        r.addField(new TextField(GELFRedisOutput.CK_CHANNEL,
                "Channel",
                "",
                "Name of the channel to publish messages to",
                ConfigurationField.Optional.NOT_OPTIONAL));
        return r;
    }
}
package com.ericsson.jenkinsci.hajp.messages.builds;

import com.ericsson.jenkinsci.hajp.messages.HajpMessage;
import com.ericsson.jenkinsci.hajp.operation.OperationType;
import lombok.Getter;
import net.sf.json.JSONObject;

/**
 * All Build Messages extend from this parent which
 * implements HajpMessage interface ensuring
 * core messaging functionality to exist among
 * job, plugin, core related messages.
 */
public abstract class AbstractBuildMessage implements HajpMessage {
    @Getter protected OperationType operationType;

    /**
     * @return the message object as json string
     */
    @Override public String toString() {
        return JSONObject.fromObject(this).toString();
    }
}

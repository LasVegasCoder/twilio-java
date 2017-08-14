/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.HashMap;
import java.util.Map;

@XmlRootElement(name = "Leave")
public class Leave extends TwiML {
    private Leave() {
        this(new Builder());
    }

    private Leave(Builder b) {
        super(b.options);
    }

    public static class Builder {
        private Map<String, String> options = new HashMap<>();

        public Builder option(String key, String value) {
            this.options.put(key, value);
            return this;
        }

        public Leave build() {
            return new Leave(this);
        }
    }
}
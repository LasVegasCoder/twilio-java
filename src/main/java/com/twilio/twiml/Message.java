/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml;

import com.twilio.http.HttpMethod;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@XmlRootElement(name = "Message")
public class Message extends TwiML {
    @XmlAttribute
    @XmlJavaTypeAdapter(TwiML.ToStringAdapter.class)
    private final com.twilio.type.PhoneNumber to;
    @XmlAttribute
    @XmlJavaTypeAdapter(TwiML.ToStringAdapter.class)
    private final com.twilio.type.PhoneNumber from;
    @XmlAttribute
    @XmlJavaTypeAdapter(TwiML.ToStringAdapter.class)
    private final URI action;
    @XmlAttribute
    @XmlJavaTypeAdapter(TwiML.ToStringAdapter.class)
    private final HttpMethod method;
    @XmlValue
    private final String message;
    @SuppressWarnings("checkstyle:indentation")
    @XmlElements({@XmlElement(name = "Body", type = Body.class), @XmlElement(name = "Media", type = Media.class)})
    private final List<TwiML> children;

    private Message() {
        this(new Builder());
    }

    private Message(Builder b) {
        super(b.options);
        this.to = b.to;
        this.from = b.from;
        this.action = b.action;
        this.method = b.method;
        this.message = b.message;
        this.children = b.children;
    }

    public com.twilio.type.PhoneNumber getTo() {
        return to;
    }

    public com.twilio.type.PhoneNumber getFrom() {
        return from;
    }

    public URI getAction() {
        return action;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public String getMessage() {
        return message;
    }

    public List<TwiML> getChildren() {
        return children;
    }

    public static class Builder {
        private com.twilio.type.PhoneNumber to;
        private com.twilio.type.PhoneNumber from;
        private URI action;
        private HttpMethod method;
        private String message;
        private Map<String, String> options = new HashMap<>();
        private List<TwiML> children = new ArrayList<>();

        public Builder to(com.twilio.type.PhoneNumber to) {
            this.to = to;
            return this;
        }

        public Builder from(com.twilio.type.PhoneNumber from) {
            this.from = from;
            return this;
        }

        public Builder action(URI action) {
            this.action = action;
            return this;
        }

        public Builder method(HttpMethod method) {
            this.method = method;
            return this;
        }

        public Builder body(Body body) {
            this.children.add(body);
            return this;
        }

        public Builder media(Media media) {
            this.children.add(media);
            return this;
        }

        public Builder option(String key, String value) {
            this.options.put(key, value);
            return this;
        }

        public Message build() {
            return new Message(this);
        }
    }
}
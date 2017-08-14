package com.twilio.twiml;

import com.google.common.collect.Lists;
import com.twilio.http.HttpMethod;
import org.junit.Assert;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Test class for {@link Conference}.
 */
public class ConferenceTest {

    @Test
    public void testXml() throws TwiMLException, URISyntaxException {
        Conference conference = new Conference.Builder("my conference")
            .muted(true)
            .startConferenceOnEnter(true)
            .endConferenceOnExit(false)
            .maxParticipants(10)
            .beep(Conference.Beep.FALSE)
            .record(Conference.Record.DO_NOT_RECORD)
            .trim(Conference.Trim.DO_NOT_TRIM)
            .statusCallback(new URI("http://twilio.com"))
            .statusCallbackEvent(Lists.newArrayList(Conference.Event.END, Conference.Event.JOIN))
            .statusCallbackMethod(HttpMethod.GET)
            .waitMethod(HttpMethod.POST)
            .waitUrl(new URI("http://twilio.ca"))
            .build();

        Assert.assertEquals("<Conference muted=\"true\" startConferenceOnEnter=\"true\" endConferenceOnExit=\"false\" maxParticipants=\"10\" beep=\"false\" record=\"do-not-record\" trim=\"do-not-trim\" waitMethod=\"POST\" waitUrl=\"http://twilio.ca\" statusCallbackEvent=\"end join\" statusCallbackMethod=\"GET\" statusCallback=\"http://twilio.com\">my conference</Conference>", conference.toXml());
    }

    @Test
    public void testUrl() throws TwiMLException, URISyntaxException {
        Conference conference = new Conference.Builder("my conference")
            .muted(true)
            .startConferenceOnEnter(true)
            .endConferenceOnExit(false)
            .maxParticipants(10)
            .beep(Conference.Beep.FALSE)
            .record(Conference.Record.DO_NOT_RECORD)
            .trim(Conference.Trim.DO_NOT_TRIM)
            .waitMethod(HttpMethod.POST)
            .waitUrl(new URI("http://twilio.ca"))
            .build();

        Assert.assertEquals("%3CConference+muted%3D%22true%22+startConferenceOnEnter%3D%22true%22+endConferenceOnExit%3D%22false%22+maxParticipants%3D%2210%22+beep%3D%22false%22+record%3D%22do-not-record%22+trim%3D%22do-not-trim%22+waitMethod%3D%22POST%22+waitUrl%3D%22http%3A%2F%2Ftwilio.ca%22%3Emy+conference%3C%2FConference%3E", conference.toUrl());
    }

    @Test
    public void testOptionsXml() throws TwiMLException, URISyntaxException {
        Conference conference = new Conference.Builder("my conference")
            .muted(true)
            .startConferenceOnEnter(true)
            .endConferenceOnExit(false)
            .maxParticipants(10)
            .beep(Conference.Beep.FALSE)
            .record(Conference.Record.DO_NOT_RECORD)
            .trim(Conference.Trim.DO_NOT_TRIM)
            .waitMethod(HttpMethod.POST)
            .waitUrl(new URI("http://twilio.ca"))
            .option("foo", "bar")
            .build();

        Assert.assertEquals("<Conference muted=\"true\" startConferenceOnEnter=\"true\" endConferenceOnExit=\"false\" maxParticipants=\"10\" beep=\"false\" record=\"do-not-record\" trim=\"do-not-trim\" waitMethod=\"POST\" waitUrl=\"http://twilio.ca\" foo=\"bar\">my conference</Conference>", conference.toXml());
    }

    @Test
    public void testOptionsUrl() throws TwiMLException, URISyntaxException {
        Conference conference = new Conference.Builder("my conference")
            .muted(true)
            .startConferenceOnEnter(true)
            .endConferenceOnExit(false)
            .maxParticipants(10)
            .beep(Conference.Beep.FALSE)
            .record(Conference.Record.DO_NOT_RECORD)
            .trim(Conference.Trim.DO_NOT_TRIM)
            .waitMethod(HttpMethod.POST)
            .waitUrl(new URI("http://twilio.ca"))
            .option("foo", "bar")
            .build();

        Assert.assertEquals("%3CConference+muted%3D%22true%22+startConferenceOnEnter%3D%22true%22+endConferenceOnExit%3D%22false%22+maxParticipants%3D%2210%22+beep%3D%22false%22+record%3D%22do-not-record%22+trim%3D%22do-not-trim%22+waitMethod%3D%22POST%22+waitUrl%3D%22http%3A%2F%2Ftwilio.ca%22+foo%3D%22bar%22%3Emy+conference%3C%2FConference%3E", conference.toUrl());
    }
}

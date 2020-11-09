package com.automationanywhere.commands.tests;

import Utils.ParseResponse;
import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import Utils.HTTPRequest;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class MiscTests {

    public static void main(String[] args) throws IOException, ParseException, JSONException {


        /*String token = "xoxb-1260259361063-1268276135206-onTDt4inRH5wn1tqVoBnRENq";
        String channel = "C018FJEUFT3";
        List<String> messages = new ArrayList<>();
        channel = URLEncoder.encode(channel, StandardCharsets.UTF_8);

        //String url = "https://slack.com/api/conversations.history?token="+token+"&channel="+channel;
        //String response = HTTPRequest.Request(url, "GET");

        messages = ParseResponse.MessageHistoryStrings(token, messages, channel);


        System.out.println(messages);*/

    }
}


package io.digdag.plugin.hangouts;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.digdag.client.config.ConfigException;

import java.io.IOException;

class HangoutsChatMessageValidator
{
    static void validate(String jsonString)
    {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = null;

        try {
            root = mapper.readValue(jsonString, JsonNode.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!root.has("text") && !root.has("cards")) {
            throw new ConfigException("'text' or 'cards' is required for template for HangoutsChat's message");
        }
    }
}
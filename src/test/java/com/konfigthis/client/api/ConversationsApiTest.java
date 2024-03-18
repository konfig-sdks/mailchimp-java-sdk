/*
 * Mailchimp Marketing API
 * Mailchimp is a marketing platform for small businesses. It offers an all-in-one marketing solution that includes email marketing, ads, landing pages, and automation. With Mailchimp, businesses can design and send targeted campaigns, analyze their performance, and grow their audience.
 *
 * The version of the OpenAPI document: 3.0.55
 * Contact: apihelp@mailchimp.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ConversationsGetAllConversations200Response;
import com.konfigthis.client.model.ConversationsGetAllConversationsResponse;
import com.konfigthis.client.model.ConversationsGetAllConversationsdefaultResponse;
import com.konfigthis.client.model.ConversationsGetById200Response;
import com.konfigthis.client.model.ConversationsGetByIdResponse;
import com.konfigthis.client.model.ConversationsGetByIddefaultResponse;
import com.konfigthis.client.model.ConversationsGetMessageById200Response;
import com.konfigthis.client.model.ConversationsGetMessageByIdResponse;
import com.konfigthis.client.model.ConversationsGetMessageByIddefaultResponse;
import com.konfigthis.client.model.ConversationsListMessagesFromConversation200Response;
import com.konfigthis.client.model.ConversationsListMessagesFromConversationResponse;
import com.konfigthis.client.model.ConversationsListMessagesFromConversationdefaultResponse;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConversationsApi
 */
@Disabled
public class ConversationsApiTest {

    private static ConversationsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ConversationsApi(apiClient);
    }

    /**
     * List conversations
     *
     * Get a list of conversations for the account. Conversations has been deprecated in favor of Inbox and these endpoints don&#39;t include Inbox data. Past Conversations are still available via this endpoint, but new campaign replies and other Inbox messages aren’t available using this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllConversationsTest() throws ApiException {
        List<String> fields = null;
        List<String> excludeFields = null;
        Integer count = null;
        Integer offset = null;
        String hasUnreadMessages = null;
        String listId = null;
        String campaignId = null;
        ConversationsGetAllConversationsResponse response = api.getAllConversations()
                .fields(fields)
                .excludeFields(excludeFields)
                .count(count)
                .offset(offset)
                .hasUnreadMessages(hasUnreadMessages)
                .listId(listId)
                .campaignId(campaignId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get conversation
     *
     * Get details about an individual conversation. Conversations has been deprecated in favor of Inbox and these endpoints don&#39;t include Inbox data. Past Conversations are still available via this endpoint, but new campaign replies and other Inbox messages aren’t available using this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String conversationId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        ConversationsGetByIdResponse response = api.getById(conversationId)
                .fields(fields)
                .excludeFields(excludeFields)
                .execute();
        // TODO: test validations
    }

    /**
     * Get message
     *
     * Get an individual message in a conversation. Conversations has been deprecated in favor of Inbox and these endpoints don&#39;t include Inbox data. Past Conversations are still available via this endpoint, but new campaign replies and other Inbox messages aren’t available using this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMessageByIdTest() throws ApiException {
        String conversationId = null;
        String messageId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        ConversationsGetMessageByIdResponse response = api.getMessageById(conversationId, messageId)
                .fields(fields)
                .excludeFields(excludeFields)
                .execute();
        // TODO: test validations
    }

    /**
     * List messages
     *
     * Get messages from a specific conversation. Conversations has been deprecated in favor of Inbox and these endpoints don&#39;t include Inbox data. Past Conversations are still available via this endpoint, but new campaign replies and other Inbox messages aren’t available using this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMessagesFromConversationTest() throws ApiException {
        String conversationId = null;
        List<String> fields = null;
        List<String> excludeFields = null;
        String isRead = null;
        OffsetDateTime beforeTimestamp = null;
        OffsetDateTime sinceTimestamp = null;
        ConversationsListMessagesFromConversationResponse response = api.listMessagesFromConversation(conversationId)
                .fields(fields)
                .excludeFields(excludeFields)
                .isRead(isRead)
                .beforeTimestamp(beforeTimestamp)
                .sinceTimestamp(sinceTimestamp)
                .execute();
        // TODO: test validations
    }

}

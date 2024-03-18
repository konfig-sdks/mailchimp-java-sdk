package com.konfigthis.client;

import com.konfigthis.client.api.SurveysApi;
import com.konfigthis.client.api.AccountExportApi;
import com.konfigthis.client.api.AccountExportsApi;
import com.konfigthis.client.api.ActivityFeedApi;
import com.konfigthis.client.api.AuthorizedAppsApi;
import com.konfigthis.client.api.AutomationsApi;
import com.konfigthis.client.api.BatchWebhooksApi;
import com.konfigthis.client.api.BatchesApi;
import com.konfigthis.client.api.CampaignFoldersApi;
import com.konfigthis.client.api.CampaignsApi;
import com.konfigthis.client.api.ConnectedSitesApi;
import com.konfigthis.client.api.ConversationsApi;
import com.konfigthis.client.api.CustomerJourneysApi;
import com.konfigthis.client.api.EcommerceApi;
import com.konfigthis.client.api.FacebookAdsApi;
import com.konfigthis.client.api.FileManagerApi;
import com.konfigthis.client.api.LandingPagesApi;
import com.konfigthis.client.api.ListsApi;
import com.konfigthis.client.api.PingApi;
import com.konfigthis.client.api.ReportingApi;
import com.konfigthis.client.api.ReportsApi;
import com.konfigthis.client.api.RootApi;
import com.konfigthis.client.api.SearchCampaignsApi;
import com.konfigthis.client.api.SearchMembersApi;
import com.konfigthis.client.api.TemplateFoldersApi;
import com.konfigthis.client.api.TemplatesApi;
import com.konfigthis.client.api.VerifiedDomainsApi;

public class Mailchimp {
    private ApiClient apiClient;
    public final SurveysApi surveys;
    public final AccountExportApi accountExport;
    public final AccountExportsApi accountExports;
    public final ActivityFeedApi activityFeed;
    public final AuthorizedAppsApi authorizedApps;
    public final AutomationsApi automations;
    public final BatchWebhooksApi batchWebhooks;
    public final BatchesApi batches;
    public final CampaignFoldersApi campaignFolders;
    public final CampaignsApi campaigns;
    public final ConnectedSitesApi connectedSites;
    public final ConversationsApi conversations;
    public final CustomerJourneysApi customerJourneys;
    public final EcommerceApi ecommerce;
    public final FacebookAdsApi facebookAds;
    public final FileManagerApi fileManager;
    public final LandingPagesApi landingPages;
    public final ListsApi lists;
    public final PingApi ping;
    public final ReportingApi reporting;
    public final ReportsApi reports;
    public final RootApi root;
    public final SearchCampaignsApi searchCampaigns;
    public final SearchMembersApi searchMembers;
    public final TemplateFoldersApi templateFolders;
    public final TemplatesApi templates;
    public final VerifiedDomainsApi verifiedDomains;

    public Mailchimp() {
        this(null);
    }

    public Mailchimp(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.surveys = new SurveysApi(this.apiClient);
        this.accountExport = new AccountExportApi(this.apiClient);
        this.accountExports = new AccountExportsApi(this.apiClient);
        this.activityFeed = new ActivityFeedApi(this.apiClient);
        this.authorizedApps = new AuthorizedAppsApi(this.apiClient);
        this.automations = new AutomationsApi(this.apiClient);
        this.batchWebhooks = new BatchWebhooksApi(this.apiClient);
        this.batches = new BatchesApi(this.apiClient);
        this.campaignFolders = new CampaignFoldersApi(this.apiClient);
        this.campaigns = new CampaignsApi(this.apiClient);
        this.connectedSites = new ConnectedSitesApi(this.apiClient);
        this.conversations = new ConversationsApi(this.apiClient);
        this.customerJourneys = new CustomerJourneysApi(this.apiClient);
        this.ecommerce = new EcommerceApi(this.apiClient);
        this.facebookAds = new FacebookAdsApi(this.apiClient);
        this.fileManager = new FileManagerApi(this.apiClient);
        this.landingPages = new LandingPagesApi(this.apiClient);
        this.lists = new ListsApi(this.apiClient);
        this.ping = new PingApi(this.apiClient);
        this.reporting = new ReportingApi(this.apiClient);
        this.reports = new ReportsApi(this.apiClient);
        this.root = new RootApi(this.apiClient);
        this.searchCampaigns = new SearchCampaignsApi(this.apiClient);
        this.searchMembers = new SearchMembersApi(this.apiClient);
        this.templateFolders = new TemplateFoldersApi(this.apiClient);
        this.templates = new TemplatesApi(this.apiClient);
        this.verifiedDomains = new VerifiedDomainsApi(this.apiClient);
    }

}

package GamingShop.model.concretes;

public class Campaign extends BaseEntity{
    private String campaignName;
    private int campaignLifeDay;
    private int campaignLifeHour;
    private String getCampaignHeader;

    public Campaign(String campaignName, int campaignLifeDay, int campaignLifeHour, String getCampaignHeader) {
        this.campaignName = campaignName;
        this.campaignLifeDay = campaignLifeDay;
        this.campaignLifeHour = campaignLifeHour;
        this.getCampaignHeader = getCampaignHeader;
    }

    public Campaign() {
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getCampaignLifeDay() {
        return campaignLifeDay;
    }

    public void setCampaignLifeDay(int campaignLifeDay) {
        this.campaignLifeDay = campaignLifeDay;
    }

    public int getCampaignLifeHour() {
        return campaignLifeHour;
    }

    public void setCampaignLifeHour(int campaignLifeHour) {
        this.campaignLifeHour = campaignLifeHour;
    }

    public String getGetCampaignHeader() {
        return getCampaignHeader;
    }

    public void setGetCampaignHeader(String getCampaignHeader) {
        this.getCampaignHeader = getCampaignHeader;
    }
}

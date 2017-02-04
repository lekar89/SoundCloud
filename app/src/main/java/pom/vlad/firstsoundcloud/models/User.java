package pom.vlad.firstsoundcloud.models;


public class User {
    private int mId, mTrackCount, mPlaylistCount, mFollowersCount, mFollowingsCount, mPublicFavoritesCount;


    private String
            mPermaLink, mUsername, mCountry, mFullName, mCity, mDscription, mDiscogsName, mMyspaceName,
            mURI, mPermalinkUrl, mAvatarUrl, mWebsite, mWebsiteTitle;

    private boolean mOnline;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getTrackCount() {
        return mTrackCount;
    }

    public void setTrackCount(int trackCount) {
        mTrackCount = trackCount;
    }

    public int getPlaylistCount() {
        return mPlaylistCount;
    }

    public void setPlaylistCount(int playlistCount) {
        mPlaylistCount = playlistCount;
    }

    public int getFollowersCount() {
        return mFollowersCount;
    }

    public void setFollowersCount(int followersCount) {
        mFollowersCount = followersCount;
    }

    public int getFollowingsCount() {
        return mFollowingsCount;
    }

    public void setFollowingsCount(int followingsCount) {
        mFollowingsCount = followingsCount;
    }

    public int getPublicFavoritesCount() {
        return mPublicFavoritesCount;
    }

    public void setPublicFavoritesCount(int publicFavoritesCount) {
        mPublicFavoritesCount = publicFavoritesCount;
    }

    public String getPermaLink() {
        return mPermaLink;
    }

    public void setPermaLink(String permaLink) {
        mPermaLink = permaLink;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        mUsername = username;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getFullName() {
        return mFullName;
    }

    public void setFullName(String fullName) {
        mFullName = fullName;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getDscription() {
        return mDscription;
    }

    public void setDscription(String dscription) {
        mDscription = dscription;
    }

    public String getDiscogsName() {
        return mDiscogsName;
    }

    public void setDiscogsName(String discogsName) {
        mDiscogsName = discogsName;
    }

    public String getMyspaceName() {
        return mMyspaceName;
    }

    public void setMyspaceName(String myspaceName) {
        mMyspaceName = myspaceName;
    }

    public String getURI() {
        return mURI;
    }

    public void setURI(String URI) {
        mURI = URI;
    }

    public String getPermalinkUrl() {
        return mPermalinkUrl;
    }

    public void setPermalinkUrl(String permalinkUrl) {
        mPermalinkUrl = permalinkUrl;
    }

    public String getAvatarUrl() {
        return mAvatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        mAvatarUrl = avatarUrl;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public void setWebsite(String website) {
        mWebsite = website;
    }

    public String getWebsiteTitle() {
        return mWebsiteTitle;
    }

    public void setWebsiteTitle(String websiteTitle) {
        mWebsiteTitle = websiteTitle;
    }

    public boolean isOnline() {
        return mOnline;
    }

    public void setOnline(boolean online) {
        this.mOnline = online;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return mId == user.mId;

    }

    @Override
    public int hashCode() {
        return mId;
    }


}

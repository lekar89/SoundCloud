package pom.vlad.firstsoundcloud.models;


public class Apps {

    private int
            mId;

    private String
            mKind, mName, mUri, mPermaLinkUrl, mExternalUrl, mCreator;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmKind() {
        return mKind;
    }

    public void setmKind(String mKind) {
        this.mKind = mKind;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmUri() {
        return mUri;
    }

    public void setmUri(String mUri) {
        this.mUri = mUri;
    }

    public String getmPermaLinkUrl() {
        return mPermaLinkUrl;
    }

    public void setmPermaLinkUrl(String mPermaLinkUrl) {
        this.mPermaLinkUrl = mPermaLinkUrl;
    }

    public String getmExternalUrl() {
        return mExternalUrl;
    }

    public void setmExternalUrl(String mExternalUrl) {
        this.mExternalUrl = mExternalUrl;
    }

    public String getmCreator() {
        return mCreator;
    }

    public void setmCreator(String mCreator) {
        this.mCreator = mCreator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apps apps = (Apps) o;

        return mId == apps.mId;

    }

    @Override
    public int hashCode() {
        return mId;
    }
}

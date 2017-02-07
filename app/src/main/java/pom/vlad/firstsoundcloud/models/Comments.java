package pom.vlad.firstsoundcloud.models;

public class Comments {

    private int
            mId, mUser_id, mTrackId, mTimestamp;

    private String
            mCreateAt, mBody, mUri;

    User mUser;



    public String getmCreateAt() {
        return mCreateAt;
    }

    public void setmCreateAt(String mCreateAt) {
        this.mCreateAt = mCreateAt;
    }

    public String getmBody() {
        return mBody;
    }

    public void setmBody(String mBody) {
        this.mBody = mBody;
    }

    public String getmUri() {
        return mUri;
    }

    public void setmUri(String mUri) {
        this.mUri = mUri;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getmUser_id() {
        return mUser_id;
    }

    public void setmUser_id(int mUser_id) {
        this.mUser_id = mUser_id;
    }

    public int getmTrackId() {
        return mTrackId;
    }

    public void setmTrackId(int mTrackId) {
        this.mTrackId = mTrackId;
    }

    public int getmTimestamp() {
        return mTimestamp;
    }

    public void setmTimestamp(int mTimestamp) {
        this.mTimestamp = mTimestamp;
    }

    public User getmUser() {
        return mUser;
    }

    public void setmUser(User mUser) {
        this.mUser = mUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comments comments = (Comments) o;

        return mId == comments.mId;

    }

    @Override
    public int hashCode() {
        return mId;
    }
}

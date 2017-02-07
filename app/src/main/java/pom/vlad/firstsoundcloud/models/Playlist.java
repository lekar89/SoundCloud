package pom.vlad.firstsoundcloud.models;

import java.util.List;


public class Playlist {

    private int
            mId,mDuration, mTrackCount,mUserId;

    private String
            mKind, mCreateAt, mSharing, mPermalink, mPurchaseUrl, mLabelId, mType, mPlaylistType,
            mEan, mDescription, mGenre, mRelease, mPurchaseTitle, mLabel_name, mTitle, mReleaseYear,
            mReleaseMonth, mReleaseDay, mLicense, mUri, mPermalinkUrl, mArtworkUrl, mEmbeddableBy;

    private boolean
            mStreamable, mDownloadable;

    private User mUser;
    private List<Tracks> mTracks;



    public int getmDuration() {
        return mDuration;
    }

    public void setmDuration(int mDuration) {
        this.mDuration = mDuration;
    }

    public String getmKind() {
        return mKind;
    }

    public void setmKinde(String mKide) {
        this.mKind = mKide;
    }

    public String getmCreateAt() {
        return mCreateAt;
    }

    public void setmCreateAt(String mCreateAt) {
        this.mCreateAt = mCreateAt;
    }

    public String getmSharing() {
        return mSharing;
    }

    public void setmSharing(String mSharing) {
        this.mSharing = mSharing;
    }

    public String getmPermalink() {
        return mPermalink;
    }

    public void setmPermalink(String mPermalink) {
        this.mPermalink = mPermalink;
    }

    public String getmPurchaseUrl() {
        return mPurchaseUrl;
    }

    public void setmPurchaseUrl(String mPurchaseUrl) {
        this.mPurchaseUrl = mPurchaseUrl;
    }

    public String getmLabelId() {
        return mLabelId;
    }

    public void setmLabelId(String mLabelId) {
        this.mLabelId = mLabelId;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public String getmPlaylistType() {
        return mPlaylistType;
    }

    public void setmPlaylistType(String mPlaylistType) {
        this.mPlaylistType = mPlaylistType;
    }

    public String getmEan() {
        return mEan;
    }

    public void setmEan(String mEan) {
        this.mEan = mEan;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public String getmRelease() {
        return mRelease;
    }

    public void setmRelease(String mRelease) {
        this.mRelease = mRelease;
    }

    public String getmPurchaseTitle() {
        return mPurchaseTitle;
    }

    public void setmPurchaseTitle(String mPurchaseTitle) {
        this.mPurchaseTitle = mPurchaseTitle;
    }

    public String getmLabel_name() {
        return mLabel_name;
    }

    public void setmLabel_name(String mLabel_name) {
        this.mLabel_name = mLabel_name;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmReleaseYear() {
        return mReleaseYear;
    }

    public void setmReleaseYear(String mReleaseYear) {
        this.mReleaseYear = mReleaseYear;
    }

    public String getmReleaseMonth() {
        return mReleaseMonth;
    }

    public void setmReleaseMonth(String mReleaseMonth) {
        this.mReleaseMonth = mReleaseMonth;
    }

    public String getmReleaseDay() {
        return mReleaseDay;
    }

    public void setmReleaseDay(String mReleaseDay) {
        this.mReleaseDay = mReleaseDay;
    }

    public String getmLicense() {
        return mLicense;
    }

    public void setmLicense(String mLicense) {
        this.mLicense = mLicense;
    }

    public String getmUri() {
        return mUri;
    }

    public void setmUri(String mUri) {
        this.mUri = mUri;
    }

    public String getmPermalinkUrl() {
        return mPermalinkUrl;
    }

    public void setmPermalinkUrl(String mPermalinkUrl) {
        this.mPermalinkUrl = mPermalinkUrl;
    }

    public String getmArtworkUrl() {
        return mArtworkUrl;
    }

    public void setmArtworkUrl(String mArtworkUrl) {
        this.mArtworkUrl = mArtworkUrl;
    }

    public String getmEmbeddableBy() {
        return mEmbeddableBy;
    }

    public void setmEmbeddableBy(String mEmbeddableBy) {
        this.mEmbeddableBy = mEmbeddableBy;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getmUserId() {
        return mUserId;
    }

    public void setmUserId(int mUserId) {
        this.mUserId = mUserId;
    }

    public int getmTrackCount() {
        return mTrackCount;
    }

    public void setmTrackCount(int mTrackCount) {
        this.mTrackCount = mTrackCount;
    }

    public boolean ismStreamable() {
        return mStreamable;
    }

    public void setmStreamable(boolean mStreamable) {
        this.mStreamable = mStreamable;
    }

    public boolean ismDownloadable() {
        return mDownloadable;
    }

    public void setmDownloadable(boolean mDownloadable) {
        this.mDownloadable = mDownloadable;
    }

    public User getmUser() {
        return mUser;
    }

    public void setmUser(User mUser) {
        this.mUser = mUser;
    }

    public List<Tracks> getmTracks() {
        return mTracks;
    }

    public void setmTracks(List<Tracks> mTracks) {
        this.mTracks = mTracks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Playlist playlist = (Playlist) o;

        return mId == playlist.mId;

    }

    @Override
    public int hashCode() {
        return mId;
    }
}

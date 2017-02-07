package pom.vlad.firstsoundcloud.models;


public class Tracks {

    private int
            mId, mDuration, mUserId, mOriginalContentSize, mPlaybackCount, mDownloadCount,
            mFavoritingsCount, mCommentCount, mBpm ;

    private String
            mCreatedAt, mState, mSharing, mTagList, mPermalink, mDescription, mGenre, mRelease,
            mPurchaseUrl, mLabelId, mLabelIName, mIsrc, mVideoUrl, mTackType, mKeySignature,
            mTitle, mReleaseYear, mReleaseMonth, mReleaseDay, mOriginalFormat, mLicense, mUri,
            mPermalinkUrl, mArtworkUrl, mWaveformUrl, mStreamUrl, mDownloadUrl, mAttachmentsUri ;

    private  boolean
            mCommentable, mStreamable, mSownloadable ;

    private  User mUser;



    public User getmUser() {
        return mUser;
    }

    public void setmUser(User mUser) {
        this.mUser = mUser;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getmDuration() {
        return mDuration;
    }

    public void setmDuration(int mDuration) {
        this.mDuration = mDuration;
    }

    public int getmUserId() {
        return mUserId;
    }

    public void setmUserId(int mUserId) {
        this.mUserId = mUserId;
    }

    public int getmOriginalContentSize() {
        return mOriginalContentSize;
    }

    public void setmOriginalContentSize(int mOriginalContentSize) {
        this.mOriginalContentSize = mOriginalContentSize;
    }

    public int getmPlaybackCount() {
        return mPlaybackCount;
    }

    public void setmPlaybackCount(int mPlaybackCount) {
        this.mPlaybackCount = mPlaybackCount;
    }

    public int getmDownloadCount() {
        return mDownloadCount;
    }

    public void setmDownloadCount(int mDownloadCount) {
        this.mDownloadCount = mDownloadCount;
    }

    public int getmFavoritingsCount() {
        return mFavoritingsCount;
    }

    public void setmFavoritingsCount(int mFavoritingsCount) {
        this.mFavoritingsCount = mFavoritingsCount;
    }

    public int getmCommentCount() {
        return mCommentCount;
    }

    public void setmCommentCount(int mCommentCount) {
        this.mCommentCount = mCommentCount;
    }

    public String getmCreatedAt() {
        return mCreatedAt;
    }

    public void setmCreatedAt(String mCreatedAt) {
        this.mCreatedAt = mCreatedAt;
    }

    public String getmState() {
        return mState;
    }

    public void setmState(String mState) {
        this.mState = mState;
    }

    public String getmSharing() {
        return mSharing;
    }

    public void setmSharing(String mSharing) {
        this.mSharing = mSharing;
    }

    public String getmTagList() {
        return mTagList;
    }

    public void setmTagList(String mTagList) {
        this.mTagList = mTagList;
    }

    public String getmPermalink() {
        return mPermalink;
    }

    public void setmPermalink(String mPermalink) {
        this.mPermalink = mPermalink;
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

    public String getmLabelIName() {
        return mLabelIName;
    }

    public void setmLabelIName(String mLabelIName) {
        this.mLabelIName = mLabelIName;
    }

    public String getmIsrc() {
        return mIsrc;
    }

    public void setmIsrc(String mIsrc) {
        this.mIsrc = mIsrc;
    }

    public String getmVideoUrl() {
        return mVideoUrl;
    }

    public void setmVideoUrl(String mVideoUrl) {
        this.mVideoUrl = mVideoUrl;
    }

    public String getmTackType() {
        return mTackType;
    }

    public void setmTackType(String mTackType) {
        this.mTackType = mTackType;
    }

    public String getmKeySignature() {
        return mKeySignature;
    }

    public void setmKeySignature(String mKeySignature) {
        this.mKeySignature = mKeySignature;
    }

    public int getmBpm() {
        return mBpm;
    }

    public void setmBpm(int mBpm) {
        this.mBpm = mBpm;
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

    public String getmOriginalFormat() {
        return mOriginalFormat;
    }

    public void setmOriginalFormat(String mOriginalFormat) {
        this.mOriginalFormat = mOriginalFormat;
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

    public String getmWaveformUrl() {
        return mWaveformUrl;
    }

    public void setmWaveformUrl(String mWaveformUrl) {
        this.mWaveformUrl = mWaveformUrl;
    }

    public String getmStreamUrl() {
        return mStreamUrl;
    }

    public void setmStreamUrl(String mStreamUrl) {
        this.mStreamUrl = mStreamUrl;
    }

    public String getmDownloadUrl() {
        return mDownloadUrl;
    }

    public void setmDownloadUrl(String mDownloadUrl) {
        this.mDownloadUrl = mDownloadUrl;
    }

    public String getmAttachmentsUri() {
        return mAttachmentsUri;
    }

    public void setmAttachmentsUri(String mAttachmentsUri) {
        this.mAttachmentsUri = mAttachmentsUri;
    }

    public boolean ismCommentable() {
        return mCommentable;
    }

    public void setmCommentable(boolean mCommentable) {
        this.mCommentable = mCommentable;
    }

    public boolean ismStreamable() {
        return mStreamable;
    }

    public void setmStreamable(boolean mStreamable) {
        this.mStreamable = mStreamable;
    }

    public boolean ismSownloadable() {
        return mSownloadable;
    }

    public void setmSownloadable(boolean mSownloadable) {
        this.mSownloadable = mSownloadable;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tracks tracks = (Tracks) o;

        return mId == tracks.mId;

    }

    @Override
    public int hashCode() {
        return mId;
    }

}

package pom.vlad.firstsoundcloud.models;


public class Me  extends User{


    //!!! class contains the same fields as User plus this:


    private int mPrivateTracksCount, mPrivatePlayListsCount;

    private  String mPlan;

    private boolean mPrimaryEmailConfirmed;



    public String getmPlan() {
        return mPlan;
    }

    public void setmPlan(String mPlan) {
        this.mPlan = mPlan;
    }

    public boolean ismPrimaryEmailConfirmed() {
        return mPrimaryEmailConfirmed;
    }

    public void setmPrimaryEmailConfirmed(boolean mPrimaryEmailConfirmed) {
        this.mPrimaryEmailConfirmed = mPrimaryEmailConfirmed;
    }

    public int getmPrivateTracksCount() {
        return mPrivateTracksCount;
    }

    public void setmPrivateTracksCount(int mPrivateTracksCount) {
        this.mPrivateTracksCount = mPrivateTracksCount;
    }

    public int getmPrivatePlayListsCount() {
        return mPrivatePlayListsCount;
    }

    public void setmPrivatePlayListsCount(int mPrivatePlayListsCount) {
        this.mPrivatePlayListsCount = mPrivatePlayListsCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Me me = (Me) o;

        return getId()==me.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}

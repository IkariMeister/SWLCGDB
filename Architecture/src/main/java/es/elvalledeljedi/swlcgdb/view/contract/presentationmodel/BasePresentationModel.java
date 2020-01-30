package es.elvalledeljedi.swlcgdb.view.contract.presentationmodel;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jcgarcia on 23/05/2016.
 */
public class BasePresentationModel implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
    public BasePresentationModel() {
    }

    protected BasePresentationModel(Parcel in) {
    }

    public static final Parcelable.Creator<BasePresentationModel> CREATOR =
            new Parcelable.Creator<BasePresentationModel>() {
                public BasePresentationModel createFromParcel(Parcel source) {
                    return new BasePresentationModel(source);
                }

                public BasePresentationModel[] newArray(int size) {
                    return new BasePresentationModel[size];
                }
            };
}

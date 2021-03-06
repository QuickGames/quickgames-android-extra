package quickgames.activity.extra;

import android.support.annotation.NonNull;

@Deprecated
public final class Version {

    //region CONSTRUCTOR

    private Version() {
    }

    static {
        _version = "0.0.0";
        _build = 1;
        _date = "29.04.2018";
    }

    //endregion

    //region BUILD

    private static int _build;

    public static int getBuild() {
        return _build;
    }

    //endregion

    //region VERSION

    private static String _version;

    public static String getVersion() {
        return _version;
    }

    @NonNull
    public static String getFullVersion() {
        return getVersion() + "." + getBuild();
    }

    //endregion

    //region DATE

    private static String _date;

    public static String getDate() {
        return _date;
    }

    //endregion

    //region GET_VERSION

    @NonNull
    public static String get(String pre) {
        return pre + ": " + getFullVersion() + "; " + getDate();
    }

    @NonNull
    public static String get() {
        return get("Version");
    }

    //endregion
}
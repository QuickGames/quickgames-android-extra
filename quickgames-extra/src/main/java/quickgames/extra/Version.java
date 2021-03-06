package quickgames.extra;

import android.support.annotation.NonNull;

public final class Version {

    //region CONSTRUCTOR

    private Version() {
    }

    static {
        Version.s_version = "0.0.2";
        Version.s_build = 2;
        Version.s_date = "30.04.2018";
    }

    //endregion

    //region BUILD

    private static int s_build;

    public static int getBuild() {
        return s_build;
    }

    //endregion

    //region VERSION

    private static String s_version;

    public static String getVersion() {
        return s_version;
    }

    @NonNull
    public static String getFullVersion() {
        return getVersion() + "." + getBuild();
    }

    //endregion

    //region DATE

    private static String s_date;

    public static String getDate() {
        return s_date;
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
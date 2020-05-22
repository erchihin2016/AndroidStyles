package com.example.androidstyles;

public class Utils {

    private static int sTheme;

    public final static int THEME_GREEN = 0;
    public final static int THEME_BLACK = 1;
    public final static int THEME_BLUE = 2;

    public static void changeToTheme(MainActivity activity, int theme) {
        sTheme = theme;
        activity.recreate();
    }

    public static void onActivityCreateSetTheme(MainActivity activity) {
        switch (sTheme) {
            default:
            case THEME_GREEN:
                activity.setTheme(R.style.AppThemeGreen);
                break;
            case THEME_BLACK:
                activity.setTheme(R.style.AppThemeBlack);
                break;
            case THEME_BLUE:
                activity.setTheme(R.style.AppThemeBlue);
                break;
        }
    }
}
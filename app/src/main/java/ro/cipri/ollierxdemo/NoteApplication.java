package ro.cipri.ollierxdemo;

import android.app.Application;

import ollie.Ollie;
import ro.cipri.ollierxdemo.domain.Note;

/**
 * Created by ciprian.grigor on 11/03/15.
 */
public class NoteApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Ollie.init(this, "noteDB", 1, Ollie.LogLevel.FULL);
        Note.populateDummy();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}

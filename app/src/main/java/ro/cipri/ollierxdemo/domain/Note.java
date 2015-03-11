package ro.cipri.ollierxdemo.domain;

import ollie.Model;
import ollie.annotation.Column;
import ollie.annotation.Table;
import rx.schedulers.Schedulers;

/**
 * Created by ciprian.grigor on 11/03/15.
 */
@Table("notes")
public class Note extends Model {
    @Column("title")
    public String title;
    @Column("body")
    public String body;

    @Override
    public String toString() {
        return title;
    }
    
    public static void populateDummy() {

        Schedulers.io().createWorker().schedule(() -> {
            for (int i = 0; i < 10; i++) {
                Note note = new Note();
                note.title = "hello" + i;
                note.body = "Hello World" + i;
                note.save();
            }
        });

    }
}

package e.y.data;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
@Database(entities = {UserTable.class},version = 1)
public abstract class Databaseclass extends RoomDatabase{
    public abstract DataAccessObject daobj();
    public static Databaseclass INSTANCE;

}

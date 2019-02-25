package e.y.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface DataAccessObject {
    @Insert
    void adduser(UserTable ut);

    @Query("select * from UserTable")
    public List<UserTable> ViewDataFromTable();
    @Delete
    public void DeleteData(UserTable ut);

    @Update
    public void UpdateUserData(UserTable ut);



}

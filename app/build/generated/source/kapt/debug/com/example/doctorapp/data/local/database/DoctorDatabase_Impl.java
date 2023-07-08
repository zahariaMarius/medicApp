package com.example.doctorapp.data.local.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.doctorapp.data.local.dao.DoctorDao;
import com.example.doctorapp.data.local.dao.DoctorDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class DoctorDatabase_Impl extends DoctorDatabase {
  private volatile DoctorDao _doctorDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `DoctorEntity` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `surname` TEXT NOT NULL, `email` TEXT NOT NULL, `fiscalCode` TEXT NOT NULL, `gender` TEXT, `birthdayDate` INTEGER, `regionalCode` TEXT NOT NULL, `ASL` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '124200247170ee0fb0b5ef9f1499c108')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `DoctorEntity`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDoctorEntity = new HashMap<String, TableInfo.Column>(9);
        _columnsDoctorEntity.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDoctorEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDoctorEntity.put("surname", new TableInfo.Column("surname", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDoctorEntity.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDoctorEntity.put("fiscalCode", new TableInfo.Column("fiscalCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDoctorEntity.put("gender", new TableInfo.Column("gender", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDoctorEntity.put("birthdayDate", new TableInfo.Column("birthdayDate", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDoctorEntity.put("regionalCode", new TableInfo.Column("regionalCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDoctorEntity.put("ASL", new TableInfo.Column("ASL", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDoctorEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDoctorEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDoctorEntity = new TableInfo("DoctorEntity", _columnsDoctorEntity, _foreignKeysDoctorEntity, _indicesDoctorEntity);
        final TableInfo _existingDoctorEntity = TableInfo.read(_db, "DoctorEntity");
        if (! _infoDoctorEntity.equals(_existingDoctorEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "DoctorEntity(com.example.doctorapp.data.local.entity.DoctorEntity).\n"
                  + " Expected:\n" + _infoDoctorEntity + "\n"
                  + " Found:\n" + _existingDoctorEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "124200247170ee0fb0b5ef9f1499c108", "13947241824d216d126cc70f355dde7e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "DoctorEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `DoctorEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(DoctorDao.class, DoctorDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public DoctorDao getDao() {
    if (_doctorDao != null) {
      return _doctorDao;
    } else {
      synchronized(this) {
        if(_doctorDao == null) {
          _doctorDao = new DoctorDao_Impl(this);
        }
        return _doctorDao;
      }
    }
  }
}

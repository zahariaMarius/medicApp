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
import com.example.doctorapp.data.local.dao.RemoteKeyDao;
import com.example.doctorapp.data.local.dao.RemoteKeyDao_Impl;
import com.example.doctorapp.data.local.dao.VisitDao;
import com.example.doctorapp.data.local.dao.VisitDao_Impl;
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
public final class VisitDatabase_Impl extends VisitDatabase {
  private volatile VisitDao _visitDao;

  private volatile RemoteKeyDao _remoteKeyDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `VisitEntity` (`id` TEXT NOT NULL, `dateTime` INTEGER NOT NULL, `doctorName` TEXT NOT NULL, `doctorSurname` TEXT NOT NULL, `doctorFiscalCode` TEXT NOT NULL, `status` TEXT NOT NULL, `online` INTEGER NOT NULL, `urlMeet` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `remotekeyentity` (`id` TEXT NOT NULL, `prevPage` INTEGER, `nextPage` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'db430daed84e05d095964461df3008f1')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `VisitEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `remotekeyentity`");
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
        final HashMap<String, TableInfo.Column> _columnsVisitEntity = new HashMap<String, TableInfo.Column>(8);
        _columnsVisitEntity.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisitEntity.put("dateTime", new TableInfo.Column("dateTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisitEntity.put("doctorName", new TableInfo.Column("doctorName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisitEntity.put("doctorSurname", new TableInfo.Column("doctorSurname", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisitEntity.put("doctorFiscalCode", new TableInfo.Column("doctorFiscalCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisitEntity.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisitEntity.put("online", new TableInfo.Column("online", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVisitEntity.put("urlMeet", new TableInfo.Column("urlMeet", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysVisitEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesVisitEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoVisitEntity = new TableInfo("VisitEntity", _columnsVisitEntity, _foreignKeysVisitEntity, _indicesVisitEntity);
        final TableInfo _existingVisitEntity = TableInfo.read(_db, "VisitEntity");
        if (! _infoVisitEntity.equals(_existingVisitEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "VisitEntity(com.example.doctorapp.data.local.entity.VisitEntity).\n"
                  + " Expected:\n" + _infoVisitEntity + "\n"
                  + " Found:\n" + _existingVisitEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsRemotekeyentity = new HashMap<String, TableInfo.Column>(3);
        _columnsRemotekeyentity.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRemotekeyentity.put("prevPage", new TableInfo.Column("prevPage", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRemotekeyentity.put("nextPage", new TableInfo.Column("nextPage", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRemotekeyentity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRemotekeyentity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRemotekeyentity = new TableInfo("remotekeyentity", _columnsRemotekeyentity, _foreignKeysRemotekeyentity, _indicesRemotekeyentity);
        final TableInfo _existingRemotekeyentity = TableInfo.read(_db, "remotekeyentity");
        if (! _infoRemotekeyentity.equals(_existingRemotekeyentity)) {
          return new RoomOpenHelper.ValidationResult(false, "remotekeyentity(com.example.doctorapp.data.local.entity.RemoteKeyEntity).\n"
                  + " Expected:\n" + _infoRemotekeyentity + "\n"
                  + " Found:\n" + _existingRemotekeyentity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "db430daed84e05d095964461df3008f1", "f28601e4ea0f5ad0d5f5c591bf49b3fd");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "VisitEntity","remotekeyentity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `VisitEntity`");
      _db.execSQL("DELETE FROM `remotekeyentity`");
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
    _typeConvertersMap.put(VisitDao.class, VisitDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(RemoteKeyDao.class, RemoteKeyDao_Impl.getRequiredConverters());
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
  public VisitDao getVisitDao() {
    if (_visitDao != null) {
      return _visitDao;
    } else {
      synchronized(this) {
        if(_visitDao == null) {
          _visitDao = new VisitDao_Impl(this);
        }
        return _visitDao;
      }
    }
  }

  @Override
  public RemoteKeyDao getRemoteKeyDao() {
    if (_remoteKeyDao != null) {
      return _remoteKeyDao;
    } else {
      synchronized(this) {
        if(_remoteKeyDao == null) {
          _remoteKeyDao = new RemoteKeyDao_Impl(this);
        }
        return _remoteKeyDao;
      }
    }
  }
}

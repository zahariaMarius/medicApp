package com.example.doctorapp.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.doctorapp.data.local.entity.RemoteKeyEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class RemoteKeyDao_Impl implements RemoteKeyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RemoteKeyEntity> __insertionAdapterOfRemoteKeyEntity;

  private final SharedSQLiteStatement __preparedStmtOfClearAll;

  public RemoteKeyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRemoteKeyEntity = new EntityInsertionAdapter<RemoteKeyEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `remotekeyentity` (`id`,`prevPage`,`nextPage`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RemoteKeyEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getPrevPage() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getPrevPage());
        }
        if (value.getNextPage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getNextPage());
        }
      }
    };
    this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM remotekeyentity";
        return _query;
      }
    };
  }

  @Override
  public Object insertOrReplace(final List<RemoteKeyEntity> remoteKey,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRemoteKeyEntity.insert(remoteKey);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object clearAll(final Continuation<? super Unit> arg0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearAll.release(_stmt);
        }
      }
    }, arg0);
  }

  @Override
  public Object remoteKeyByQuery(final String id,
      final Continuation<? super RemoteKeyEntity> arg1) {
    final String _sql = "SELECT * FROM remotekeyentity WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<RemoteKeyEntity>() {
      @Override
      public RemoteKeyEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPrevPage = CursorUtil.getColumnIndexOrThrow(_cursor, "prevPage");
          final int _cursorIndexOfNextPage = CursorUtil.getColumnIndexOrThrow(_cursor, "nextPage");
          final RemoteKeyEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final Integer _tmpPrevPage;
            if (_cursor.isNull(_cursorIndexOfPrevPage)) {
              _tmpPrevPage = null;
            } else {
              _tmpPrevPage = _cursor.getInt(_cursorIndexOfPrevPage);
            }
            final Integer _tmpNextPage;
            if (_cursor.isNull(_cursorIndexOfNextPage)) {
              _tmpNextPage = null;
            } else {
              _tmpNextPage = _cursor.getInt(_cursorIndexOfNextPage);
            }
            _result = new RemoteKeyEntity(_tmpId,_tmpPrevPage,_tmpNextPage);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg1);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

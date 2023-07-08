package com.example.doctorapp.data.local.dao;

import android.database.Cursor;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.doctorapp.data.local.entity.VisitEntity;
import com.example.doctorapp.data.local.entity.converter.DateTypeConverter;
import com.example.doctorapp.domain.model.Status;
import java.lang.Class;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class VisitDao_Impl implements VisitDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<VisitEntity> __insertionAdapterOfVisitEntity;

  private final DateTypeConverter __dateTypeConverter = new DateTypeConverter();

  private final SharedSQLiteStatement __preparedStmtOfClearAll;

  public VisitDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfVisitEntity = new EntityInsertionAdapter<VisitEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `VisitEntity` (`id`,`dateTime`,`doctorName`,`doctorSurname`,`doctorFiscalCode`,`status`,`online`,`urlMeet`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, VisitEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        final Long _tmp = __dateTypeConverter.fromDate(value.getDateTime());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        if (value.getDoctorName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDoctorName());
        }
        if (value.getDoctorSurname() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDoctorSurname());
        }
        if (value.getDoctorFiscalCode() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDoctorFiscalCode());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, __Status_enumToString(value.getStatus()));
        }
        final int _tmp_1 = value.getOnline() ? 1 : 0;
        stmt.bindLong(7, _tmp_1);
        if (value.getUrlMeet() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUrlMeet());
        }
      }
    };
    this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM visitentity";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final List<VisitEntity> users, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfVisitEntity.insert(users);
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
  public PagingSource<Integer, VisitEntity> pagingSource() {
    final String _sql = "SELECT * FROM visitentity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<VisitEntity>(_statement, __db, "visitentity") {
      @Override
      protected List<VisitEntity> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfDateTime = CursorUtil.getColumnIndexOrThrow(cursor, "dateTime");
        final int _cursorIndexOfDoctorName = CursorUtil.getColumnIndexOrThrow(cursor, "doctorName");
        final int _cursorIndexOfDoctorSurname = CursorUtil.getColumnIndexOrThrow(cursor, "doctorSurname");
        final int _cursorIndexOfDoctorFiscalCode = CursorUtil.getColumnIndexOrThrow(cursor, "doctorFiscalCode");
        final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(cursor, "status");
        final int _cursorIndexOfOnline = CursorUtil.getColumnIndexOrThrow(cursor, "online");
        final int _cursorIndexOfUrlMeet = CursorUtil.getColumnIndexOrThrow(cursor, "urlMeet");
        final List<VisitEntity> _result = new ArrayList<VisitEntity>(cursor.getCount());
        while(cursor.moveToNext()) {
          final VisitEntity _item;
          final String _tmpId;
          if (cursor.isNull(_cursorIndexOfId)) {
            _tmpId = null;
          } else {
            _tmpId = cursor.getString(_cursorIndexOfId);
          }
          final Date _tmpDateTime;
          final Long _tmp;
          if (cursor.isNull(_cursorIndexOfDateTime)) {
            _tmp = null;
          } else {
            _tmp = cursor.getLong(_cursorIndexOfDateTime);
          }
          _tmpDateTime = __dateTypeConverter.toDate(_tmp);
          final String _tmpDoctorName;
          if (cursor.isNull(_cursorIndexOfDoctorName)) {
            _tmpDoctorName = null;
          } else {
            _tmpDoctorName = cursor.getString(_cursorIndexOfDoctorName);
          }
          final String _tmpDoctorSurname;
          if (cursor.isNull(_cursorIndexOfDoctorSurname)) {
            _tmpDoctorSurname = null;
          } else {
            _tmpDoctorSurname = cursor.getString(_cursorIndexOfDoctorSurname);
          }
          final String _tmpDoctorFiscalCode;
          if (cursor.isNull(_cursorIndexOfDoctorFiscalCode)) {
            _tmpDoctorFiscalCode = null;
          } else {
            _tmpDoctorFiscalCode = cursor.getString(_cursorIndexOfDoctorFiscalCode);
          }
          final Status _tmpStatus;
          _tmpStatus = __Status_stringToEnum(cursor.getString(_cursorIndexOfStatus));
          final boolean _tmpOnline;
          final int _tmp_1;
          _tmp_1 = cursor.getInt(_cursorIndexOfOnline);
          _tmpOnline = _tmp_1 != 0;
          final String _tmpUrlMeet;
          if (cursor.isNull(_cursorIndexOfUrlMeet)) {
            _tmpUrlMeet = null;
          } else {
            _tmpUrlMeet = cursor.getString(_cursorIndexOfUrlMeet);
          }
          _item = new VisitEntity(_tmpId,_tmpDateTime,_tmpDoctorName,_tmpDoctorSurname,_tmpDoctorFiscalCode,_tmpStatus,_tmpOnline,_tmpUrlMeet);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private String __Status_enumToString(final Status _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case PASSED: return "PASSED";
      case FUTURE: return "FUTURE";
      case CANCELLED: return "CANCELLED";
      default: throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }
  }

  private Status __Status_stringToEnum(final String _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case "PASSED": return Status.PASSED;
      case "FUTURE": return Status.FUTURE;
      case "CANCELLED": return Status.CANCELLED;
      default: throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
  }
}
